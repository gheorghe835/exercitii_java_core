package intervalNumber;

import java.util.Scanner;

public class IntervalNumber {
    private int number;
    public IntervalNumber(){
        this.number = 0;
    }

    public void readNumber(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\tIntrodu un numar intre 1 si 10:");
            number = scanner.nextInt();
        }
        while (number<1 | number>10);
        System.out.println("\tNumarul introdus este:: " + number);
    }

}
