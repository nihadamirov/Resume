package com.company.daoimpl;

import com.company.dao.AbstractDAO;
import com.company.dao.SkillDaoInter;
import com.company.entity.Skill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SkillDaoImpl extends AbstractDAO implements SkillDaoInter {
    private Skill getSkill(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        return new Skill(id, name);
    }

    @Override
    public List<Skill> getAllSkill(int userId) {
        List<Skill> result = new ArrayList<>();
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("SELECT * FROM resume.skill");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Skill u = getSkill(rs);
                result.add(u);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
