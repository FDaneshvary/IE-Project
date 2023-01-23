package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Service
@Lazy

public class DBservice {
    @Autowired
    public DBservice() {
    }
    public  void insert(String query)
    {
        try (Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/flightdb", "class1`", "123");
             Statement stmt = conn.createStatement();
        )
        {
            stmt.executeUpdate(query);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }






}


