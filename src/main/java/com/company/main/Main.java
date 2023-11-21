package com.company.main;

import com.company.dao.UserDaoInter;
import com.company.daoimpl.UserDaoImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoInter userDao = new UserDaoImpl();
        System.out.println(userDao.getAll());
    }
}