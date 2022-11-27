package entities;

import interfaces.IPointEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryBase implements IPointEntity{
    
    @Override
    public List<PointEntity> openEntity(File file) {
        List<PointEntity> pointEntitysList = new ArrayList<PointEntity>();
        File[] fileList = file.listFiles();
        
        for(File f: fileList){
            PointEntity pointEntity = new PointEntity(new DirectoryBase());
            pointEntity.setFile(f);
            pointEntitysList.add(pointEntity);
        }
        
        return pointEntitysList;
    }
    
}
