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
    public void start(Stage Interfaz) throws Exception {
        FXMLLoader file = new FXMLLoader(getClass().getResource("Formulario.fxml"));
        Parent root = file.load();
        Scene frame = new Scene(root);
        Interfaz.setTitle("Login");
        Interfaz.setScene(frame);
        Interfaz.show();
    }
}
