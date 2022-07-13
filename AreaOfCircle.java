import java.util.Scanner;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
public class AreaOfCircle{

    public static void main(String[] args) {
       Scanner nab=new Scanner(System.in);
       System.out.println("What you want to Find?");
       System.out.println("Press 1: For Area of A Circle ");
       System.out.println("Press 2: For Vuolume of a Cube ");
       int x=nab.nextInt();
       switch(x){
           
           case 1:
       System.out.println("Enter the radius to find the Area of a Circle: ");
       int rad=nab.nextInt();
       double area=rad*(3.142)*(3.142);
       System.out.println("The Area OF your Circle is: "+area);
       break;
       
           case 2:   
       System.out.println("Enter the length of a Cube: ");
       int l=nab.nextInt();
       System.out.println("Enter the breath of a Cube: ");
       int b=nab.nextInt();
       System.out.println("Enter the hieght of a Cube: ");
       int h=nab.nextInt();
       double vol=l*b*h;
       System.out.println("The Volume OF your Cube is: "+vol);
       break;
           default:
                   System.out.println("Invalid Entry");
       }
        
    } 
}
