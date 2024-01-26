import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(45);
        arrlist.add(12);
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(68);
        
        System.out.println("arrlist: "+ arrlist);
        ArrayList<Integer> oddList = new ArrayList<>();
        HashSet<Integer> evenNumbers = new HashSet<>();

        
        for (Integer i : arrlist) {
            if(i % 2 == 0){
                evenNumbers.add(i);
            }else{
                oddList.add(i);
            }
                
            }

            System.out.println("oddList: "+ oddList);
            System.out.println("evenNumbers: "+ evenNumbers);
    }
}
