import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.*;
import javafx.event.ActionEvent;

public class Lista implements Initializable {

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_apellidos;

    @FXML
    private TextField txt_edad;

    @FXML
    private TableView<Persona> tabla_personas;
    ObservableList<Persona> Contactos;

    @FXML
    private TableColumn<Persona, String> columna_nombres;

    @FXML
    private TableColumn<Persona, String> columna_apellidos;

    @FXML
    private TableColumn<Persona, Integer> columna_edad;

    @FXML
    private Button button_agregar;

    @FXML
    void agregar(ActionEvent event) {
        String nombre = txt_nombre.getText();
        String apellidos = txt_apellidos.getText();
        int edad = Integer.parseInt(txt_edad.getText());

        Persona persona1 = new Persona(nombre,apellidos,edad);
        //System.out.println(persona1.getNombres()+" "+persona1.getApellidos()+" "+persona1.getEdad());
        Contactos.add(persona1);
        tabla_personas.setItems(Contactos);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Contactos = FXCollections.observableArrayList();
        this.columna_nombres = new TableColumn<>("nombre");
        this.columna_apellidos = new TableColumn<>("apelldios");
        this.columna_edad = new TableColumn<>("edad");

        //101 73 97 102 107 99
        //98 105 72 84 ace velspri
        //106 97 90 113 passes c
        //108 101 cbalon
        
    }

}
