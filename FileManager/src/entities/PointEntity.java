package entities;

import enumerate.PointerEntityType;
import interfaces.IPointEntity;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PointEntity extends PointEntityBase implements IPointEntity {

    public PointEntity(File file) {
        super(file);
    }
        
    @Override
    public void openPointer(VBox displayScreen) {
        
        if(getPointerEntityType() != PointerEntityType.Directory)
            return;
        
        displayScreen.getChildren().clear();
        
        File path = new File(getFile().getPath());
        String[] pointsNames = path.list();
        
        for (String pointsName : pointsNames) {
            Button displayNewPoint = new Button(pointsName);
            displayNewPoint.addEventHandler(ActionEvent.ACTION, (event) -> {
                File newFile = new File(path.getPath() + "\\" + pointsName);
                setFile(newFile);
                System.out.println(getFile().getPath());
                setName(pointsName);
                setPointerEntityType();
                openPointer(displayScreen);
            });
            displayScreen.getChildren().add(displayNewPoint);
                    
        }
    }
}
