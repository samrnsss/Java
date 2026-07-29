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
//qs- set the 2nd bit(position=1) of a number n=5 (0101)
//bit mask : 1<<i   here i=1(position of bit to be set)
//operation : OR(|) between bit mask and n
public class bitsM {
    public static void main(String [] args){
        int n =5;  //binary representation of 5 is 0101
        int pos=3;
        int bitMask = 1<<pos;

        if((bitMask | n) == 0){
            System.out.println("Bit was zero");   //here OR operation is performed 
            // which gives 0101|0010=0111 in which 2nd bit is set to 1
        }else{
            System.out.println("Bit was one");
        }
    }
}
