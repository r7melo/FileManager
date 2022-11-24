package application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.application.Application;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
            Parent parent = loader.load();
            
            Scene mainScene = new Scene(parent);
            
            primaryStage.setScene(mainScene);
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/logo.png")));
            primaryStage.setTitle("FileManager");
            primaryStage.show();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
