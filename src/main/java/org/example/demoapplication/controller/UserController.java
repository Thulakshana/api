package org.example.demoapplication.controller;
import io.swagger.v3.oas.annotations.Operation;
import org.example.demoapplication.entity.User;
import org.example.demoapplication.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userservicefile;

    public UserController(UserService userservicefile){
        this.userservicefile=userservicefile;
    }

    @PostMapping
    @Operation( //meken kiyanne swagger document ekak me api ekata one kiyala
            summary = "create user",
            description = "create users"
    )
    public User createuser(@RequestBody User userss){
        return userservicefile.createuser(userss); //methana thiyana createuser kiyana eka service class eke method eka
    }
    //********************************************************************************
    @GetMapping
    @Operation(
            summary = "show user",
            description = "show a user using their ID"
    )
    public List<User>getallusers(){
        return userservicefile.getalluser();
    }
    //*************************************************************************************
    @Operation(
            summary = "update user",
            description = "update a user using their ID"
    )
    @GetMapping("/{id}")
    public User getuserbyid(@PathVariable int id){
        return userservicefile.getuserbyid(id);
    }
    //********************************************************************************************************
    @Operation(
            summary = "Delete user",
            description = "Deletes a user using their ID"
    )
    @DeleteMapping("/{id}")
    public String deleteuser(@PathVariable int id){
        userservicefile.deleteuserbyid(id);
        return "user delete ok";
    }


}
