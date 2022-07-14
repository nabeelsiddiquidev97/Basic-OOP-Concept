import java.util.Scanner;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
public class FindEvenOddPrime {

    public static void main(String[] args) {
    Scanner nab=new Scanner(System.in);
    System.out.println("What you want to Find?");
       
       System.out.println("Press 1: Even Numbers ");
       System.out.println("Press 2: Odd Numbers ");
       System.out.println("Press 3: Prime Numbers: ");
       int x=nab.nextInt();
       switch(x){
           case 1:
              System.out.println("***Even Numbers***"); 
               System.out.println("Enter your Number: ");
                       int k=nab.nextInt();
               if(k%2==0){
                   System.out.println("Your Number Is Even");}
               else
               System.out.println("Number Is Not an Even");
                   break;
           case 2:
                 System.out.println("***ODD Numbers***"); 
               System.out.println("Enter your Number: ");
                       int m=nab.nextInt();
               if(m%2!=0){
                   System.out.println("Your Number Is Odd");}
               else
               System.out.println("Number Is Not an Odd");
                   break;  
           case 3:
               System.out.println("***Prime Numbers***"); 
              System.out.println("Enter your Number: ");
               int num=nab.nextInt(); 
            if(num==0)
                System.out.println("Not a Prime!");
            else if(num==1)
                System.out.println(num+" is a Prime Number!");
                   boolean flag = false;
         for (int i=2; i < num ;i++ ){
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }         }
        if (!flag)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is not a Prime number.");
                                default:
                   System.out.println("Invalid Entry");
}
       }
    }
