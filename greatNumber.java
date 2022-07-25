import java.util.Scanner;

public class greatNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0;
        System.out.println("The number you will query for the perfect number : ");
        n =input.nextInt();

        for (int i = n-1; i >= 1; i++){
            if(n % i == 0 ){
                total += i;

            }

        }

        if(total == n){
                System.out.println("Your number is the perfect number :)");

            } else {
            System.out.println("The number is not perfect");
        }
    }
}
