package twoNumbers;

public class TwoNumbers {
    public void combinations(){
        System.out.println("\tCombinatiile de doua cifre sunt::");
        for(int i=0; i<10; i++)
            for (int j=0; j<10; j++){
                if (i == j){
                    System.out.println(i + " -- " + j);
                }
            }
    }
}
