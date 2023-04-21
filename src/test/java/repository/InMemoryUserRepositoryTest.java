package repository;

import entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryUserRepositoryTest {

    UserRepository userRepository;

    @BeforeEach
    void SetUp()
    {
      userRepository = new InMemoryUserRepository();
      userRepository.addUser("192.168.1.1");
      userRepository.addUser("168.2.1.99");
        userRepository.addUser("100.10.10.90");
    }

    @Test
    void addUser()
    {
        List<User> users = userRepository.getUsers();
        assertTrue(users.contains(new User("192.168.1.1")));
    }

        @Test
    void saveActionUser()
        {
            userRepository.saveActionUser("192.168.1.1");
            User user = userRepository.getUser("192.168.1.1").get();
            assertEquals(1, user.getQuantity());
        }

    @Test
    void saveActionUser_return()
    {
        userRepository.saveActionUser("192.168.1.1");
        User user = userRepository.getUser("192.168.1.1").get();
        assertEquals(1, user.getQuantity());
    }

        @Test
    void saveOfWin() {
            userRepository.saveOfWin("192.168.1.1");
            User user = userRepository.getUser("192.168.1.1").get();
            assertEquals(1, user.getWin());
    }

    @Test
    void saveOfLose()
    {
        userRepository.saveOfLose("192.168.1.1");
        User user = userRepository.getUser("192.168.1.1").get();
        assertEquals(1, user.getLose());
    }

        @Test
    void isUserInMemory_shouldReturnTrue_whenUserExist()
        {
            boolean userInMemory = userRepository.isUserInMemory("192.168.1.1");
            assertTrue(userInMemory);
    }

    @Test
    void isUserInMemory_shouldReturnFalse_whenUserDoesNotExist()
    {
        boolean userInMemory = userRepository.isUserInMemory("80.100.0.1");
        assertFalse(userInMemory);
    }

        @Test
    void getUser_shouldReturnOptionalEmpty_whenUserDoesNotExist()
        {
            Optional<User> user = userRepository.getUser("120.100.1.1");
            assertFalse(user.isPresent());
    }

}