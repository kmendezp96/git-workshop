import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please enter a number: ");
        Scanner sc2 = new Scanner(System.in);
        int var = sc2.nextInt();

        System.out.print("The factorial of " +var+" is "+Factorial.operar(var));
    }
}
