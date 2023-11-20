package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDAO {  //DAO->Data Access Object
    public Connection connect() throws Exception {
        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "56789";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
