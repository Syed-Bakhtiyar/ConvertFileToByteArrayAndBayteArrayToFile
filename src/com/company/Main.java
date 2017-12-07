package com.company;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("E:\\Jab Kisiki Taraf Dil-Kumar Sanu--Raag.Me-- (1).mp3");
        FileInputStream fis = new FileInputStream(file);
//System.out.println(file.exists() + "!!");
//InputStream in = resource.openStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //no doubt here is 0
//Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            System.out.print(""+ex);
        }
        byte[] bytes = bos.toByteArray();
//below is the different part
        File someFile = new File("C:\\Users\\ikodePC-1\\Desktop\\Bakhtiyar_1\\java.mp3");
        try {


            FileOutputStream fos = new FileOutputStream(someFile);
            fos.write(bytes);
            fos.flush();
            fos.close();

        }catch (Exception e){

            System.out.println(e.toString());

        }
    }
}
