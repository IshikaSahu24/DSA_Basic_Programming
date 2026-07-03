import java.util.Scanner;
public class Program6 {

    // WAP to find a number is prime number or not
    public void primeNumber(int n){
        if(n <= 1){
            System.out.println(n + " is not a prime number.");
            return;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        Program6 p = new Program6();
        p.primeNumber(n);
        scanner.close();
    }
}
