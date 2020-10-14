import java.io.*;

/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        File inputFile = new File
            ("C:\\Users\\Jo Eanchae\\Desktop\\2020 - 2학기\\프로그래밍응용2(PBL)\\연습\\Project_03 (20201014)\\sunmoon.jpg");
        FileInputStream fis = new FileInputStream(inputFile);
        BufferedInputStream bis = new BufferedInputStream(fis, 20);
        
        File outputFile = new File("C:\\Users\\Jo Eanchae\\Desktop\\2020 - 2학기\\프로그래밍응용2(PBL)\\연습\\Project_03 (20201014)\\sunmoon-copy.jpg");
        FileOutputStream fos = new FileOutputStream(outputFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos, 20);
        
        int c;
        while((c = fis.read()) != -1){
            fos.write((byte)c);
        }
        fis.close();
        fos.close();
    }
}
