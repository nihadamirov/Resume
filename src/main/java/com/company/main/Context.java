package com.company.main;

import com.company.dao.UserDaoInter;
import com.company.dao.UserSkillDaoInter;
import com.company.daoimpl.UserDaoImpl;
import com.company.daoimpl.UserSkillDaoImpl;

public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static UserSkillDaoInter instanceSkillDao(){
        return new UserSkillDaoImpl();
    }
}
