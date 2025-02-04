import java.util.Scanner;

public class Input
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input yout Name : ");
        String userName = scanner.next();
        System.out.print("Hello "+ userName + ", What is your age : ");
        int userAge = scanner.nextInt();
        System.out.print("What is your weight : ");
        float userWeight = scanner.nextFloat();
        System.out.print("Do you smoke? (true/false) : ");
        boolean userSmokes = scanner.nextBoolean();
        System.out.println("Hello " + userName + ", your age is " + userAge + ", you weigh " + userWeight + ", and you smoke: " + userSmokes);

    }
}
