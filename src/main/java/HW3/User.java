package main.java.HW3;

public class User {
    private Integer id;
    private String name;


    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
        this.id = 1;
        this.name = "1st";
    }

    @Override
    public String toString() {
        return String.format("ID = %d, Name = %s", this.id, this.name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}