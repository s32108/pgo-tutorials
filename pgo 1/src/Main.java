import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input>0) {
            System.out.println("The number is positive");
        } else if (input<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The value equals 0");
        }
    }
}