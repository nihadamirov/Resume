package com.company.daoimpl;

import com.company.dao.AbstractDAO;
import com.company.dao.UserSkillDaoInter;
import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserSkillDaoImpl extends AbstractDAO implements UserSkillDaoInter {
    private UserSkill getUserSkill(ResultSet rs) throws Exception {
        int userId = rs.getInt("id");
        int skillId = rs.getInt("skill_id");
        String skillName = rs.getString("skill_name");
        int power = rs.getInt("power");

        User user = new User(userId);
        Skill skill = new Skill(skillId,skillName);

        return new UserSkill(userId,user,skill, power);
    }

    @Override
    public List<UserSkill> getAllSkillByUserId(int userId) {

        List<UserSkill> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("SELECT u.*, us.*, s.id as skill_id, s.name as skill_name "
                    + "FROM user_skill us "
                    + "LEFT JOIN user u ON us.user_id = u.id "
                    + "LEFT JOIN skill s ON us.skill_id = s.id "
                    + "WHERE us.user_id=? ");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                UserSkill u = getUserSkill(rs);
                result.add(u);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
