package evenNumber;

import java.util.Scanner;

import static evenNumber.EvenNumber.evenNumbers;

public class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\t Introduceti de cite ori doriti sa verificati::");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("\tIntroduceti numarul " + (i+1) + "::");
            int number = scanner.nextInt();
            if (evenNumbers(number)){
                System.out.println("  " + number + " :: este par.");
            }
            else System.out.println("  " + number + " :: este impar.");
        }

    }
}
