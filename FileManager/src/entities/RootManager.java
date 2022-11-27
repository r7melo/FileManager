package entities;

import java.util.List;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class RootManager {
    private AnchorPane root;
    private PathManage pathManage;
    
    public RootManager(AnchorPane _root, PathManage _pathManage) {
        root = _root;
        pathManage = _pathManage;
    }
    
    public void upload(List<PointEntity> pointEntityList){
        VBox vbox = new VBox(10);   
        
        for (PointEntity pointEntity : pointEntityList) {
            
            Button btn = new Button(pointEntity.getFile().getName());
            
            btn.addEventHandler(ActionEvent.ACTION, (event) -> {
                upload(pointEntity.openEntity());
                pathManage.setCurrentPath(pointEntity.getFile());
            });
            
            vbox.getChildren().add(btn);
        }
        root.getChildren().clear();
        root.getChildren().add(vbox);
    }
}
