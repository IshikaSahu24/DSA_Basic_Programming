import java.util.Scanner;

public class Program5 {

    // WAP to find fibonacci series up to n terms

    //Using iterative method
    public void fibonacci(int n){
        if(n<=0){
            System.out.println("Please enter a positive integer.");
            return;
        }
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            a=b;
            b=a+b;
        }
        return;
    }


    //Using recursion
    public static int fibonacciRecursive(int n){
        if(n <= 1)
            return n;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


    //DP approach in later versions

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n= sc.nextInt();
        Program5 p = new Program5();
        p.fibonacci(n);

        for(int i = 0; i < n; i++){
        System.out.print(fibonacciRecursive(i) + " ");
    }

    sc.close();
}
    
}
