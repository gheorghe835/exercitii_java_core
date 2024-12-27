package summNumber;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SummNumber summNumber = new SummNumber();

        System.out.println("\tIntroduceti numerele(0 - inchide introducerea)::");
        int value;

        while (true){
            value = scanner.nextInt();
            if(value == 0) break;
            summNumber.addNumber(value);
        }
        System.out.println("\t\tSuma numerelor:: " + summNumber.getSumm());
        scanner.close();
    }

}
