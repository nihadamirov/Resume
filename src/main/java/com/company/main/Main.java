package com.company.main;

import com.company.dao.CountryDaoInter;
import com.company.dao.EmploymentHistoryDaoInter;
import com.company.dao.SkillDaoInter;
import com.company.dao.UserSkillDaoInter;
import com.company.entity.EmploymentHistory;

public class Main {
    public static void main(String[] args) throws Exception {
        CountryDaoInter cd = Context.instanceAllCountry();
        System.out.println(cd.getAllCountry(1));
    }
}