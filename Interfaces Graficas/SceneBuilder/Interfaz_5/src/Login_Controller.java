import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

//import java.io.IOException;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Login_Controller extends App{
    
    public boolean cerrar = false;
    @FXML
    private Label message_error;

    @FXML
    private Button button_iniciar;

    @FXML
    private TextField txt_user;

    @FXML
    private PasswordField txt_password;

    @FXML
    void iniciar_sesion(ActionEvent event) throws Exception {
        String usuario = txt_user.getText();
        String password = txt_password.getText();
        String error = "";
        

        if (usuario.equalsIgnoreCase("prueba")){
            error = "Usuario no valido";
        }

        if (password.length()<6){
            error = "La Contraseña debe contener mas de 6 caracteres\nIntente nuevamente";
        }else if(password.equalsIgnoreCase(usuario)){
            error = "La Contraseña no puede ser igual al usuario\nIntente nuevamente";
        }

        if (error.isEmpty()){
            FXMLLoader file = new FXMLLoader(getClass().getResource("Vistas/welcome.fxml"));
            Parent root = file.load();
            //Controller_2 welcome = file.getController();
            Scene window = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Welcome");
            stage.setScene(window);
            cerrar = true;
            stage.show();
            
            
                
        }else{
            message_error.setText(error);
        }

    }

}
