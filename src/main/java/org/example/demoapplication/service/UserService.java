package org.example.demoapplication.service;
import org.example.demoapplication.entity.User;
import org.example.demoapplication.repository.userrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   private final userrepository userrepo;

   public UserService(userrepository userrepo){
       this.userrepo=userrepo;
   }

   public User createuser(User userss){
       return userrepo.save(userss);
   }

   public List<User>getalluser(){
       return userrepo.findAll();
   }
   public User getuserbyid(int id){
       return userrepo.findById(id).orElseThrow(()->new RuntimeException("user not found"));
   }
   public void deleteuserbyid(int id){
       userrepo.deleteById(id);
   }

}
