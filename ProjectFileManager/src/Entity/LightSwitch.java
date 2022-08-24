package Entity;

public class LightSwitch {
    private boolean status = false;
    
    public String press(){
        status = !status;
        
        if(status)
            return "ON";
        else
            return "OFF";
    }
}
