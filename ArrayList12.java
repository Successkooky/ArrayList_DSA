import java.util.ArrayList;
public class ArrayList12 {

    public static boolean pairSum( ArrayList<Integer> list1, int target){

        for (int i = 0; i < list1.size(); i++) {
            for (int j = i+1; j < list1.size(); j++) {
                if(list1.get(i)+list1.get(j)==target){
                    return true;
                }
                
            }
            
        }
        return false;
    }


    public static void main(String args[]){
        //Pair Sum
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        int target=5;
        System.out.println(pairSum(list1, target));

        
    }
    
}
