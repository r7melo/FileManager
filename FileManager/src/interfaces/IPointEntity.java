package interfaces;

import entities.PointEntity;
import java.io.File;
import java.util.List;

public interface IPointEntity {
    List<PointEntity> openEntity(File file);
}
