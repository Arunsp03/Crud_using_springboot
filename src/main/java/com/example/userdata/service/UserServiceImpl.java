package com.example.userdata.service;

import com.example.userdata.entity.entity;
import com.example.userdata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void adduser(entity entity){
        userRepository.save(entity);
    }
    @Override
    public void deleteuser(Long id){
        userRepository.deleteById(id);
    }
    @Override
    public List<entity> getusers(){
        List<entity>entities=userRepository.findAll();
        return  entities;
    };

    @Override
    public void updateuserdata(Long id,entity entity){
       entity ent=userRepository.findById(id).get();
       if(Objects.nonNull(entity.getFirstname()) && !"".equalsIgnoreCase(entity.getFirstname())){
           ent.setFirstname(entity.getFirstname());
       }
        if(Objects.nonNull(entity.getLastname()) && !"".equalsIgnoreCase(entity.getLastname())){
            ent.setLastname(entity.getLastname());
        }
        if(Objects.nonNull(entity.getPassword()) && !"".equalsIgnoreCase(entity.getPassword())){
            ent.setPassword(entity.getPassword());
        }
        if(Objects.nonNull(entity.getEmail()) && !"".equalsIgnoreCase(entity.getEmail())){
            ent.setEmail(entity.getEmail());
        }
        userRepository.save(ent);

    }
    @Override
    public entity getuser(Long id){
        return userRepository.findById(id).get();
    }
}
