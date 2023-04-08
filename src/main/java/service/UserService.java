package service;

import entity.User;
import repository.UserRepository;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(Long id) {
        userRepository.addUser(id);
    }

    public void saveActionUser(Long id) {
        userRepository.saveActionUser(id);
    }

    public void saveOfWin(Long id) {
        userRepository.saveOfWin(id);
    }

    public void saveOfLose(Long id) {
        userRepository.saveOfLose(id);
    }

}
