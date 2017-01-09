package com.video.player.dao;

import com.video.player.exception.ConnectionException;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Gaurav on 1/8/2017.
 */
public class DAO {

    final static Logger logger = Logger.getLogger(DAO.class);

    private final String url = "jdbc:mysql://localhost:3306/torrential";
    private final String username = "videop";
    private final String password = "password";

    private static Connection connection = null;

    public DAO() throws ConnectionException {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception cnf){
            throw new ConnectionException(cnf.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, username, password)){
            logger.info("Connection to db established");
        } catch (SQLException sqlException){
            throw new ConnectionException(sqlException.getMessage());
        }
    }

    public void closeDao () {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            logger.error(sqlException.getMessage());
        }
    }
}
