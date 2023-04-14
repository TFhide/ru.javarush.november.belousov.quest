package service;

import entity.User;
import repository.UserRepository;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(Integer ipAddress) {
        userRepository.addUser(ipAddress);
    }

    public void saveActionUser(Integer ipAddress) {
        userRepository.saveActionUser(ipAddress);
    }

    public void saveOfWin(Integer ipAddress) {
        userRepository.saveOfWin(ipAddress);
    }

    public void saveOfLose(Integer ipAddress) {
        userRepository.saveOfLose(ipAddress);
    }

}
