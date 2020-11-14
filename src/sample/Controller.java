package sample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    String contraseña="";
    //@FXML
    //private TextField Text1;
    @FXML
    private TextField Text2;
    @FXML
    private PasswordField Passw1;
    //@FXML
    //private Label Label1;
    //@FXML
    //private Label Label2;
    @FXML
    private Label Label3;
    //@FXML
    //private Label LVerContraseña;
   // @FXML
    //private Button bGuardar;

    @FXML
    public void onbGuardarClicked(MouseEvent event){
       Label3.setVisible(true);
    }

    @FXML
    public void onLVerContraseñaFocus(){
        contraseña=Passw1.getText();
        Text2.setText(contraseña);
        Passw1.setVisible(false);
        Text2.setVisible(true);



    }
}
