package repository;

public interface UserRepository {

    void addUser(Integer ipAddress);
    void saveActionUser(Integer ipAddress);
    void saveOfWin(Integer ipAddress);
    void saveOfLose(Integer ipAddress);

}
