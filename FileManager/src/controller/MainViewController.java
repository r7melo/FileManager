package controller;

import entities.DirectoryBase;
import entities.PathManage;
import entities.PointEntity;
import entities.RootManager;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainViewController implements Initializable{

    @FXML private AnchorPane root;
    @FXML private TextField inputPath;
    
    private RootManager rootManager;
    private PathManage pathManage;
    
    @Override
    public void initialize(URL location, ResourceBundle resources){
        pathManage = new PathManage();
        rootManager = new RootManager(root, pathManage);
       
       
       PointEntity pointEntity = new PointEntity(new DirectoryBase());
       pointEntity.setFile(new File("C:\\"));
        try {
            rootManager.upload(pointEntity.openEntity());
        } catch (IOException ex) {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
       pathManage.setCurrentPath(pointEntity.getFile());
       
    }
    
    @FXML
    void backPath(ActionEvent event) throws IOException {
       PointEntity pointEntity = new PointEntity(new DirectoryBase());
       pointEntity.setFile(new File(pathManage.getBackPath()));
       rootManager.upload(pointEntity.openEntity());
    }

    @FXML
    void nextPath(ActionEvent event) {
    }
    
     @FXML
    void reloadPath(ActionEvent event) {
    }
    
    @FXML
    void findPath(ActionEvent event) {
    }
}
