package com.example.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class flight {
    String usern;
    String passwd;


    public flight(String usern, String passwd) {
        this.usern = usern;
        this.passwd = passwd;
    }


    public String getInsertQuery() {

        return "INSERT INTO fl_db (username,password) " +
                "values ('"+usern+"','"+passwd+"')";
    }
}
