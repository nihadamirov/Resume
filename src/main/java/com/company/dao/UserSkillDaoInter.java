package com.company.dao;

import com.company.entity.UserSkill;

import java.util.List;

public interface UserSkillDaoInter {
    List<UserSkill> getAllSkillByUserId(int userId);
}
