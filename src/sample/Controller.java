package sample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    String contraseña="";

    @FXML
    private TextField Text2;
    @FXML
    private PasswordField Passw1;

    @FXML
    private Label Label3;
    @FXML
    private Label LVerContraseña;


    @FXML
    public void onbGuardarClicked(MouseEvent event){
       Label3.setVisible(true);
    }

    @FXML
    public void onLVerContraseñaFocus(MouseEvent event){
        //Cuando uno sea visible el otro se hace invisible por cada vez que muevas el raton por encima
        if(Passw1.isVisible()) {
            contraseña = Passw1.getText();
            Text2.setText(contraseña);
            Passw1.setVisible(false);
            Text2.setVisible(true);
        }else{
            if(Text2.isVisible()){
                Passw1.setVisible(true);
                Text2.setVisible(false);
            }
        }

    }

}
