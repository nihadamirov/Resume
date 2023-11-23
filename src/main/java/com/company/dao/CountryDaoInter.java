package com.company.dao;

import com.company.entity.Country;

import java.util.List;

public interface CountryDaoInter {
    List<Country> getAllCountry(int userId);
}
