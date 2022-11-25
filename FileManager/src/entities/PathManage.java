package entities;

import java.io.File;

public class PathManageBase {
    private File cacheNextPath;
    private File cacheBackPath;
    
    public File getCacheNextPath() {
        return cacheNextPath;
    }

    public void setCacheNextPath(File cacheNextPath) {
        this.cacheNextPath = cacheNextPath;
    }

    public File getCacheBackPath() {
        return cacheBackPath;
    }

    public void setCacheBackPath(File cacheBackPath) {
        this.cacheBackPath = cacheBackPath;
    }
    
    
}
