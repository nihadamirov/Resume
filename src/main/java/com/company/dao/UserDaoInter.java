package com.company.dao;

import com.company.entity.User;
import com.company.entity.UserSkill;

import java.util.List;

public interface UserDaoInter {
    List<User> getAll();

    User getById(int userId);

    boolean addUser(User u);

    boolean updateUser(User u);

    boolean removeUser(int id);

}