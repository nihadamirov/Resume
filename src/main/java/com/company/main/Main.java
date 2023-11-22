package com.company.main;

import com.company.dao.UserDaoInter;
import com.company.dao.UserSkillDaoInter;
import com.company.daoimpl.UserDaoImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        UserSkillDaoInter skillDao = Context.instanceSkillDao();
        System.out.println(skillDao.getAllSkillByUserId(1));
    }
}