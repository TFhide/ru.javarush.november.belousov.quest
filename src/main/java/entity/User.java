package entity;

import java.util.Objects;

public class User {
    private final Long id;
    private Integer win;
    private Integer lose;
    private Integer quantity;

    public User(Long id) {
        this.id = id;
        this.win = 0;
        this.lose = 0;
        this.quantity = 0;
    }

    public Long getId() {
        return id;
    }


    public Integer getWin() {
        return win;
    }

    public User setWin(Integer win) {
        this.win = win;
        return this;
    }

    public Integer getLose() {
        return lose;
    }

    public User setLose(Integer lose) {
        this.lose = lose;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public User setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id)
                && Objects.equals(win, user.win)
                && Objects.equals(lose, user.lose)
                && Objects.equals(quantity, user.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, win, lose, quantity);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", win=" + win +
                ", lose=" + lose +
                ", quantity=" + quantity +
                '}';
    }
}
