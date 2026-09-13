
// public class reverse {
//     public static void main(String [] args){
//         int n = 1234;
//         for ( int i = n; i > 0; i = i / 10){
//             int lastdigit = i % 10;
//             System.out.print(lastdigit);
//         }
//     }
// }


//reverse the given number

public class reverse{
    public static void main(String [] args){
        int n = 987654321;
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
