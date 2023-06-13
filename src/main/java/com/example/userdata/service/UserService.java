package com.example.userdata.service;

import com.example.userdata.entity.entity;

import java.util.List;

public interface UserService {
    public void adduser(entity entity);
    public void deleteuser(Long id);

    public List<entity> getusers();


    public void updateuserdata(Long id,entity entity);

    public entity getuser(Long id);
}
