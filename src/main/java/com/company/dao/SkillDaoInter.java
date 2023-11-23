package com.company.dao;

import com.company.entity.Skill;

import java.util.List;

public interface SkillDaoInter {
    List<Skill> getAllSkill(int userId);
}
