import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import Connection.Connect;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Controller_2 {

    @FXML
    private TextField txt_codigo;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_precioCompra;

    @FXML
    private TextField txt_precioVenta;

    @FXML
    private TextField txt_cantidad_bodega;

    @FXML
    private TextField txt_cantidad_min_r;

    @FXML
    private TextField txt_cantidad_max_p;

    @FXML
    private Button createButton;

    @FXML
    private Button viewButton;

    @FXML
    private TextArea productList;

    @FXML
    private Button createSaleButton;

    @FXML
    private Button button_consultar_editar;

    void limpiar(){
        txt_codigo.setText(null);
        txt_nombre.setText(null);
        txt_cantidad_bodega.setText(null);
        txt_cantidad_max_p.setText(null);
        txt_cantidad_min_r.setText(null);
        txt_precioCompra.setText(null);
        txt_precioVenta.setText(null);
    }

    @FXML
    void createProduct(ActionEvent event) {
        Connect objConexion = new Connect();

        Integer codigo = Integer.parseInt(txt_codigo.getText());
        String nombre = txt_nombre.getText();
        Integer Pcompra = Integer.parseInt(txt_precioCompra.getText());
        Integer Cmax = Integer.parseInt(txt_cantidad_max_p.getText());
        Integer Pventa = Integer.parseInt(txt_precioVenta.getText());
        Integer Cbodega = Integer.parseInt(txt_cantidad_bodega.getText());
        Integer Cmin = Integer.parseInt(txt_cantidad_min_r.getText());

        String sql = "INSERT INTO Productos(Codigo,Nombre,Precio_compra,Precio_venta,Cantidad_bodega,Cantidad_min_requerida,Cantidad_max_inv_permitida) VALUES (?,?,?,?,?,?,?);";

        try {
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, Pcompra);
            ps.setInt(4, Pventa);
            ps.setInt(5, Cbodega);
            ps.setInt(6, Cmin);
            ps.setInt(7, Cmax);
            ps.executeUpdate(); // nos ahorramos el estra que concatenando y es mas seguro, la otra forma es mas vulnerable

            //Statement state = conn.createStatement();

            //state.executeUpdate("INSERT INTO Productos(Codigo,Nombre,Precio_compra,Precio_venta,Cantidad_bodega,Cantidad_min_requerida,Cantidad_max_inv_permitida) VALUES ("+codigo+","+"'"+nombre+"'"+","+Pcompra+","+Pventa+","+Cbodega+","+Cmin+","+Cmax+");");

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Successful");
            alert.setContentText("Producto Creado Con Exito");
            alert.showAndWait();
            limpiar();

        } catch (SQLException e) {  // intentar lo de arriba y si hay alguna excepcion de tipo SQLException que va a estar en e, creamos la alerta
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }


    }

    @FXML
    void viewProduct(ActionEvent event) {
        Connect objConexion = new Connect(); // creamos un objeto dela clase connect.java

        String query = "SELECT * FROM Productos"; // es un string lo que queremos mostrar/ en este caso todo, select * de productos

        try { // Siempre se debe hacer un try cuando se va a establecer una conexion con la base de datos
            Connection conn = objConexion.conexion(); // accedemos al metodo, con un objeto de de la clase poseedora del metodo/ regresara un null o la conexion // nos dice si conectamos o no
            Statement state = conn.createStatement(); // con el statement nos permite enviar las instrucciones a la base de datos / creando la consulta para poder enviarla

            ResultSet result = state.executeQuery(query); // ResulSet se cambia la consulta y se ejecuta con el excecuteQuery y enviamos la variable conde se encuentra la consulta/ debe devolverme el valor, porque lo voy a mostrar, se guarda ese Showdata en result
            ResultSetMetaData MetaData = result.getMetaData(); // es algo que actua sobre los datos ya creados / evalua que tipo de datos se trae, cuantas columnas
            int numeroColumnas = MetaData.getColumnCount(); // cuenta las columnas que trae de la consulta y las guarda en esta variable

            // vamos arrecorer los registros de la base de datos y las columnas que mi metadata me dijo
            String productos = "";

            while(result.next()){ //next, siguiente registro hasta que se salga del ciclo
                for (int i = 1; i <= numeroColumnas; i++) {
                    String valorColumna = result.getString(i);
                    productos += MetaData.getColumnName(i) + ": "+valorColumna+"\n";
                }
                productos +="\n";
            }productList.setText(productos);



        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR!");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void consultarEditar(ActionEvent event) throws IOException {
        FXMLLoader file = new FXMLLoader(getClass().getResource("/Vistas/Update.fxml"));
        Parent root = file.load();
        Scene window = new Scene(root);
        Stage state = new Stage();
        state.setTitle("Consulta");
        state.setScene(window);
        state.show();

    }


    @FXML
    void createSale(ActionEvent event) throws IOException{
        FXMLLoader file = new FXMLLoader(getClass().getResource("/Vistas/sales.fxml"));
        Parent root = file.load();
        Scene window = new Scene(root);
        Stage state = new Stage();
        state.setTitle("Clientes");
        state.setScene(window);
        state.show();
    }

}
