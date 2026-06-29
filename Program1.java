package DSA_Basic_Programming;
import java.util.*;

public class Program1{

    // WAP to print 1 to N.
    public void print1To100(int N){
        if(N <= 0){
            return;
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Program1 p = new Program1();
        p.print1To100(N);
        sc.close();

    }
}