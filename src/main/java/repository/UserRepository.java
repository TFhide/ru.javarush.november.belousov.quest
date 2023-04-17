package repository;

public interface UserRepository {

    boolean isUserInMemory(String ipAddress);
    void addUser(String ipAddress);
    void saveActionUser(String ipAddress);
    void saveOfWin(String ipAddress);
    void saveOfLose(String ipAddress);

}
