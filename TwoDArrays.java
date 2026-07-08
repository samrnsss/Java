// import java.util.Scanner;
// public class TwoDArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[] [] numbers = new int [rows] [cols];

//         //inputting values in the 2D array
//         //rows
//         for (int i = 0; i < rows; i++) {

//             //columns
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         //output
//         for (int i=0; i<rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(numbers[i][j] + " "); //here space is used to separate the numbers in the same row
//             }
//             System.out.println();
//         }
//     }
    
// }



//Qs- Take a matrix as input from the user and search for a given number x and print the indices at which it occurs.
import java.util.Scanner;
public class TwoDArrays{
    public static void main(String args[]){
        //for taking input from the user
        Scanner sc = new Scanner(System.in);
        //taking the number of rows and columns from the user
        int rows = sc.nextInt();
        int cols = sc.nextInt();    
        System.out.println("Enter the number of rows and columns");
        //creating a 2D array
        int arr[] [] = new int[rows][cols];
        //taking input for the 2D array
        System.out.println("Enter the elements of the array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //taking the number to be searched from the user
        System.out.println("Enter the number to be searched");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == x){
                    System.out.println("x found at location: (" + i + "," + j + ")");
                }
            }
        }
    }
}


