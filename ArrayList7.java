import java.util.ArrayList;
public class ArrayList7 {
    public static void main(String args[]){
        //Multidimensional Array list
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        mainlist.add(list1);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(9);
        list2.add(12);
        list2.add(14);
        list2.add(16);
        mainlist.add(list2);
        System.out.println(mainlist);
        
        //Accessing sub list in main list

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList=mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
                
            }
            System.out.println();
            
        }

    }
    
}
