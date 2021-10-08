import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Interfaz {

    @FXML
    private Button button_Saludar;

    @FXML
    private TextField txt_Name;

    @FXML
    void saludar(ActionEvent event) {
        String Nombre = txt_Name.getText();
        JOptionPane.showMessageDialog(null, "¡Hola "+Nombre+"!","Login",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Hola "+Nombre);

    }

}
