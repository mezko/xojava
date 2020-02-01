/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo1;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

/**
 *
 * @author Mohamed Ahmed
 */
public class FXMLDocumentController extends Thread implements Initializable {
       
  private int checkvalue=1;
  private String str=null;

      

   
    
    @FXML
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9 ;
    
    
     @FXML
     public void initalizeMyButtons(){
         
         btn1.setText("1");
          btn2.setText("2");
           btn3.setText("3");
            btn4.setText("4");
             btn5.setText("5");
              btn6.setText("6");
               btn7.setText("7");
                btn8.setText("8");
                 btn9.setText("9");
     }
    
     
     
     
     
     
           
  
    
    
    @FXML
    private void setBtn1(ActionEvent event) {
          click(btn1);
            myrun();
    }
    
    /////////////
     @FXML
    private void setBtn2(ActionEvent event) {
           click(btn2);
             myrun();
    }
    
      /////////////
     @FXML
            private void setBtn3(ActionEvent event) {
               click(btn3);
                myrun();
     }
            
            
          /////////////
     @FXML
            private void setBtn4(ActionEvent event) {
               click(btn4);
                myrun();
     }   
                /////////////
     @FXML
            private void setBtn5(ActionEvent event) {
               click(btn5);
                myrun();
     }
                /////////////
     @FXML
            private void setBtn6(ActionEvent event) {
               click(btn6);
                myrun();
     }
            
             /////////////
     @FXML
            private void setBtn7(ActionEvent event) {
               click(btn7);
                myrun();
     }   
         
                /////////////
     @FXML
            private void setBtn8(ActionEvent event) {
               click(btn8);
                myrun();
     }
                /////////////
     @FXML
            private void setBtn9(ActionEvent event) {
               click(btn9);
                myrun();
     }
            
            
           
            
            
            public void click(Button Btn){
               
                System.out.println("You clicked me!");
                if(checkvalue %2 !=0){
                    str="x";
                     
                    Btn.setStyle("-fx-text-fill:red ; -fx-font-size:30");
                    
                    Btn.setText(str);  
                }   
                else{
                    str="o";
                        Btn.setStyle("-fx-text-fill:Blue  ; -fx-font-size:30");
                     Btn.setText(str); 
                }
                checkvalue++;
              
                   Btn.setDisable(true);
            }
    
////////////////////////win //////////////////////
      
            public void win(){
                     System.out.println("Win");
                   Alert alert = new Alert(AlertType.INFORMATION);
                     alert.setTitle("congratulations");
//                     alert.setHeaderText("Look, an Information Dialog");
                     alert.setContentText( str.toUpperCase() +"Team Won");
                     alert.showAndWait().ifPresent(rs -> {
                     if (rs == ButtonType.OK) {
                     System.out.println("Pressed OK.");
                         Platform.exit();
                         
                      }
                    });
            }
            
            
            
        public void myrun(){
            
                if(btn1.getText()==btn2.getText() &&btn3.getText()==btn2.getText()){
                    System.out.println("1");
                    win();
                  }
 
//                
//System.out.println(btn4.getText());
                 if(btn4.getText()==btn5.getText() &&btn6.getText()==btn5.getText()){
                     System.out.println("2");
                     win();
                  }
                 
                 if(btn7.getText()==btn8.getText() &&btn9.getText()==btn8.getText()){
                     System.out.println("3");
                     win();
                  }
                 
                  if(btn7.getText()==btn5.getText() &&btn5.getText()==btn3.getText()){
                     System.out.println("4");
                     win();
                  }
                  
                   if(btn1.getText()==btn5.getText() &&btn5.getText()==btn9.getText()){
                     System.out.println("5");
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     win();
                  }
                   
                      if(btn1.getText()==btn4.getText() &&btn4.getText()==btn7.getText()){
                     System.out.println("6");
                     win();
                  }
                      
                       if(btn2.getText()==btn5.getText() &&btn5.getText()==btn8.getText()){
                     System.out.println("7");
                     win();
                  }
                          if(btn3.getText()==btn6.getText() &&btn6.getText()==btn9.getText()){
                     System.out.println("8");
                     win();
                  }
                
                
                
             
 
//                
                    else{
                    System.out.println("wait");
                }
//                
//            


        }   
            
   
        
        
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     initalizeMyButtons();
        
        
    
    }    
    
}
