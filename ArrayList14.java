import java.util.ArrayList;
public class ArrayList14 {


    public static boolean pairsum2( ArrayList<Integer> list1,int target){
        int pivot=-1;
        int n=list1.size();
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)>list1.get(i+1)){
                pivot=i;
                break;
            }
            
        }
        int lp=pivot+1;// smallest
        int rp=pivot;
        while(lp!=rp){
            //case1
            if(list1.get(lp)+list1.get(rp)==target){
              return true;  
            }
            if (list1.get(lp) + list1.get(rp) < target) {
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }

        }
        return false;
    }

    public static void main(String args[]){
        // Sorted and rotated array
        //[11,15,6,8,9,10] tgt=16
        //Find pivot pt -->point from which array is rotated
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        int target = 16;
        System.out.println(pairsum2(list1, target));
    }
    
}
