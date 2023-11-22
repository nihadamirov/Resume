package com.company.daoimpl;

import com.company.dao.AbstractDAO;
import com.company.dao.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;

import java.util.List;

public class EmploymentHistoryDaoImpl extends AbstractDAO implements EmploymentHistoryDaoInter {
    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId) {

        return null;
    }
}
