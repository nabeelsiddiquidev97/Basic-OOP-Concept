//A program that takes 3 no.s input in a text file present in a specific path, accesses it and then prints its contents.
//This program uses Java IOStream in order to access any file and get its contents.
import java.io.*;

/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */

public class IOStreamProgram {
public static void main(String[] args) {
   File f;
   try{
       byte bwrite[]={65,66,67,68,69};
       f=new File("C:/nabs/test.txt");
       OutputStream os=new FileOutputStream(f);
       for(int x=0;x<bwrite.length;x++)
       {
           os.write(bwrite[x]);
       }
      InputStream is=new FileInputStream("C:/nabs/test.txt");
      int size= is.available();
     System.out.println(size);
          for(int i=0;i<size;i++){
           System.out.println(is.read()+" ");}
          is.close();
    }
   catch (IOException e){
System.out.println("file not exist");
}}}
