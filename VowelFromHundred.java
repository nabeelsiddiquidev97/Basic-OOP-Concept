//A program that generates 100 random numbers but only prints vowels.
//The basic idea of the Java Program is to Determine the Unicode Code Point at the Given Index in String. 
//Since the Unicode value for English capital letters lies between 65 to 90. Therefore this program is interesting to learn about.
//This program also uses Math.Random function imported from java Math package. Do also explore these math functions.
import java.lang.Math;

/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */

public class VowelFromHundred {
    public static void main(String[] args) {
    char a=(char) (Math.random()*101);
         for(a=1;a<100;a++){
         if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')){
        System.out.println(a);  }
    }
    }
    }
