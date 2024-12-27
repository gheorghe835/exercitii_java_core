package multiplicationTable;

/*
Bucla for:
	Scrie un program care afișează tabla înmulțirii pentru un număr dat de utilizator.
 */
public class MultiplicationTable {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    public void showTable(){
        System.out.println("\tTabla inmultirii pentru :: " + number);
        for (int i = 0; i <= 10; i++){
            int result = number * i;
            System.out.println("\t\t" + number + " * " + i + " = " + result);
        }
    }
}
