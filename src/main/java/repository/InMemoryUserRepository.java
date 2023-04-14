package repository;

import entity.User;

import java.util.List;

public class InMemoryUserRepository implements UserRepository {
    private List<User> users;

    @Override
    public void addUser(Integer ipAddress) {
           users.add(new User(ipAddress));
    }

    @Override
    public void saveActionUser(Integer ipAddress) {
        for (User user : users) {
            if (user.getIpAddress() == ipAddress)
                user.setQuantity(user.getQuantity() + 1);
        }
    }

    @Override
    public void saveOfWin(Integer ipAddress) {
        for (User user : users) {
            if (user.getIpAddress() == ipAddress)
                user.setWin(user.getWin() + 1);
        }
    }

    @Override
    public void saveOfLose(Integer ipAddress) {
        for (User user : users) {
            if (user.getIpAddress() == ipAddress)
                user.setLose(user.getLose() + 1);
        }
    }
}
