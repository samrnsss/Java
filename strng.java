// public class strng {     
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("ENTER YOUR NAME: " + name);

//     }
// }



// concatenation of string
// public class strng {
//     public static void main(String[] args) {
//         String firstName = "John";
//         String lastName = "Doe";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName);
//         for (int i = 0; i < fullName.length(); i++) {
//             System.out.println(fullName.charAt(i));
//         }
//     }
// }


// compare 
// public class strng {
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "World";
//         String str3 = "Hello";

//         System.out.println(str1.equals(str2)); // false
//         System.out.println(str1.equals(str3)); // true
//         System.out.println(str1.compareTo(str2)); // negative value
//         System.out.println(str1.compareTo(str3)); // 0

//         String name1 = "Alice";
//         String name2 = "Bob";

//         if(name1.compareTo(name2) == 0) {
//             System.out.println("The names are equal.");
//         } else if(name1.compareTo(name2) < 0) {
//             System.out.println("name1 is less than name2.");
//         } else {
//             System.out.println("name1 is greater than name2.");
//         }
//     }
// }



// substring
// public class strng {
//     public static void main(String[] args) {
//         String sentence = "Tony@Stark";
//         String name = sentence.substring(4);
//         String name1 = sentence.substring(3, sentence.length());
//         String name2 = sentence.substring(0, 4);
//         System.out.println(name); // Output: Stark
//         System.out.println(name1); // Output: y@Stark
//         System.out.println(name2); // Output: Tony
//     }
// }


// homework problems
// 1. Take an array of Strings input from the user and find the cumulative(combined) length of all those strings.

// import java.util.Scanner;   
// public class strng {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER SIZE OF ARRAY: ");

//         int size = sc.nextInt();
//         sc.nextLine(); // Consume the newline character
//         String[] strings = new String[size];
//         int completeLength = 0;
//         System.out.println("ENTER " + size + " STRINGS: ");

//         for(int i = 0; i < size; i++){
//             strings[i] = sc.nextLine();
//             completeLength += strings[i].length();
//         }
//         System.out.println("CUMULATIVE LENGTH OF ALL STRINGS: " +completeLength);
//         sc.close();
//     }
// }


// 2. Take a string input from the user and  create a new string called 'result' 
// in which you will replace the letter "e" in the original string with  "i"
//example: original = "eabcdef" so result = "iabcdif"
//original = "hello" so result = "hillo"
//original = "xyz" so result = "xyz" (no change)

// import java.util.Scanner;
// public class strng {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER A STRING: ");
//         String original = sc.nextLine();
//         String result = "";
//         for(int i = 0; i < original.length(); i++){
//             if(original.charAt(i) == 'e'){
//                 result += 'i';
//             } else {
//                 result += original.charAt(i);
//             }
//         }
//         System.out.println("RESULTING STRING: " + result);
//         sc.close();
//     }
// }




//ParseInt method of integer class is used to convert a string into an integer.
// public class strng {
//     public static void main(String args[]){
        
//         String str = "123";
//         int number = Integer.parseInt(str);
//         System.out.println(number);
        
//     }
// }


//toString mwthod of integer class is used to convert an integer into a string.
// public class strng {
//     public static void main(String args[]){
//     int number = 123;
//     String str = Integer.toString(number);
//     System.out.println(str.length());
//     }
// }



// 3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
// import java.util.Scanner;
// public class strng {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER YOUR EMAIL: ");
//         String email = sc.nextLine();
//         String username = " ";
//         for(int i =0; i <email.length(); i++){
//             if(email.charAt(i) == '@'){
//                 break;
//             } else {
//                 username += email.charAt(i);
//             }
//         }
//         System.out.println("USERNAME: " + username);
//         sc.close();
//     }
// }