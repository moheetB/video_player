package com.video.player.auxiliary;

import com.video.player.exception.ConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class DAOConnection {

    final String url = "jdbc:mysql://localhost:3306/torrential";
    final String username = "videop";
    final String password = "password";
    Connection connection;


    public DAOConnection() throws ConnectionException {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception cnf){
            throw new ConnectionException(cnf.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Success");
        } catch (SQLException sqlException){
            throw new ConnectionException(sqlException.getMessage());
        }
    }


    public static void main(String[] args){
        try {
            DAOConnection daoConnection = new DAOConnection();
        }catch (ConnectionException ce){
            System.out.print(ce);
        }
    }

}
