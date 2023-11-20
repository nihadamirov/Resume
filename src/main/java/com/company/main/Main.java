package com.company.main;

import com.company.bean.User;
import com.company.dao.UserDaoInter;
import com.company.daoimpl.UserDaoImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoInter userDao = new UserDaoImpl();

        User u = new User( 0,"Nihad", "Amirov", "nihadamirov98@gmail.com", "+994 055 646 54 45");
        userDao.addUser(u);
    }
}