import java.util.Scanner;

public class isPalindrome {

        public static boolean isPal(int originalNum){
            int reverseNum = 0;
            int temp = originalNum;
            while(originalNum != 0){
                int lastDigit = originalNum % 10;
                originalNum = originalNum/10;
                
                reverseNum = reverseNum * 10 + lastDigit;
            }
            return reverseNum == temp;
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println(isPal(num));
        }
    }

