import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int number1 = 220;
//        int number2 = 284;

        System.out.println("Give number1: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println("Give number2: ");

        int number2 = sc.nextInt();


        boolean areFriendly = areFriendlyNumbers(number1, number2);
        System.out.println("A ket megadott szam baratsagos: " + areFriendly);

        sc.close();
    }

    // Metódus a barátságos számok ellenőrzésére
    public static boolean areFriendlyNumbers(int num1, int num2) {
        return (sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1);
    }

    // Metódus az osztók összegének kiszámítására
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Osztok: " + i);
                sum += i;
                System.out.println("Osztok osszege: " + sum);
            }
        }
        return sum;
    }


}
