import java.util.Scanner;

public class Program3 {

    // WAP to check whether the number is even or odd

    //Using arithmetic operator
    public void evenorodd(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    //Using ternary operator
    public void EvenorOdd(int n){
        String result = (n % 2 == 0)? "Even" : "Odd";
        System.out.println(result);
    }

    //Using bitwise operator
    public void even_or_odd(int n){
        if((n & 1) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digit to check even or odd : ");
        int n= sc.nextInt();

        // Create an object of Program3 class
        Program3 p = new Program3();
        p.evenorodd(n);
        p.EvenorOdd(n);
        p.even_or_odd(n);
        sc.close();
    }
}
