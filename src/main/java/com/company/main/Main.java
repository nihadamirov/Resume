package com.company.main;

import com.company.dao.UserDaoInter;

public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoInter u = Context.instanceUserDao();
        System.out.println(u.getAll());
    }
}