import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Div;
import org.graalvm.compiler.word.Word;

import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32.INPUT_RECORD;

//Q1 Check if number is Even 

public class Day_1_Excercises {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a*a++);

        a++;
        
    }
    
}

//Q2 How to test if a number is prime 

/*public class Day_1_Excercises {

    public static void main(String[] args) {

        Scanner InputNUmber = new Scanner(System.in);

        int X ; 

        System.out.println("Enter the Number you would like to test");
        X = InputNUmber.nextInt();

        if (((X/2) % 2 != 0 )&&(X != 1)) {
            System.out.println("The number is Prime ");
        }else{
            System.out.println("THe number is not prime");
        }
    }
}*/

//Q3  For to while loop conversion 

/*public class Day_1_Excercises {

    public static void main(String[] args) {

        int i  = 0; 

        while (i<10) {
            System.out.println(i);
            i++;
        }

    }
}*/

//Q4  

//Q5 Square root 

/*public class Day_1_Excercises {

    public static void main(String[] args) {
        
        double X  = 0; 

        Scanner InputNumber = new Scanner(System.in);
        System.out.println("Enter a number ");

        X = InputNumber.nextDouble();

        if ((Math.sqrt(X)) % 2 == 0) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}*/


//Q6 Test if amstring number 

/*public class Day_1_Excercises {

    public static void main(String[] args) {

        int didget1, didget2, didget3 , sum;

        String Number; 

        Scanner InputNum = new Scanner(System.in);

        System.out.println("Enter a number");

        Number = InputNum.nextLine();

        didget1 = Character.getNumericValue(Number.charAt(0));

        didget2 = Character.getNumericValue(Number.charAt(1));

        didget3 = Character.getNumericValue(Number.charAt(2));

        sum = (int)Math.pow(didget1, 3) +(int) Math.pow(didget2, 3)+ (int) Math.pow(didget3, 3);

        if (sum == Integer.parseInt(Number)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}*/

//Q7 Reverse a string 

/*public class Day_1_Excercises {

    public static void main(String[] args) {
        
        String word; 
        String reverse = "";

        Scanner InputWord = new Scanner(System.in);
        System.out.println("Enter a word ");

        word = InputWord.nextLine();

        for (int i = word.length()-1; i >= 0; i--) {
           reverse = reverse + word.charAt(i); 
        }

        System.out.println(reverse);

    }
}*/

//Q8

//Q9

//Q10
