package repository;

import entity.User;

import java.util.List;

public class InMemoryUserRepository implements UserRepository {
    private List<User> users;

    @Override
    public void addUser(Long id) {
           users.add(new User(id));
    }

    @Override
    public void saveActionUser(Long id) {
        for (User user : users) {
            if (user.getId() == id)
                user.setQuantity(user.getQuantity() + 1);
        }
    }

    @Override
    public void saveOfWin(Long id) {
        for (User user : users) {
            if (user.getId() == id)
                user.setWin(user.getWin() + 1);
        }
    }

    @Override
    public void saveOfLose(Long id) {
        for (User user : users) {
            if (user.getId() == id)
                user.setLose(user.getLose() + 1);
        }
    }
}
