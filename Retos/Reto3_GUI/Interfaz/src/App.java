import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage alfStage) throws Exception {
        FXMLLoader file = new FXMLLoader(getClass().getResource("Interfaz.fxml"));
        Parent root = file.load();
        Scene window = new Scene(root);
        alfStage.setTitle("SchoolGradingSystem");
        alfStage.setScene(window);
        alfStage.show();
        
    }
}
