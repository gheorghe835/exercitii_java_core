package sumTwoNumbers;

import java.util.Scanner;
// task 5
public class Printer {
    public static void main(String[] args) {
        SumTwoNumbers number1 = new SumTwoNumbers();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\tIntroduceti primlul numar:");
        int val1 = scanner.nextInt();

        System.out.print("\tIntroduceti al doilea numar:");
        int val2 = scanner.nextInt();
        SumTwoNumbers number2 = new SumTwoNumbers(val1,val2);

        //int result = number1.summ(4,5);
        //System.out.println(result);

        int reusult = number2.summ(number2.getNumber1(),number2.getNumber2());
        System.out.println("\tSuma celor doua numere:: " + number2.getNumber1() + " + " +
                number2.getNumber2() + " = " + reusult);
        System.out.println("//////////////////");

        System.out.print("\tIntroduceti primlul numar:");
        int num1 = scanner.nextInt();
        number1.setNumber1(num1);
        System.out.print("\tIntroduceti al doilea numar:");
        int num2 = scanner.nextInt();
        number1.setNumber1(num2);
        int reusult2 = number1.summ(number2.getNumber1(),number2.getNumber2());
        System.out.println("\tSuma celor doua numere:: " + number2.getNumber1() + " + " +
                number2.getNumber2() + " = " + reusult);


    }
}
