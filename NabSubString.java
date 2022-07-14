//A program that extracts username, domain and extension information from an email address.
//This program uses a string class method called **substring** to get the specific text from any string. 
//Further, you can explore string class by using its multiple methods like Trim, Replace etc.
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
public class NabSubString {
    public static void main(String[] args) {
     Scanner nab=new Scanner(System.in);
     System.out.println("Enter Your Email: ");
     String a=nab.next();
     String b=a.substring(0,a.indexOf('@'));
     System.out.println("User Name: "+b);
     String c=a.substring((a.indexOf('@')+1),a.indexOf('.'));
     System.out.println("Domain: "+c);
     String d=a.substring((a.indexOf('.')+1),a.length());
     System.out.println("Extension: "+d);
       }
    }
