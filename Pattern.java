// public class Pattern {
//     public static void main(String[] args) {
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
        
//     }
// }



//OR IT CAN ALSO BE DONE USING LOOPS CONCEPTS
// public class Pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//QUESTIONS ON PATTTERNS
//1. *****
//   *****
//   *****
//   ***** 

//using nested loops 
// public class Pattern{
//     public static void main(String[] args){
//         for (int i =1; i<=4; i++){  //for rows
//             for (int j =1; j <=5; j++){    //columns
//                 System.out.print("*");   //will print the stars in the same line
//             }
//             System.out.println("*");    //will print the stars in the next line 
//         } 

//     }
// }



//2. *****
//   *   *
//   *   *
//   *****


// public class Pattern{
//     public static void main(String []args){
//         for (int i=1; i<=4; i++){
//             for (int j=1; j<=5; j++){
//                 if (i==1 || i==4 || j==1 || j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");   //because we want to print space in the middle of the pattern
//                 }
//             }
//             System.out.println();
//         }

//     }
// }
    


// or

//half upward pyramid pattern


// public class Pattern{
//     public static void main(String [] args){
        
//         for (int i=1; i<=5; i++){
//             for (int j=1; j<=i; j++){  //here j<=i because we want to print the stars in the same line and the number of stars will be equal to the number of rows
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//downward half pyramid pattern
// ****
// ***
// **
// *

// public class Pattern{
//     public static void main(String [] args){
//         for(int i=4; i>=1; i--){
//             for (int j=1; j <=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }

// }
//or

// public class Pattern{
//     public static void main(String [] args){
//         int n =20;
//         for(int i=n; i>=1; i--){
//             for (int j=1; j <=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }

// }




//pattern 
//          *           3 spaces and 1 star
//         **           2 spaces and 2 stars
//        ***           1 space and 3 stars
//       ****           0 spaces and 4 stars


// public class Pattern{
//     public static void main(String [] args){
//             int n = 4;
//         for (int i=1; i<=n; i++){   //for rows
//             for (int j=1; j<=n-i; j++){  //for spaces
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=i; j++){    //for stars
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Pattern{
//     public static void main(String [] args){
//         int n=30;
//         for (int i=1; i<=n; i++){
//             for (int j =1 ; j<=i; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Pattern {
//     public static void main(String args[]){
//         int n =40;
//         for (int i =1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }

// }

// public class Pattern{
//     public static void main(String [] args){
//         int n=10;
//         int number = 1;

//         //outer loop for printing numbers
//         for (int i =1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(number+ " ");
//                 number++;  
//             }
//             System.out.println();
//         }
//     }
// }


// public class Pattern{
//     public static void main(String [] args){
//         int n=5;
//         for (int i =1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j) %2 == 0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }      
//                 System.out.println("");
//             }
//         }
//     }
