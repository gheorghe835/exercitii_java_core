package summNumber;

public class SummNumber {
    private int summ;

    public SummNumber() {
        this.summ = 0;
    }


   public void addNumber(int value){
        summ += value;
   }

    public int getSumm() {
        return summ;
    }
}
