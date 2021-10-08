import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.sql.Statement;
//import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.Connect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class Sales_controller extends Connect {

    @FXML
    private ChoiceBox<String> chb_producto;

    @FXML
    private ChoiceBox<String> chb_cliente;

    @FXML
    private Button btn_registrar;

    @FXML
    private TextField txt_cantidad;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_apellido;

    @FXML
    private TextField txt_genero;

    @FXML
    private Button btn_add_cliente;

    ObservableList<String>productos = FXCollections.observableArrayList();
    ObservableList<String>cliente = FXCollections.observableArrayList();

    @FXML
    private void initialize(){
        productos.add("Seleccione Producto");
        getListaProducto();
        chb_producto.getSelectionModel().select(0);
        cliente.add("Seleccione Cliente");
        getListaClientes();
        chb_cliente.getSelectionModel().select(0);
    }

    Connection conn = conexion();

    void getListaProducto(){
        String sql = "SELECT * FROM Productos order by codigo";

        try {
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery(sql);

            while(result.next()){
                productos.add(result.getInt("Codigo")+ "-" + (result.getString("Nombre")));
            }
            chb_producto.setItems(productos);
            
            
        } catch (SQLException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("¡ ERROR !");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
        }
    }

    void getListaClientes(){
        String sql = "SELECT * FROM clientes order by id";

        try {
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery(sql);

            while(result.next()){
                cliente.add(result.getInt("id")+ "-" + (result.getString("nombre")));
            }
            chb_cliente.setItems(cliente);
            
        } catch (SQLException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("¡ ERROR !");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
        }
    }

    public int existeIdentificacion(){
        String sql = "SELECT cedula FROM clientes WHERE cedula = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txt_id.getText());
            ResultSet result = ps.executeQuery();

            if (result.next()){
                return 1;
            }
            
        } catch (SQLException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("¡ ERROR !");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
        }
        return 0;
    }

    @FXML
    void Add_cliente(ActionEvent event) {
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String genero = txt_genero.getText();
        Integer cedula = Integer.parseInt(txt_id.getText());

        String sql = "INSERT INTO clientes (cedula,nombre,apellido,genero) Values (?,?,?,?)";

        try {
            if (existeIdentificacion() == 0){
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, cedula);
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setString(4, genero);
                ps.executeUpdate();

                Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
                alerta.setHeaderText(null);
                alerta.setTitle("¡ Successful !");
                alerta.setContentText("¡Cliente Insertado Exitosamente!");
                alerta.showAndWait();
            }else{
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(null);
                alerta.setTitle("¡ ERROR !");
                alerta.setContentText("Identificacion Ya Existe");
                alerta.showAndWait();
            }
            

        } catch (SQLException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("¡ ERROR !");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
        }

    }

    String getKey(String cadena){
        String key[] = cadena.split("-");
        return key[0];
    }

    @FXML
    void Registrar_venta(ActionEvent event) {
        Integer cliente = Integer.parseInt(getKey(chb_cliente.getValue()));
        Integer producto = Integer.parseInt(getKey(chb_producto.getValue()));
        Integer cant = Integer.parseInt(txt_cantidad.getText());

        String sql = "INSERT INTO ventas (cliente,producto,cantidad) VALUES (?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente);
            ps.setInt(2, producto);
            ps.setInt(3, cant);
            ps.executeUpdate();
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setHeaderText(null);
            alerta.setTitle("¡ Successful !");
            alerta.setContentText("Venta Creada Exitosamente");
            alerta.showAndWait();
            
        } catch (SQLException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("¡ ERROR !");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
        }

    }

}

