/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Databases {
    
    public static void main(String args[]){
        
        Database mydatabase = new Database();
        
        String query = "select * from bankdetails";
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","null");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
        
       
           while(result.next()){ 
            
            String AccountNumber = result.getString(1),
            name = result.getString(2);
            String Address = result.getString(3);
            String MobileNumber = result.getString(4);
            double AccountBalance = result.getDouble(6);
            String pinNumber = result.getString(7);
            String idNumber = result.getString(8);
            String Description = result.getString(9);
           // String[] pin,String[] acno, String[] id, double[] balance, String[] name
            //mydatabase.setAllData(pinNumber,AccountNumber,idNumber,AccountBalance,name);
               System.out.println(AccountNumber);
           }
            
            
         
            
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    
    }
}
