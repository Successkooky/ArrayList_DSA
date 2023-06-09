import java.util.ArrayList;
public class ArrayList1 {
    //Java Collection Frameworks
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        ArrayList<Float> list4=new ArrayList<>();

        //Add element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4, 6);
        System.out.println(list1);


        //Get element
        int element=list1.get(2);
        System.out.println(element);
        System.out.println(list1.get(3));

        //remove element
        list1.remove(2);
        System.out.println(list1);

        //Update elements
        list1.set(1, 4);
        System.out.println(list1);

        //To check element is there or not
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(11));





    }
    
}
