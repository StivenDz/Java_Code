import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.scene.control.Alert;

public class Connect {
    

    public Connection conexion(){
        String url = "jdbc:sqlite:C:/Users/Anie Diaz/Desktop/Development/Codigo_Java/Retos/Reto4/Interfaz/src/DB/DB_Estudiantes.db";
        // C:\Users\Anie Diaz\Desktop\Development\Codigo_Java\Retos\Reto4\Interfaz\src\DB\Base_de_datos_Estudiantes.db
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Successful");
            alert.setContentText("¡ Conexion Establecida !");
            alert.showAndWait();
            
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR!");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
        return conn;
    }
}
