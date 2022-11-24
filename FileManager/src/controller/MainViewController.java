package controller;

import entities.PathManageEntity;
import entities.PointEntity;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable{

    @FXML
    private VBox displayScreen;
    
    private PointEntity root;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PointEntity point = new PointEntity(new File("C:\\"));
        point.setPointerEntityType();
        root = point;
        root.openPointer(displayScreen);
    }
    
    @FXML
    void backPath(ActionEvent event) {
        if(root.getFile().getParentFile() != null){
            PointEntity point = new PointEntity(root.getFile().getParentFile());
            point.setPointerEntityType();
            root = point;
            root.openPointer(displayScreen);
        }
        
    }

    @FXML
    void nextPath(ActionEvent event) {
        
    }
}
