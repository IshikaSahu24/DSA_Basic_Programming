import java.util.Scanner;

public class Program7 {

    // WAP to reverse a number 

    // Using iteration

    public int reverseNumber(int n){
        int reversed = 0;
        while(n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
       return reversed;
    }


    
     static int rever = 0;
    // Using recursion
    public int reverseNumberRecursive(int n){
        if(n == 0){
            return rever;
        }
        int digit = n % 10;
        rever = rever * 10 + digit;
        reverseNumberRecursive(n / 10);
        return rever;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Program7 p = new Program7();
        int rev = p.reverseNumber(num);
        System.out.println("Reverse : "+ p.reverseNumber(num));
        System.out.println("Reverse : "+ p.reverseNumberRecursive(num));

       if(num == rev){
        System.out.println("Palindrome number. ");
       }
       sc.close();
    }
}
