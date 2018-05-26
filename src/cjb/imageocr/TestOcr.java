package cjb.imageocr;

import java.io.File;  
import java.io.IOException;  
  
public class TestOcr {  
  
    public static void main(String[] args) {  
        // TODO 自动生成的方法存根  
        //输入图片地址    
//        String path = "G:/ka.jpg";
//    	String path = "D:/OCRTest/images/trans/2.png";
//        PictureManage pictureManage = new PictureManage(path); //对图片进行处理  
//        pictureManage.imshow();  
        try {       
//            String valCode = new OCR().recognizeText(new File("xintu.jpg"), "jpg");//jpg是图片格式       
        	String valCode = new OCR().recognizeText(new File("D:/OCRTest/images/trans/4.png"), "png");//jpg是图片格式
            System.out.println("图片中文字为："+"\n"+valCode);       
        } catch (IOException e) {       
            e.printStackTrace();       
        } catch (Exception e) {    
            e.printStackTrace();    
        }        
    }    
  
}  