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
// import java.util.Scanner;
// public class TwoDArrays{
//     public static void main(String args[]){
//         //for taking input from the user
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows and columns");
//         //taking the number of rows and columns from the user
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();    

        
//         //creating a 2D array
//         int numbers[][] = new int[rows][cols];
//         //taking input for the 2D array
//         System.out.println("Enter the elements of the array");

//         //rows input
//         for(int i=0; i<rows; i++){
//             //columns input
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         //taking the number to be searched from the user
//         System.out.println("Enter the number to be searched");

//         int x = sc.nextInt();
        
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(numbers[i][j] == x){
//                     System.out.println("x found at location: (" + i + "," + j + ")");
//                 }
//             }
//         }
//     }
// }


//Qs- Print the spiral order matrix as output for a given matrix of numbers
//eg-  1  5  7 9 10 11
//     6 10 12 13 20 21
//     9 25 29 30 32 41 
//    15 55 59  63 68 70
//    40  70 79 81 95  105

// import java.util.Scanner;

// public class TwoDArrays {
//     public static void main(String args[]) {
//         Scanner sc =new Scanner(System.in);
        
//         System.out.println("Enter the number of rows and columns");
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int matrix[][] = new int[n][m];

//         System.out.println("Enter the elements of the matrix");
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("The spiral order of the matrix is: ");
//         int rowStart = 0;
//         int rowEnd = (n - 1);
//         int colStart = 0;
//         int colEnd = m-1;
        
//         while(rowStart <= rowEnd && colStart <= colEnd){

//             //1
//             for(int col=colStart; col<=colEnd; col++){
//                 System.out.print(matrix[rowStart][col] + " ");
//             }
//             rowStart++;

//             //2
//             for(int row=rowStart; row<=rowEnd; row++){
//                 System.out.print(matrix[row][colEnd] + " ");
//             }
//             colEnd--;

//             //3
//             for(int col=colEnd; col>=colStart; col--){
//                 System.out.print(matrix[rowEnd][col] + " ");
//             }
//             rowEnd--;

//             //4
//             for(int row=rowEnd; row>=rowStart; row--){
//                 System.out.print(matrix[row][colStart] + " ");
//             }
//             colStart++;

//             System.out.println();
//         }
//     }
// }


//for a given matrix N x M print its transpose 
//a transpose of matrix means changing its row elements to column elements and vice versa
import java.util.Scanner;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements of the matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of the matrix is: ");
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}