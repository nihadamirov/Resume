package com.company.main;

import com.company.dao.*;
import com.company.daoimpl.*;

public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static UserSkillDaoInter instanceSkillDao(){
        return new UserSkillDaoImpl();
    }

    public static EmploymentHistoryDaoInter instanceEmploymentHistoryDao(){
        return new EmploymentHistoryDaoImpl();
    }

    public static SkillDaoInter instanceAllSkillDao(){
        return new SkillDaoImpl();
    }

    public static CountryDaoInter instanceAllCountry(){
        return new CountryDaoImpl();
    }
}
