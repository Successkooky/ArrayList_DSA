import java.util.ArrayList;

public class ArrayList13 {

    public static boolean pairsum(  ArrayList<Integer> list1,int target){
        int lp=0;
        int rp=list1.size()-1;
        while(lp!=rp){
            if(list1.get(lp)+list1.get(rp)== target){
                return true;
            }
            if(list1.get(lp)+list1.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }

        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        int target = 50;
        System.out.println(pairsum(list1, target));
    }
    
}
