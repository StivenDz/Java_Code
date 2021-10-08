import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button button_sumar;

    @FXML
    private TextField txt_primerv;

    @FXML
    private TextField txt_segudnov;

    @FXML
    void sumar(ActionEvent event) {
        int numero1,numero2,resultado;

        numero1 = Integer.parseInt(txt_primerv.getText());
        numero2 = Integer.parseInt(txt_segudnov.getText());
        resultado = numero1 + numero2;

        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+resultado);
    }

}
