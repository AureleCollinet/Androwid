package com.upem.dessinetout;

import android.graphics.Path;

/**
 * Created by laune on 05/04/2018.
 */

public class FingerPath {
    public int color;
    public int strokeWidth;
    public Path path;

    public FingerPath(int color, boolean emboss, boolean blur, int strokeWidth, Path path){
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }

}
