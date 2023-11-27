// import java.util.HashMap;
import java.util.Scanner;
 
// Main class
public class javaFirstTask {
 
    // Main driver method
    public static void main(String[] args)
    {
        
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();

        int lengthFirst = str1.length();
        int lengthSecond = str2.length();

        System.out.println("The Length of the first string is " + lengthFirst);
        System.out.println("The Length of the second string is " + lengthSecond);

        if(lengthFirst==lengthSecond){
            System.out.println("The length of the two strings are the same ");
        }
        else{
            System.out.println("The length of the two strings is not the same ");
        }

        if(str1.equals(str2)){
            System.out.println("Two strings are equal");
        }
        else{
            System.err.println("Two strings are not equal");
        }
        

    }
}