package com.company.dao;

import com.company.entity.EmploymentHistory;

import java.util.List;

public interface EmploymentHistoryDaoInter {
    List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId);
}
