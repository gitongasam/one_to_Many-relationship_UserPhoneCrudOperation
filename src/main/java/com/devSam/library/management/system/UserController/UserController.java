package com.devSam.library.management.system.UserController;

import com.devSam.library.management.system.UserEntity.User;
//import com.devSam.library.management.system.Model.UserModel;
import com.devSam.library.management.system.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public String SaveUser(@RequestBody User user){
        userService.SaveUser(user);
       return "success";
    }
    @GetMapping("/getAllUser")
    public List<User> user(){
        return  userService.getAllUser();
    }
    @GetMapping("/getById/{id}")
    public Optional<User> user(@PathVariable("id") Long Id){
        return userService.findById(Id);
    }
    @DeleteMapping("/deleteById/{id}")
    public  String deleteUser(@PathVariable("id")Long id){
        userService.deleteById(id);
        return "deleted successifully";
    }


}
