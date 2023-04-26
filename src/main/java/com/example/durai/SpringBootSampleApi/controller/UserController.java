package com.example.durai.SpringBootSampleApi.controller;

import com.example.durai.SpringBootSampleApi.entity.User;
import com.example.durai.SpringBootSampleApi.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
    UserService userService;
    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user){

        User  userData=userService.registerUser(user);
      return  new ResponseEntity<>(userData, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserByID(@PathVariable Long id){
        User userData=userService.getUser(id);
        return  new ResponseEntity<>(userData,HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<List<User>> getAlluser(){
        List<User> userData=userService.getAllUser();
        return  new ResponseEntity<>(userData,HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<User> updateByID(@PathVariable("id") Long id,@RequestBody User user){
       user.setId(id);
        User userData=userService.updateUser(user);
        return  new ResponseEntity<>(userData,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteByID(@PathVariable("id") Long id){

        userService.deleteUser(id);
        return  new ResponseEntity<>("user Deleted Successfully",HttpStatus.OK);
    }

}
