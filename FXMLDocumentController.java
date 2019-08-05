/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author ADIL RAZA
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label shw;
    @FXML
    private Button signup;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void signup(ActionEvent event) {
    if (username.getText().equals("Adil") && password.getText().equals("1234")) {
  shw.setText("wellcome bro to Ary blogger community"+"\n"+"Ary18sw18.blogspot.com");

      }
    else{
    shw.setText("SHARAM KARO KISI DOOSRE KA ACCOUNT NHI KHOLTEE"+"\n"+"ACHA SOORY!!!!");
    
    }
    }
    
}
