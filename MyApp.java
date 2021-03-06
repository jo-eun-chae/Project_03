import java.io.*;

/** 
 * 선문 로고 이미지를 복사하는 MyApp 입니다.
 *
 * @author (2019315011 조은채, 2019315026 전유정)
 * @version (2020.10.14)
 */
public class MyApp
{
    public static void main(String[] args){
        try{
            File inputFile = new File
                ("C:\\Users\\Jo Eanchae\\Desktop\\2020 - 2학기\\프로그래밍응용2(PBL)\\Project_03 (20201014)\\sunmoon.jpg");
            FileInputStream fis = new FileInputStream(inputFile);
            BufferedInputStream bis = new BufferedInputStream(fis, 20);

            File outputFile = new File
                ("C:\\Users\\Jo Eanchae\\Desktop\\2020 - 2학기\\프로그래밍응용2(PBL)\\Project_03 (20201014)\\Result\\sunmoon-copy.jpg");
            FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 20);

            int c;
            while((c = fis.read()) != -1){
                fos.write((byte)c);
            }
            
            System.out.println("입력 파일 : " + inputFile.getPath() + " (파일크기 = " + inputFile.length() + ")");
            System.out.println("출력 파일 : " + outputFile.getPath() + " (파일크기 = " + outputFile.length() + ")");
            
            fis.close();
            fos.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}