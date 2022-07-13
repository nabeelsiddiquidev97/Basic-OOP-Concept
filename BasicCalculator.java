//Program to implement a calculator that performs all basic tasks. using switch and scanner(for user input).
import java.util.Scanner;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */

public class BasicCalculator{
    public static void main(String[] args) {
     Scanner nab=new Scanner(System.in);
     System.out.println("Welcome to Calculator");
      System.out.println("Press 1: For Addition ");
       System.out.println("Press 2: For Subtraction ");
       System.out.println("Press 3: For Multiplication ");
       System.out.println("Press 4: For Division ");
       int x=nab.nextInt();
       switch(x){
           case 1:
               System.out.println("***Addition***");
               System.out.println("Press first number: ");
               int a=nab.nextInt();
               System.out.println("Press Second number: ");
               int b=nab.nextInt();
               int c=a+b;
               System.out.println("Your Answer is: "+c);
               break;
           case 2:
               System.out.println("***Subtraction***");
               System.out.println("Press first number");
               int d=nab.nextInt();
               System.out.println("Press Second number");
               int e=nab.nextInt();
               int f=e-d;
               System.out.println("Your Answer is: "+f);
               break;
            case 3:
               System.out.println("***Multiplication***");
               System.out.println("Press first number: ");
               int ab=nab.nextInt();
               System.out.println("Press Second number: ");
               int ba=nab.nextInt();
               int ca=ab*ba;
               System.out.println("Your Answer is: "+ca);
                break;
            case 4:
               System.out.println("***Division***");
               System.out.println("Press first number");
               int ac=nab.nextInt();
               System.out.println("Press Second number");
               int bc=nab.nextInt();
               if(bc==0){
                 System.out.println("Infinity");
                 break;
               }
               int cb=ac/bc;
               
               System.out.println("Your Answer is: "+cb);  
                break;
                 default:
                   System.out.println("Invalid Entry");
       }
    }
}
