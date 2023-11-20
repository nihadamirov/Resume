package com.company.main;

import com.company.dao.UserDaoInter;
import com.company.daoimpl.UserDaoImpl;

public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
}
