package repository;

public interface UserRepository {

    void addUser(Long id);
    void saveActionUser(Long id);
    void saveOfWin(Long id);
    void saveOfLose(Long id);

}
