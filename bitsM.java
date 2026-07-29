//GET BIT
//qs- get the third bit(position=2) of a number n=5 (0101)
//bit mask : 1<<i   here i=2(position of bit to be checked)
//operation : AND(&) between bit mask and n
// public class bitsM {
//     public static void main(String [] args){
//         int n = 5;   //binary representation of 5 is 0101
//         int pos =2;   //2nd means 3rd bit from right to left
//         int bitMask = 1<<pos;     //bit mask

//         if((bitMask & n) == 0){          //here AND operation is performed
//             System.out.println("Bit was zero");
//         }else{
//             System.out.println("Bit was one");
//         }
//     }
// }


//set bit
//qs- set the 4th bit(position=3) of a number n=5 (0101)
//bit mask : 1<<i   here i=3(position of bit to be set)
//operation : OR(|) between bit mask and n
// public class bitsM {
//     public static void main(String [] args){
//         int n =5;  //binary representation of 5 is 0101
//         int pos=3;

//         int bitMask = 1<<pos;

//         int newNumber = bitMask | n;   //here OR operation is performed
//         System.out.println(newNumber);  //0101|0010=0111 which is 7 in decimal
//     }
// }


//clear bit
//qs- clear the 3rd bit(position=2) of a number n=5 (0101)
//bit mask : ~(1<<i)   here i=2(position of bit to be
//operation : AND(&) with NOT of bit mask and n
// public class bitsM {
//     public static void main(String [] args){
//         int n =5;  //binary representation of 5 is 0101
//         int pos=2;

//         int bitMask = ~(1<<pos);   //bit mask
//         int notBitMask = ~(bitMask);   //NOT of bit mask

//         int newNumber = notBitMask & n;   //here AND operation is performed
//         System.out.println(newNumber);  //0101&1011=0001 which is 1 in decimal
//     }
// }


//update bit
//qs- update the 2nd bit(position=1) of a number n to 1 (0101)
// for 0
//bit mask : 1<<i   here i=1(position of bit to be updated)
//operation : AND with NOT of bit mask and n
//for 1
//bit mask : 1<<i   here i=1(position of bit to be updated)
//operation : OR(|) between bit mask and n

// import java.util.*;
// public class bitsM {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         //oper=1 : set oper=0 : clear
//         int oper = sc.nextInt();
//         int n =5;   //binary representation of 5 is 0101 so if we want to set 2nd bit then it will become 0111 which is 7 in decimal
//         int pos=1;
        
//         int bitMask = 1<<pos;   //bit mask
//         if(oper == 1){
//             //set oper
//             int newNumber = bitMask | n;   //here OR operation is performed
//             System.out.println(newNumber);  //0101|0010=0111 which is 7 in decimal  
//         } else {
//         // clear oper
//         int newBitMask = ~(bitMask);   //NOT of bit mask
//         int newNumber = newBitMask & n;   //here AND operation is performed
//         System.out.println(newNumber);  //0101&1011=0001 which is 1 in decimal
//         }
// }
// }
