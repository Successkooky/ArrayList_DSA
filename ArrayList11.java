import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(15);
        list1.add(20);
        list1.add(25);
        //To print all the elements in the list
        for(Integer number: list1){
            System.out.println(number);
        }
    }
    
}
