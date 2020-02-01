/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo1.Menu;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import xo1.connetion;

/**
 * FXML Controller class
 *
 * @author Mohamed Ahmed
 */
public class MenuController extends connetion implements Initializable {

    /**
     * Initializes the controller class.
     */
       @FXML
    TextField name;
    
    
       @FXML
            private void signup(ActionEvent event) throws SQLException {
               id++;
               String name_code=name.getText()+id;
              stmt.executeUpdate("INSERT INTO `users`(`u_name`, `l_score`, `n_score`) VALUES ('"+ name_code+"',0,0)");
            
            System.out.println(name_code);
     }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
