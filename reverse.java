
public class reverse {
    public static void main(String [] args){
        int n = 1234;
        for ( int i = n; i > 0; i = i / 10){
            int lastdigit = i % 10;
            System.out.print(lastdigit);
        }
    }
}
