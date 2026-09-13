import java.util.Scanner;

public class calculator {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter the first number:");
        double num1 = sc.nextDouble();  //double is used to store decimal values
        System.out.println("enter the second number:");
        double num2 = sc.nextDouble();
        double result = 0; //to store the result of the calculation
        System.out.println("enter the operator (+, -, *, /, %):");
        char op = sc.next().charAt(0); //to read the operator as a

        switch(op){
            case '+': 
                result = num1 + num2;
                System.out.println("result: " + result);
                break;

            case '-':
                if (num1>num2){
                result = num1 - num2;
                System.out.println("result: " + result);
                } else {
                System.out.println("result: " + (- result));
            }   
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                result = num1 / num2;
                System.out.println("result: " + result);
                } else {
                System.out.println("Error: Division by zero is not allowed.");
            } 
                break;

            case '%':
                if (num2 != 0) {
                result = num1 % num2;
                System.out.println("result: " + result);
                } else {
                System.out.println("Error: Division by zero is not allowed.");
            } 
                break;
                
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
    
}
