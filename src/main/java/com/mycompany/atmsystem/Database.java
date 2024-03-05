/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmsystem;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Database {
    
    public static int pin[]= {2001,3002,4003,5004,1974,5648,4455,9022,23186,564804};
    private String acno[] = {"0791001","079002","0791003","0791004","198200170058901","1982001600170058901","5743839","1974","07920021","2001"};
    private String id[] = {"2001","2002","2003","2004","200166101943","200166101942","981410","746871503V","991541772V","200166"};
    public static double balance[]  = {5000.00,10000.00,15000.00,20000.00,50500.00,89500,565,60000,2000,95785};
    private String name[]  = {"L.S.Perera","T.S Disanayaka","K.Bandara","T.Kulathunga","S.Vidushima","T.Saranga","Samitha","Pushpamali Sriyakanthi","Sulakkana Sandaruwan","sa"};
    

    public Database(){
        
    }
    
    
    // database.getPin(this.AcNo1,this.id1)
    
    public int getPin(String Acno, String id){
        for(int a = 0; a<this.name.length;a++){
            if(this.acno[a].equals(Acno)&& this.id[a].equals(id)){
                return pin[a];
            }
        }
        return 0;
    }
    public void changePin(String pinNum,String id,String acno,String newPinNum){
        int pin = Integer.parseInt(pinNum);
        int newpin = Integer.parseInt(newPinNum);
        for(int a = 0; a<this.name.length;a++){
            if(this.pin[a]== pin && this.id[a].equals(id) && this.acno[a].equals(acno)){
                this.pin[a]= newpin;
            }
        }
    }
        
    public void setBalance(double balance,String accnumber){
        for(int a = 0; a<acno.length; a++){
               if(accnumber.equals(acno[a])){
                   this.balance[a]=balance;
               }
        }

    }
    
    public boolean checkID(String idNumber){
        for(int a = 0; a<id.length;a++){
            if(idNumber.equals(id[a])){
                return true;
            }
        }
        return false;
    }
    

       
    public boolean checkPin(String pin){
        int pinNumber = Integer.parseInt(pin);
        for(int a = 0; a<this.pin.length;a++){
            if(this.pin[a]==pinNumber){
                return true;
            }
        }
        return false;
    }
    
       
    public boolean checkIDPin(String idNumber,String pin){
        int PinNumber = Integer.parseInt(pin);
        for(int a = 0; a<id.length;a++){
            if(idNumber.equals(id[a]) && PinNumber==this.pin[a]){
                return true;
            }
        }
        return false;
    }
    
        public double getBalance(String pin){
         int pinNumber = Integer.parseInt(pin); 
         for(int a = 0; a<id.length;a++){
            if(pinNumber==this.pin[a]){
                return this.balance[a];
            }
        }
         return 0;
    }
        
        
     public String getName(String idNumber,String pin){
         int PinNumber = Integer.parseInt(pin); 
        for(int a = 0; a<id.length;a++){
            if(idNumber.equals(id[a]) && PinNumber==this.pin[a]){
                return name[a];
            }
        }
        return "-";
    }
       public String getAcno(String Pin){
        int PinNumber = Integer.parseInt(Pin); 
        for(int a = 0; a<pin.length;a++){
            if(PinNumber==this.pin[a]){
           
                return acno[a];
            }
        }
        return "x";
    }
       
       public boolean checkACID(String AcNo,String idNumber){
           for(int a = 0; a<pin.length;a++){
               if(acno[a].equals(AcNo) && this.id[a].equals(idNumber)){
                   return true;
               }
           }
    
           
           return false;
       }
       
  
    
}
