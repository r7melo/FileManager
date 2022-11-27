package entities;

import java.io.File;

public class PathManage {
    private final int MAX_POSITION = 10;
    private String[] cachePath = new String[MAX_POSITION];
    private int currentPosition = -1;
    
    public String getNextPath(){
        if(currentPosition+1 < 10 && cachePath[currentPosition+1] != null)
            currentPosition++;
        
        return cachePath[currentPosition];
    }
    
    public String getBackPath(){
        if(0 <= currentPosition-1)
            currentPosition--;
        
        return cachePath[currentPosition];
    }
    
    public void setCurrentPath(File file){
        if(file.isDirectory() && currentPosition+1 < 10){
            currentPosition++;
            cachePath[currentPosition] = file.getPath();
            
            if(cachePath[currentPosition+1] != null){
                for(int i=currentPosition+1; i<MAX_POSITION; i++){
                    System.out.println(cachePath[currentPosition]+" APAGADO");
                    cachePath[currentPosition]=null;

                }
            }
        }        
    }

    public String[] getCachePath() {
        return cachePath;
    }
    
    
}
