import java.util.ArrayList;
public class ArrayList9 {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht=Math.min(height.get(i),height.get(j));
                int wt=j-i;
                int water=wt*ht;
                maxWater=Math.max(maxWater, water);

                
            }
            
        }
        return maxWater;
    }


    public static void main(String args[]){
        //Container with most water
        //Brute Force 
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(8);
        list1.add(6);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(7);

        System.out.println(storeWater(list1));

    }
    
}
