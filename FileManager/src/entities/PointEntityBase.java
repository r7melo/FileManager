package entities;

import enumerate.PointerEntityType;
import java.io.File;

public class PointEntityBase {
    private String name;
    private File file;
    private PointerEntityType pointerEntityType;
    private boolean hidden;
    private boolean favorite;

    public PointEntityBase(File file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public PointerEntityType getPointerEntityType() {
        return pointerEntityType;
    }

    public void setPointerEntityType(PointerEntityType pointerEntityType) {
        this.pointerEntityType = pointerEntityType;
    }
    
    public void setPointerEntityType() {
        if(this.file.isDirectory())
            this.pointerEntityType = PointerEntityType.Directory;
        else if (this.file.isFile())
            this.pointerEntityType = PointerEntityType.File;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }    
    
}
