/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bawantha
 */
public class DB {
    public static Connection createConnection() throws Exception{
     
     String url = "jdbc:mysql://localhost:3306/rentvehicle?useSSL=false";
     Connection con = DriverManager.getConnection(url,"root","");
     return con;
    }
}
