import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;

public class StadisticSystemController extends Connect {

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_genero;

    @FXML
    private TextField txt_nota;

    @FXML
    private TextField txt_materia;

    @FXML
    private Button button_guardar;

    @FXML
    private Button button_cargar;

    @FXML
    private Button button_procesar;

    @FXML
    private TextArea txtArea_carga_de_datos;

    @FXML
    private TextArea txtArea_calculo;

    @FXML
    private TextArea txtArea_consulta_eliminar;

    @FXML
    private Button button_consultar;

    @FXML
    private Button button_eliminar;

    @FXML
    private TextField txt_consulta_nombre;

    @FXML
    private TextField txt_consulta_materia;

    void limpiar1(){
        txt_nota.setText(null);
        txt_genero.setText(null);
        txt_nombre.setText(null);
        txt_genero.setText(null);
    }

    void limpiar2(){
        txt_consulta_nombre.setText(null);
        txt_consulta_materia.setText(null);
    }

    @FXML
    void guardar(ActionEvent event) { //1
        Double nota = Double.parseDouble(txt_nota.getText());
        Double nombre =  Double.parseDouble(txt_nombre.getText());
        Double materia =  Double.parseDouble(txt_materia.getText());
        Double genero =  Double.parseDouble(txt_genero.getText());

        String sql = "INSERT INTO Notas(id_Estudiante,id_Genero,id_Materia,Nota) VALUES (?,?,?,?);";

        try {
            Connection conn = conexion();
            if (nombre>0 && genero>=0 && materia > 0 && nota >=0){            
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setDouble(1, nombre);
                ps.setDouble(2, genero);
                ps.setDouble(3, materia);
                ps.setDouble(4, nota);
                ps.executeUpdate();
            }
            

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡ SUCCESSFUL !");
            alert.setContentText("Datos Ingresados Correctamente");
            alert.showAndWait();

            limpiar1();
            conn.close();

            
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ ERROR !");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }


    @FXML
    void cargarDatos(ActionEvent event) {//2
        String sql = "SELECT * FROM Notas";
        String datos = "SELECT count(*) as num FROM Notas";

        try {
            Connection conn = conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            PreparedStatement ps2 = conn.prepareStatement(datos);
            ResultSet result2 = ps2.executeQuery();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡ SUCCESSFUL !");
            alert.showAndWait();

            txtArea_carga_de_datos.appendText(result2.getString("num")+"\n");
            
            while (result.next()) {
                txtArea_carga_de_datos.appendText(result.getDouble("id_Estudiante")+" "+result.getDouble("id_Genero")+" "+result.getDouble("id_Materia")+" "+result.getDouble("Nota")+"\n");
            }


            
        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ ERROR !");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void procesar_calculo(ActionEvent event) {//3

        String datos = "SELECT count(*) as num FROM Notas";
        String state1 = "SELECT count(id) as num2 FROM Notas WHERE Nota >2.5 AND Nota <=5.0 ";
        String state2 = "SELECT count(*) as num3 FROM Notas WHERE Nota <= 2.5 AND Nota > 1;";
        String state3 = "SELECT avg(Nota) AS Promedio, Materia FROM Notas,info_Materias INNER join info_Estudiantes ON info_Materias.id = Notas.id_Estudiante AND info_Materias.id = Notas.id_Materia WHERE info_Estudiantes.Genero = 0 GROUP BY id_Materia ORDER BY promedio ASC LIMIT 1;";
        String state4 = "SELECT MAX(Nota) as MejorPromedioGeografia,Nombre FROM Notas,info_Estudiantes ON info_Estudiantes.id = Notas.id_Estudiante WHERE Notas.id_Materia = 1;";

        try {
            Connection conn = conexion();
            PreparedStatement ps = conn.prepareStatement(datos);
            ResultSet result = ps.executeQuery();
            PreparedStatement ps1 = conn.prepareStatement(state1);
            ResultSet result1 = ps1.executeQuery();
            PreparedStatement ps2 = conn.prepareStatement(state2);
            ResultSet result2 = ps2.executeQuery();
            PreparedStatement ps3 = conn.prepareStatement(state3);
            ResultSet result3 = ps3.executeQuery();
            PreparedStatement ps4 = conn.prepareStatement(state4);
            ResultSet result4 = ps4.executeQuery();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡ SUCCESSFUL !");
            alert.showAndWait();

            txtArea_calculo.appendText(String.format("%,.2f \n",result1.getDouble("num2")/result.getInt("num")));
            txtArea_calculo.appendText(result2.getInt("num3")+"\n");
            while(result3.next()){
                txtArea_calculo.appendText(result3.getString("Materia")+"\n");
            }
            while(result4.next()){
                txtArea_calculo.appendText(result4.getString("Nombre")+"\n");
            }

        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ ERROR !");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void consultar(ActionEvent event) { //4
        Integer nombre = Integer.parseInt(txt_consulta_nombre.getText());
        String sql = "SELECT * FROM Notas WHERE id_Estudiante = ?";

        Integer materia = Integer.parseInt(txt_consulta_materia.getText());
        String sql2 = "SELECT * FROM Notas WHERE Nota = ?";

        try {
            Connection conn = conexion();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡ SUCCESSFUL !");
            alert.showAndWait();

            if (nombre >0){
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1,nombre);
                
                
                ResultSet result = ps.executeQuery();
                while(result.next()){
                    txtArea_consulta_eliminar.appendText(result.getInt("id_Estudiante")+" "+result.getInt("id_Genero")+" "+result.getInt("id_Materia")+" "+result.getDouble("Nota")+"\n");
                }
            }
            if (materia>0){
                PreparedStatement ps1 = conn.prepareStatement(sql2);
                ps1.setInt(1,materia);
                ps1.executeUpdate();

                
                ResultSet result1 = ps1.executeQuery();
                while(result1.next()){
                    txtArea_consulta_eliminar.appendText(result1.getInt("id_Estudiante")+" "+result1.getInt("id_Genero")+" "+result1.getInt("id_Materia")+" "+result1.getDouble("Nota")+"\n");
                }
            }

            limpiar2();



        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ ERROR !");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }

    @FXML
    void eliminar(ActionEvent event) {//5
        Integer nombre = Integer.parseInt(txt_consulta_nombre.getText());
        String sql = "DELETE FROM Notas  WHERE id_Estudiante = ?";

        Integer materia = Integer.parseInt(txt_consulta_materia.getText());
        String sql2 = "DELETE FROM Notas  WHERE id_Materia = ?";

        try {
            Connection conn = conexion();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("¡ SUCCESSFUL !");
            alert.showAndWait();

            if (nombre >0){
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1,nombre);
                ps.executeUpdate();

                /*
                ResultSet result = ps.executeQuery();
                
                while(result.next()){
                    txtArea_consulta_eliminar.appendText(result.getInt("id_Estudiante")+" "+result.getInt("id_Genero")+" "+result.getInt("id_Materia")+" "+result.getDouble("Nota")+"\n");
                }*/
            }
            if (materia>0){
                PreparedStatement ps1 = conn.prepareStatement(sql2);
                
                ps1.setInt(1,materia);

                ps1.executeUpdate();
                /*
                while(result1.next()){
                    txtArea_consulta_eliminar.appendText(result1.getDouble("id_Estudiante")+" "+result1.getInt("id_Genero")+" "+result1.getInt("id_Materia")+" "+result1.getInt("Nota")+"\n");
                }*/
            }
            limpiar2();

        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("¡ ERROR !");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}

