// public class strng2 {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Tony");  //declaration of StringBuilder object
//         System.out.println(sb);

//         //char at index 0
//         System.out.println(sb.charAt(0));

//         //set char at index 0 (replace char at index 0)
//         sb.setCharAt(0, 'P'); //new char at index 0
//         System.out.println(sb);

//         //insert char at index 0
//         sb.insert(0, 'S'); //insert char at index 0
//         System.out.println(sb);

//         sb.insert(4,'i');
//         System.out.println(sb);

//         //delete char at index 0
//         sb.delete(1,2);
//         System.out.println(sb);

//         //append char at the end (add char at last index)
//         sb.append('a');
//         System.out.println(sb);
//     }
// }       


// public class strng2 {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("H");  //declaration of StringBuilder object
//         sb.append("e"); //append char at the end (add char at last index)   
//         sb.append("l");  //this method  causes the string to be modified in place, rather than creating a new string object
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);
//         System.out.println(sb.length()); //length of the string
//     }
// }       


//reversing the string using StringBuilder
// public class strng2 {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("aashna");  //declaration of StringBuilder object
//         for(int i=0; i<sb.length()/2; i++){
//             int front = i; //front index
//             int back = sb.length()-1-i; //back index

//             char frontChar = sb.charAt(front); //char at front index
//             char backChar = sb.charAt(back); //char at back index
//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }
//         System.out.println(sb); //reverse the string
//     }
// }
