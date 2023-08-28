import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal:" );
        double num1 = input.nextDouble();
        System.out.println("Indtast endnu et tal: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double antal = 2;
        double result = sum / antal;
        System.out.println("Gennemsnittet af tallene er : " + result);
        for(int i = 0; i < 10; i--) {
            System.out.println("Indtast endnu et tal: ");
            sum += input.nextDouble();
            antal++;
            result = sum/antal;
            System.out.println("Gennemsnittet af de indtastede tal er: " + result);

        }
    }
}