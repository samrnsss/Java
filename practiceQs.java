//1. Enter 3 numbers from the user and make a function to print their average.
// import java.util.Scanner;
// public class practiceQs {
//     public static double  averageOfThree(double a, double b, double c){
//         double average = (a+b+c)/3;
//         System.out.println("The average is: " + average);
//         return average;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3 numbers: ");
//         double a = sc.nextDouble(); //pass the values to the function
//         double b = sc.nextDouble();
//         double c = sc.nextDouble();
//         double result = averageOfThree(a,b,c);
//         System.out.println("The average is: " + result);
//     }

// }

///////////first code is not entirely correct, so here is the second code which is correct and complete.
/// i kept the first code to show myself the difference between the two codes. The second code is correct and complete.
//// in first code, I was printing the average twice, once in the function and once in the main method. In the second code, I am only printing it once in the function and returning it to the main method.



// import java.util.Scanner;
// public class practiceQs {

//     public static double  average(double a, double b, double c) {
//         double avg = (a + b + c) / 3;
//         System.out.println("Average = " + avg);
//         return avg;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 3 numbers: ");
//         double a = sc.nextDouble();
//         double b = sc.nextDouble();
//         double c = sc.nextDouble();
//         average(a, b, c);
//     }
// }


//2. Write a program to print the sum of all odd numbers from 1 to n using a function.

// import java.util.Scanner;
// public  class practiceQs {
//     public static void oddSum(int n){
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             if (i%2 !=0){
//                 sum += i;
//             }
//         }
//         System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
//     }
//     public static void main (String args[]){
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             oddSum(n);
//         }
//     }




//3.write a function which takes in 2 numbers and returns the greater of those two.
// import java.util.Scanner;
// public class practiceQs {
//     public static int greater(int a, int b){
//         if(a>b){
//             return a;
//         }
//         else{
//             return b;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 2 numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int result = greater(a,b);
//         System.out.println("The greater number is: " + result);
//     }
// }



//4. WRITE A FUNCTION THAT TAKES IN THE RADIUS AS INPUT AND RETURNS THE CIRCUMFERENCE  OF THE CIRCLE.
// import java.util.Scanner;
// public class practiceQs {
//     public static double circumference (double r, double pi){
//         double c = 2 * (pi) * r;


//         return c;
//     }
//     public static void main (String args []){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the radius of the circle: " );
//         double r= sc.nextDouble();
//         System.out.print("Enter the value of pi: ");
//         double pi= sc.nextDouble();
//         double result = circumference(r, pi);
//         System.out.println("The circumference of circle with radius " + r  + " is: " + result + " cm");
//     }
// }


// //5.Write a function thst takes in age as an input and returns whether that person is eligible to vote or not. (age>18)

// import java.util.*;
// public class practiceQs {
//     public static boolean isEligible (int age){
//         if( age >= 18){
//             return true;
//         }
//             return false;
//         }
//             public static void main (String args []){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println(isEligible(age));
//     }
// }


//6.Write an infinite loop using do while condition.
// public class practiceQs {
//     public static void main(String args[]){
//         do{
//             System.out.println("you're beautiful ,aashna.");
//         }while(true);
//     }
// }


// 7. write a program to run the number till the user wants and at the end it should display the count of positive, negative and zeros entered.
// import java.util.Scanner;
// public class practiceQs {
//     public static void main(String[] args) {
        
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         System.out.println("Press one to continue and 0 to stop.");
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         while (input == 1){
//             System.out.println("enter your number:");
//             int number = sc.nextInt();
//             if (number > 0) {
//                 positiveCount++;
//             }else if (number < 0) {
//                 negativeCount++;
//             } else {
//                 zeroCount++;
//             }
//             System.out.print("Press 1 to continue and 0 to stop.");
//             input = sc.nextInt();
//         }
//         System.out.println("Count of positive numbers: " + positiveCount);
//         System.out.println("Count of negative numbers: " + negativeCount);  
//         System.out.println("Count of zeros: " + zeroCount);
//         sc.close();
//     }
// }


// 8. Two numbers are entred by the user x and n . write a functin to find the value of the number raised to the power of another i.e. x^n
// import java.util.*;
// public class practiceQs {
//     public static void main(String args[]) {
//         System.out.println("Enter x");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         System.out.println("Enter n");
//         int n = sc.nextInt();
//         int result = 1;
//         //Please see that n is not too large or else result will exceed the size of int
//         for(int i=0; i<n; i++) {
//             result = result * x;
//         }
//         System.out.println("x to the power n is : "+ result);
//     }   
// }



//9. write a program to find the GCD of two numbers using function.

// import java.util.Scanner;
// public class practiceQs {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
        
//         while(n1 != n2){
//             if(n1 >n2){
//                 n1 = n1 -n2;
//             }else{
//                 n2 = n2- n1;
//             }
//         }
//         System.out.println("The GCD of the two numbers is: " + n1);
//     }    
// }



//10. fibonacci series using function
// import java.util.Scanner;
// public class practiceQs {
//     public static void main(String args []){
//         int a =0;
//         int b =1;

//         System.out.println(a+ " ");
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         if(n>1){
//         for(int i=2; i<=n; i++){  // here i=2 because we have already printed the first two numbers of the series.      
            
//             System.out.print(b + " ");
//             int temp = b;    // int can only store balues from -2,147,483,648 to 2,147,483,647. if the value exceeds this limit then it will give wrong output.
//             b=a +b;         //swapping the values of a and b to get the next number in the series.
//             a=temp;
//         }
//         System.out.println();
//     }
// }
// }
    



// /fibonacii series print

// import java.util.Scanner;
// public class Array{
//     public static void main(String args[]){
        
//         int n1 = 0, n2 = 1, n3, i, count;
//         Scanner sc = new Scanner(System.in);
//         count = sc.nextInt();
//         System.out.print(n1 + " " + n2);
//         for(i = 2; i < count; ++i){
//             n3 = n1 + n2;
//             System.out.print(" " + n3);
//             n1 = n2;
//             n2 = n3;
//         }                                                                
        
//     }
// }