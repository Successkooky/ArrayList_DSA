import java.util.ArrayList;
import java.util.Collections;
public class ArrayList6 {
    public static void main(String args[]){
        //Sorting in Arrays
         ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(4, 6);
        //Ascending order by default
        Collections.sort(list1);
        System.out.println(list1);

        //Descending order
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);

    }
    
}
