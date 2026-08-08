package org.example.demoapplication.entity;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private int age;

    public User(){}

    public User(String username,int age){
        this.username=username;
        this.age=age;
    }

    public int getId(){return id;}

    public String getUsername(){return username;}

    public void setUsername(String username){this.username=username;}

    public int age(){return age;}

    public void setAge(int age){this.age=age;}


}
