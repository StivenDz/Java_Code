import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage state) throws Exception {
        FXMLLoader file = new FXMLLoader(getClass().getResource("Interfaz.fxml"));
        Parent root = file.load();
        Scene window = new Scene(root);
        state.setTitle("Sistema Estadistico De Calificaciones");
        state.setScene(window);
        state.show();
        
    }
}
