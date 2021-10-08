package Connection;
import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    public Connection conexion(){ // es un metodo que retorna un dato de tipo Connection
        //Ruta de la db
        String url = "jdbc:sqlite:C:/Users/Anie Diaz/Desktop/Development/Codigo_Java/SceneBuidler/Interfaz_5/src/DB/Almacen04.db";
        Connection conn = null; // null = vacio, porque es SQL  / es como cuando un String n = "";

        try {
            conn = DriverManager.getConnection(url); // establecemos la conexion con la ruta de la base de datos
            Alert alert = new Alert(Alert.AlertType.INFORMATION); // creamos la alerta para saber si la conexion fue establecida o no
            alert.setHeaderText(null);
            alert.setTitle("¡Successful");
            alert.setContentText("¡ Conexion Establecida !");
            alert.showAndWait();
            
        } catch (SQLException e) {
           //System.out.println(e.getMessage());
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText(null);
           alert.setTitle("¡ERROR");
           alert.setContentText(e.getMessage());
           alert.showAndWait();
        }
        return conn; // retornamos el dato de tipo Connection
    }
}
