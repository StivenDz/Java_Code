import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
//import javax.swing.JOptionPane;
import javafx.event.ActionEvent;

public class Login {

    @FXML
    private Button button_getin;

    @FXML
    private TextField txt_user;

    @FXML
    private PasswordField txt_pass;

    @FXML
    private ComboBox<String> combo;

    @FXML
    void getin(ActionEvent event) {
        String credenciales[] = {"StevexDz","S12594995.2021Dz"};
        String rol = combo.getValue();

        String usuario = txt_user.getText();
        String pass = txt_pass.getText();

        if((usuario.equals(credenciales[0]))&&(pass.equals(credenciales[1]))){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡Successful");
            alert.setContentText("¡Bienvenido "+rol+"!");
            alert.showAndWait();
            //JOptionPane.showMessageDialog(null,"Usuario "+usuario+" Se ha logueado ¡correctamente!","Login",JOptionPane.INFORMATION_MESSAGE);
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR");
            alert.setContentText("¡Credenciales Incorrectas!");
            alert.showAndWait();
            //JOptionPane.showMessageDialog(null,"Usuario o Constraseña ¡Incorrecta!, Intente de nuevo","¡ERROR!",JOptionPane.ERROR_MESSAGE);
        }

    }

    public void initialize(){
        combo.getItems().removeAll(combo.getItems());
        combo.getItems().addAll("Administrador","Ingeniero","Programador","Usuario");
        combo.getSelectionModel().select("Usuario");
    }

}
