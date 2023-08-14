import java.util.Scanner;

public class Third {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age :");
        int age = scanner.nextInt();

        System.out.printf("Welcome %s\n",name);
        System.out.printf("Your age is %s",age);
    }
}
