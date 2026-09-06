public class returnconcept {
    public static int sumOfNumbers(int n){
        int sum =0;
        if(n < 0){
            return -1;
        }
        for (int j=1; j<=n; j++){
            sum += j;
        }
        return sum;
    }
    public static void main(String[] args) {

        int result = sumOfNumbers(5);

        System.out.println(result);
    }
}

