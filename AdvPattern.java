//butterfly pattern
// public class AdvPattern {
//     public static void main(String args[]){
//         int n=5;
//         //uppper half 
//         for (int i = 1; i <= n; i++){
//             //first part 
//             for (int j =1; j<=i; j++){
//             System.out.print("*");
//         }
//         //spaces
//         int spaces = 2*(n-i);
//         for(int j=1; j<=spaces; j++){
//             System.out.print(" ");
//         }
//         //second part
//         for(int j =1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//         }


//         //lower half 
//         for (int i = n; i>=1; i--){
//             //first part 
//             for (int j =1; j<=i; j++){
//             System.out.print("*");
//         }
//         //spaces
//         int spaces = 2*(n-i);
//         for(int j=1; j<=spaces; j++){
//             System.out.print(" ");
//         }
//         //second part
//         for(int j =1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//         }
//     }
// }



//solid rhombus 
// public class AdvPattern{
//     public static void main(String args []){
//         int n =5;
//         for (int i=1; i<=n; i++){
//             //spaces 
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//     }
// }      

//number pyramid
// public class AdvPattern{
//     public static void main(String args []){
//         int n =5;
//         for (int i=1; i<=n; i++){
//             //spaces 
//             for(int j =1; j <=n-i; j++){
//                 System.out.print(" ");
//             }
//             //numbers will be assame as row number
//             for(int j =1 ; j <=i; j ++){
//                 System.out.print( i + " ");
//             }
//             System.out.println();
//         }
//     }
// }



//palindromic pattern
// public class AdvPattern{
//     public static void main(String args []){
//         int n =5;
//         for (int i=1; i<=n; i++){
//             //spaces 
//             for(int j =1; j <=n-i; j++){
//                 System.out.print(" ");
//             }
//             //first half numbers
//             for(int j =i ; j >=1; j --){
//                 System.out.print( j );
//             }
//             //second half numbers
//             for(int j =2 ; j <=i; j ++){
//                 System.out.print( j );
//             }
//             System.out.println();
//         }
//     }
// }

//diamond pattern
// public class AdvPattern{
//     public static void main(String args []){
//         int n =4;
//         for(int i =1; i<=n; i++){
//             //spaces 
//             for(int j =1; j <=n-i; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j =1 ; j <= 2*i-1; j ++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //lower half of diamond 
//         for (int i=n; i>=1; i--){
//             //spaces
//             for(int j =1; j <=n-i; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j =1 ; j <=2*i-1; j ++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


