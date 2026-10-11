import java.util.Scanner;

public class Assignment2_Prob4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Not a valid triangle");
        } else {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }

        input.close();
    }
}
