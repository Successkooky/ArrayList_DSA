import java.util.ArrayList;
public class ArrayList3 {

     //Reverse of an Array list
     public static void main(String args[]){
         ArrayList<Integer> list1 = new ArrayList<>();
         list1.add(1);
         list1.add(2);
         list1.add(3);
         list1.add(4);
         list1.add(4, 6);
         System.out.println(list1);
         
         for (int i = list1.size()-1; i >=0; i--) {
            System.out.print(list1.get(i)+" ");
            
         }
         System.out.println();

     }
    
}
