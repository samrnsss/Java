// public class returnconcept {
//     public static int sumOfNumbers(int n){
//         int sum =0;
//         if(n < 0){
//             return -1;
//         }
//         for (int j=1; j<=n; j++){
//             sum += j;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {

//         int result = sumOfNumbers(5);

//         System.out.println(result);
//     }
// }

//its overloading concept of return type.
// import java.util.Scanner;
// public class returnconcept {
//     //here we are overloading the method sumOfNumbers with different parameter types (int and double)
//     public static int sumOfNumbers(int a, int b){
//         return a+b;
//     }
//     //overloading the method sumOfNumbers with different parameter types (int and double)
//     public static double sumOfNumbers(double a, double b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the first number:");
//         double a = sc.nextDouble();
//         System.out.println("Enter the second number:");
//         double b = sc.nextDouble();
//         System.out.println(sumOfNumbers(a, b));
//     }
// }

