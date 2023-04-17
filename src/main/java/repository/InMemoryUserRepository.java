package repository;

import entity.User;

import java.util.List;

public class InMemoryUserRepository implements UserRepository {
    private List<User> users;

    @Override
    public void addUser(String ipAddress) {
           users.add(new User(ipAddress));
    }

    @Override
    public void saveActionUser(String ipAddress) {
        for (User user : users) {
            if (user.getIpAddress().equals(ipAddress))
                user.setQuantity(user.getQuantity() + 1);
        }
    }

    @Override
    public void saveOfWin(String ipAddress) {
        for (User user : users) {
            if (user.getIpAddress().equals(ipAddress))
                user.setWin(user.getWin() + 1);
        }
    }

    @Override
    public void saveOfLose(String ipAddress) {
        for (User user : users) {
            if (user.getIpAddress().equals(ipAddress))
                user.setLose(user.getLose() + 1);
        }
    }

    @Override
    public boolean isUserInMemory(String ipAddress) {
        for (User user : users) {
            if(user.getIpAddress().equals(ipAddress))
                return true;
        }
        return false;
    }
}
