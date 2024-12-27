package multiplicationTable;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tIntroduceti numarul pentru tabla inmultirii::");
        int value = scanner.nextInt();
        MultiplicationTable multiplicationTable = new MultiplicationTable(value);
        multiplicationTable.showTable();
        scanner.close();

    }
}
