package xo1;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Ahmed
 */
public class connetion {
    ///variables
    public java.sql.Statement  stmt;
    public int id;
    protected int user1=0;
    protected int user2=0;
    /////constructor
    public connetion() {
           try{
            
//               Class.forName("com.mysql.jdbc.Driver"); 
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
          Connection con=(Connection) DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/tictacto","root","");  
//here sonoo is database name, root is username and password  
               stmt=con.createStatement();
               
              ResultSet rs=stmt.executeQuery("SELECT * FROM `users` ORDER BY `u_id` DESC LIMIT 1");
                 while ( rs.next() ) {
                 id = rs.getInt("u_id");
               
               }
              
               System.out.println(id);
               
            
        }
          catch(Exception e){ System.out.println(e);}  

    }
    
    
    //encupsulation
   //user1
    public void setUser1(int user1) {
        this.user1 = user1;
    }
   //user2
    public void setUser2(int user2) {
        this.user2 = user2;
    }
    
    //get
    public int getUser1() {
        return user1;
    }

    public int getUser2() {
        return user2;
    }
    
     
    
    
    
}
