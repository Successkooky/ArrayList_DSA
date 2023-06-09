import java.util.ArrayList;
public class ArrayList4 {

    public static void main(String args[]){
        //Find maximum in an ArrayList
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4, 6);
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)>max){
                max=list1.get(i);
            }
            

        }
        System.out.println("max element is "+max);
    }
    
}
