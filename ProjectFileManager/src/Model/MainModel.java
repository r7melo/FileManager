package Model;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import Entity.LightSwitch;

public class MainModel implements Initializable {

    @FXML
    private Button btnLightSwitch;
    private LightSwitch lightSwitchi;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lightSwitchi = new LightSwitch();
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        btnLightSwitch.setText(lightSwitchi.press());
    }
    
}
