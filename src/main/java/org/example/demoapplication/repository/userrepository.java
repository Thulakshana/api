package org.example.demoapplication.repository;
import org.example.demoapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<User,Integer> {

}
