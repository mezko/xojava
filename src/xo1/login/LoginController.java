/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo1.login;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import xo1.connetion;

/**
 * FXML Controller class
 *
 * @author Mohamed Ahmed
 */
public class LoginController extends connetion implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField loginname;
    int myid=0;
    String myname;
       @FXML
            private void login_fun(ActionEvent event) throws SQLException {
                System.out.println("Test Login");    
                ResultSet rs=stmt.executeQuery("SELECT `u_id` FROM `users` WHERE `u_name`='"+ loginname.getText()+"'");                 
                       while (rs.next())
                               {
                                   
                                   myid = rs.getInt("u_id");
                                   setUser1(myid);
                                      System.out.println(user1); 
                                   }
                                           
                
                                 if(!rs.last()){
                                 System.out.println("Error in Login");
                              
                                  Exception e = new Exception("An exception!!!!!!!!!!!!!!!!!");
                                 StringWriter sw = new StringWriter();
                                 e.printStackTrace(new PrintWriter(sw));

                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText("Error In Login ..... Please Check You ID Again");
                                alert.getDialogPane().setExpandableContent(new ScrollPane(new TextArea(sw.toString())));
                                alert.showAndWait();
                             }
                
            }
                        
                        
                               
             
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
