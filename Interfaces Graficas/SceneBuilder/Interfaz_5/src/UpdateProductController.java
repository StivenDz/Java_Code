import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.Connect;
import javafx.event.ActionEvent;

public class UpdateProductController extends Connect{

    @FXML
    private TextField txt_actualizar_codigo;

    @FXML
    private TextField txt_actualizar_nombre;

    @FXML
    private TextField txt_actualizar_compra;

    @FXML
    private TextField txt_actualizar_venta;

    @FXML
    private TextField txt_actualizar_Cbodega;

    @FXML
    private TextField txt_actualizar_Cmin;

    @FXML
    private TextField txt_actualizar_Cmax;

    @FXML
    private Button button_consultar;

    @FXML
    private Button button_actualizar;

    @FXML
    private Button button_eliminar;

    @FXML
    void actualizar(ActionEvent event) {

        Integer codigo = Integer.parseInt(txt_actualizar_codigo.getText());
        String nombre = txt_actualizar_nombre.getText();
        Integer Pcompra = Integer.parseInt(txt_actualizar_compra.getText());
        Integer Cmax = Integer.parseInt(txt_actualizar_Cmax.getText());
        Integer Pventa = Integer.parseInt(txt_actualizar_venta.getText());
        Integer Cbodega = Integer.parseInt(txt_actualizar_Cbodega.getText());
        Integer Cmin = Integer.parseInt(txt_actualizar_Cmin.getText());

        //Connect objConexion = new Connect();
        String sql = "UPDATE productos SET Nombre = ?,Precio_compra = ?, Precio_venta = ? ,Cantidad_bodega = ?,Cantidad_min_requerida = ?, Cantidad_max_inv_permitida = ? WHERE Codigo = ?";

        try {
            Connection conn = conexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, Pcompra);
            ps.setInt(3, Pventa);
            ps.setInt(4, Cbodega);
            ps.setInt(5, Cmin);
            ps.setInt(6, Cmax);
            ps.setInt(7, codigo);
            ps.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Successful");
            alert.setContentText("Actualizacion Exitosa");
            alert.showAndWait();
            limpiar();
            conn.close();
            editarCajasFalse();

            
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        
        }

    }

    @FXML
    void consultar(ActionEvent event) {
        //Connect objConexion = new Connect();
        String sql = "SELECT * FROM Productos WHERE codigo = ?";

        try {
            Connection conn = conexion(); // objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txt_actualizar_codigo.getText()));

            
            ResultSet result = ps.executeQuery();
            if (result.next()){
                txt_actualizar_nombre.setText(result.getString("Nombre"));
                txt_actualizar_compra.setText(String.valueOf(result.getInt("Precio_compra")));
                txt_actualizar_venta.setText(String.valueOf(result.getInt("Precio_venta")));
                txt_actualizar_Cbodega.setText(String.valueOf(result.getInt("Cantidad_bodega")));
                txt_actualizar_Cmin.setText(String.valueOf(result.getInt("Cantidad_min_requerida")));
                txt_actualizar_Cmax.setText(String.valueOf(result.getInt("Cantidad_max_inv_permitida")));
            }

            editarCajas();
            conn.close();
            
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
        
    }

    @FXML
    void eliminar(ActionEvent event) {
        Integer codigo = Integer.parseInt(txt_actualizar_codigo.getText());

        String sql = "DELETE FROM Productos WHERE Codigo = ?";

        try {
            Connection conn = conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡SUCCESSFUL");
            alert.setContentText("Registro Eliminado Correctamente");
            alert.showAndWait();
            limpiar();
            editarCajasFalse();
            conn.close();


        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ERROR");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    void limpiar(){
        txt_actualizar_codigo.setText(null);
        txt_actualizar_nombre.setText(null);
        txt_actualizar_Cbodega.setText(null);
        txt_actualizar_Cmax.setText(null);
        txt_actualizar_Cmin.setText(null);
        txt_actualizar_compra.setText(null);
        txt_actualizar_venta.setText(null);
    }

    void editarCajas(){
        txt_actualizar_nombre.setEditable(true);
        txt_actualizar_compra.setEditable(true);
        txt_actualizar_Cmax.setEditable(true);
        txt_actualizar_Cmin.setEditable(true);
        txt_actualizar_venta.setEditable(true);
        txt_actualizar_Cbodega.setEditable(true);

    }

    void editarCajasFalse(){
        txt_actualizar_nombre.setEditable(false);
        txt_actualizar_compra.setEditable(false);
        txt_actualizar_Cmax.setEditable(false);
        txt_actualizar_Cmin.setEditable(false);
        txt_actualizar_venta.setEditable(false);
        txt_actualizar_Cbodega.setEditable(false);

    }

}

