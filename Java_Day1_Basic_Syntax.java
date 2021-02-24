//Java Basics 
// Day 1 

//Import The Scanner Class 
import java.util.*;
public class Java_Day1_Basic_Syntax {
   public static void main(String[] args) {


    //Output and Inputs 


    Scanner Input = new Scanner(System.in); //Create the Scanner object to allow for user input 


    String MyString = Input.nextLine();//Next Line value or String value 
    System.out.println("Youer entry string is:" + MyString);

    int MyInt = Input.nextInt(); ///Next int Value
    System.out.println("Youer entry integer is:" + MyInt);

    float MyFloat = Input.nextFloat();// Next float value 
    System.out.println("Yout entry float is: "+ MyFloat); 
    

    //Variables 


    int a,b,c,d ; //Decalred 4 variables 

    int a2 = 10 , b2 = 12; //Instatiate the 2 variables you have juyst declared 

    byte B = 22;//Decalre and assign a value of 22 butes for B  

    double pi = 3.14159; //Decare and assign a value to the double 

    char a3 = 'a';// Declare and create a variable named a3 and instantiate it with a single character 


    //Data Types 

    //Arrays 

        //Array Declaration
        int intArray1[]; 
        //or 
        int [] intArray2;

        //Allocating memory 
        
        intArray1 = new int[20];
        
        //Instantiate the Array 

        int[] NumberArray = new int[]{1,2,3,4,5,6,7,8,9,10};

          //initilization of an array 

            //manually 
            intArray1 = new int[6]; //Give memory

            intArray1[0] = 12;
            intArray1[1] = 12;
            intArray1[2] = 12;
            intArray1[3] = 12;
            intArray1[4] = 12;
            intArray1[5] = 12;

            //For loop 

            for( int i = 0; i < intArray1.length;i++){
                System.out.println("Elements at index"+i+ ":" +intArray1[i]);
            }

            //initlize a array of objects 
                 //create the object 

                    //Create the student object 

                    Student[] arr = new Student[4]; //Create a student obkject that is a array 

            //Populate the Array of Objects 

            arr [0] = new Student(100, "Simba");

             arr [1] = new Student(101, "Themba");

             arr [2] = new Student(102, "Anila");

             arr [3] = new Student(103, "Lawrence");

             for (int i = 0; i < arr.length; i++) {
                 System.out.println("Student at index "+i+":"+arr[i].Student_Number+" "+arr[i].student_Name);
             }


    //Lists 

        //Array Lists 

            List<String> arrStrinng = new ArrayList<String>(); //Declare 

            //Populate 

            arrStrinng.add("Jaap");
            arrStrinng.add("Jaap");
            arrStrinng.add("Jaap");
            arrStrinng.add("Jaap");
            arrStrinng.add("Koos");

            System.out.println(arrStrinng);

            //Itterate 

            Iterator itr = arrStrinng.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            //Remove elements
            
            arrStrinng.remove(1);
            arrStrinng.remove("Koos");
        

        //Linked List 

            //Declare 

            List<Integer> number = new LinkedList<Integer>();

            //Appending elements at the ed of a Linked List 

            for (int i = 0; i < 5; i++) {

                    number.add(i);
                }   

            //Itterating thr ough elements 

            for (int i = 0; i < number.size(); i++) {

                System.out.print(number.get(i) +" ");
                
            }

            //Removing Elements 

            number.remove(4);


            //print the linked list 

            System.out.println(number);


        //Vector 
            //Set the size of the vector 
                int n = 5; 

            //Declare the List with initial size n 
                List<Integer> vctr = new Vector<Integer>(n);

            //Append the new elements at the end of the list 

            for (int i = 0; i < n; i++) {
                vctr.add(i);
            }

            //print the elements 

            System.out.println(vctr);

            //Remove item 
            vctr.remove(1);

            //Itterate through the list 

            for (int i = 0; i < n; i++) {
                
                System.out.println(vctr.get(i));
            }

        //Stack 
            //Create the stack 
            Stack<Integer>  stc = new Stack<Integer>();
            
            //Check if stack is empty or not 

            boolean Result = stc.isEmpty();

            //Pushing element to the stack 

            stc.push(12);

            //Print elemnts of the stack 
            System.out.println(stc);

            //Remove a element form a stack 
             
            System.out.println(stc.pop());

            //Display the size of the stack 

            System.out.println(stc.size());

            //Iterating through a stack 

            for (int i = 0; i < stc.size(); i++) {
               System.out.println(stc.get(i));
            }

    }     

   
}
//Create the Student Class 
class Student {

    //Fields
    int Student_Number; 
    String student_Name;

    //Constructor 

    Student(int stdNumber,String stdName){
        this.student_Name = stdName;
        this.Student_Number = stdNumber;
    }
}