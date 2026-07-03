import java.util.Scanner;

public class Program4 {

    // WAP to find factorial of a number

    //using iterative method
    public long factorial(long n){
        if(n<0){
            throw new IllegalArgumentException( "Factorial is not defined for negative numbers"); 
        }

        long result =1;

        for(long i=2;i<=n;i++){
            result=result*i;
        }
        return result;
    }


    public long factorialRecursive(int n){
        if(n<0){
            throw new IllegalArgumentException( "Factorial is not defined for negative numbers");
        }
        if(n==0){
            return 1;
        }
        return factorialRecursive(n-1)*n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to find factorial : ");
        int n= sc.nextInt();

        Program4 p = new Program4();
        System.out.println("Factorial of " + n + " (iterative): " + p.factorial(n));
        System.out.println("Factorial of " + n + " (recursive): " + p.factorialRecursive(n));
        sc.close();
    }
}
