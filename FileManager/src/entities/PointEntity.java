package entities;

import interfaces.IPointEntity;
import java.util.List;


public class PointEntity extends PointEntityBase{
    
    private IPointEntity iPointEntity;
  
    public PointEntity(IPointEntity iPointEntity) {
        this.iPointEntity = iPointEntity;
    }
    
    public List<PointEntity> openEntity(){
        return iPointEntity.openEntity(getFile());
    }
}

