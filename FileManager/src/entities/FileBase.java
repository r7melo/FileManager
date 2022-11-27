package entities;

import interfaces.IPointEntity;
import java.io.File;
import java.util.List;

public class FileBase implements IPointEntity{

    @Override
    public List<PointEntity> openEntity(File file) {
        return null;
    }
    
}
