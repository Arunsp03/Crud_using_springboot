package com.example.userdata.controller;

import com.example.userdata.entity.entity;
import com.example.userdata.service.UserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/adduser")
    public void adduser(@RequestBody entity entity){
        userService.adduser(entity);
    }
    @DeleteMapping("/deleteuser/{id}")
    public List<entity> deleteuser(@PathVariable("id") Long id){
        System.out.println(id);
        userService.deleteuser(id);
        List<entity>entities= userService.getusers();
        return entities;

    }
    @GetMapping("/getusers")
    public List<entity> getusers(){
       List<entity>entities= userService.getusers();
       return entities;
    }
    @PutMapping("/updateuser/{id}")
    public List<entity> updateuser(@PathVariable("id") Long id,@RequestBody entity entity){
        System.out.println(id);
        userService.updateuserdata(id,entity);
        List<entity>entities= userService.getusers();
        return entities;
    }
    @GetMapping("/getuser/{id}")
    public entity getuser(@PathVariable("id") Long id){
        entity ent=userService.getuser(id);
        return ent;
    }
}
