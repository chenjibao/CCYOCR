package cjb.utils;

import java.awt.image.BufferedImage;

import cjb.com.jhlabs.image.DiffusionFilter;
import cjb.com.jhlabs.image.MapColorsFilter;
import cjb.com.jhlabs.image.ScaleFilter;
//import main.java.com.jhlabs.image.DiffusionFilter;
//import main.java.com.jhlabs.image.MapColorsFilter;
//import main.java.com.jhlabs.image.ScaleFilter;
//import com.jhlabs.image.DiffusionFilter;
//import com.jhlabs.image.MapColorsFilter;
//import com.jhlabs.image.ScaleFilter;
import net.sourceforge.tess4j.util.ImageHelper;

public class ImageUtil {

    public static BufferedImage filter(BufferedImage src) {
        DiffusionFilter diffusionFilter = new DiffusionFilter();
        MapColorsFilter mapColorsFilter = new MapColorsFilter();
        return mapColorsFilter.filter(diffusionFilter.filter(src, null), null);
    }

    public static BufferedImage filterAndScale(BufferedImage src) {
        DiffusionFilter diffusionFilter = new DiffusionFilter();
        MapColorsFilter mapColorsFilter = new MapColorsFilter();
        ScaleFilter scaleFilter = new ScaleFilter(572, 88);
        return scaleFilter.filter(mapColorsFilter.filter(diffusionFilter.filter(src, null), null), null);
    }

    public static BufferedImage toBinary(BufferedImage src) {
        return ImageHelper.convertImageToBinary(src);
    }

    public static BufferedImage toGray(BufferedImage src) {
        return ImageHelper.convertImageToGrayscale(src);
    }
    
    

}
