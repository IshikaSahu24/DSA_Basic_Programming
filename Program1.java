import java.util.*;

public class Program1{

    // WAP to print 1 to N.
    public void print1To100(int N){

        //to check if number is negative
        if(N <= 0){
            return;
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // WAP to print N to 1.
    public void print100To1(int N){
        // to check if the number is negative
        if(N <= 0){
            return;
        }
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits you want to print: ");
        int N = sc.nextInt();
        Program1 r = new Program1();
        r.print1To100(N);

        r.print100To1(N);

        sc.close();

    }
}