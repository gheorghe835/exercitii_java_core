package evenNumber;

import java.util.Scanner;

public class EvenNumber {
    /*private int number;

    public EvenNumber() {
        this.number = 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void evenNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tIntroduceti numarul:: ");
        int number = scanner.nextInt();
        if(number %2 == 0)System.out.println("\t Numarul:: " + number + " este par");
        else System.out.println("\t Numarul:: " + number + " este impar");
    }*/

    public static boolean evenNumbers(int number){
        return number %2 == 0;
    }
}
