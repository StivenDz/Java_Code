import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class Interfaz_Controller extends GradingSystem {

    @FXML
    private Button buton_calcular;

    @FXML
    private TextField txt_n;

    @FXML
    private TextArea txt_datos;

    @FXML
    private TextArea txt_viewResults;

    @FXML
    void Calcular(ActionEvent event) {
        n = Integer.parseInt(txt_n.getText());

        String texto = txt_datos.getText();
        String filas[] = texto.split("\n");
        matriz = new double[n][4];
        for (int i = 0; i < n; i++) {
            String linea[] = filas[i].split(" ");
            for (int j = 0; j<4; j ++){
                matriz[i][j] = Double.parseDouble(linea[j]);
            }
        }

        nombre = new double [n];
        calificacion = new double [n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                nombre[i] = matriz[i][0];
                calificacion[i] = matriz[i][3];
            }
        }

        String mensaje = String.format("%,.2f\n%d\n%s\n%s",stat1(),stat2(),stat3(),stat4());
        txt_viewResults.setText(mensaje);
        
        
    }

}
