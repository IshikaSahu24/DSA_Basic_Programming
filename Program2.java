import java.util.*;

public class Program2{

    // WAP to find largest number 
    public void findLargest(int a,int b, int c){
        int largest= a;
        if(b >= largest ){
            largest= b;
        }
        if(c >= largest){
            largest=c;
        }
        System.out.println("Largest : "+largest );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to compare : ");
        System.out.println("Enter first digit : ");
        int a = sc.nextInt();
        System.out.println("Enter second digit : ");
        int b = sc.nextInt();
        System.out.println("Enter third digit : ");
        int c = sc.nextInt();

        Program2 p = new Program2();
        p.findLargest(a, b, c);
        sc.close();
    }
    
}
