package service;

import entity.User;
import repository.UserRepository;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String ipAddress) {
        userRepository.addUser(ipAddress);
    }

    public void saveActionUser(String ipAddress) {
        userRepository.saveActionUser(ipAddress);
    }

    public void saveOfWin(String ipAddress) {
        userRepository.saveOfWin(ipAddress);
    }

    public void saveOfLose(String ipAddress) {
        userRepository.saveOfLose(ipAddress);
    }

    public boolean isUserInMemory(String ipAddress) { return userRepository.isUserInMemory(ipAddress); }

}
