import java.util.*;
public class AvgOfThreeNum{
    public static float avgOfThreeNum(int a, int b , int c){
        // float avg = (a+b+c)/3;
        float avg =a+b+c/(float)3;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = avgOfThreeNum(a,b,c);
        System.out.println("Average of three numbers is: "+avg);
    }
}