package com.example.shakespearinsulter.repository;

import com.example.shakespearinsulter.db.MySqlDatabase;
import com.example.shakespearinsulter.model.Insulter;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class InsulterRepository {

    private Connection connection;

    public InsulterRepository(){connection = MySqlDatabase.getInstance().getConnection();}


    private Insulter transform(ResultSet resultSet) throws SQLException{
        Insulter insulter = new Insulter();
        insulter.setId(resultSet.getInt("id"));
        insulter.setName(resultSet.getString("name"));
        insulter.setInsult(resultSet.getString("insult"));
        insulter.setRating(resultSet.getInt("rating"));

        return insulter;
    }
}
