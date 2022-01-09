import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++) ar.add(sc.nextInt()); //Inputting the elements
        HashMap<Integer,Boolean> mp = new HashMap<>();
        for (Integer integer : ar) {
            if (!mp.containsKey(integer))
                mp.put(integer, false); // Will be updated to true once an element is visited
        }
        Map<Integer,Boolean> ind = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<ar.size();i++){
            ind.put(i,false);
        }
        for(int i=0;i<ar.size();i++){
            if(!mp.get(ar.get(i))) mp.replace(ar.get(i),true); // Updating visited value's status
            else{
                if(ind.get(i)) continue;
                flag = true;
                System.out.print("Element "+ ar.get(i) + " has duplicates on indices : ");
                for(int j=i;j<ar.size();j++){
                    if(mp.get(ar.get(j))){
                        ind.replace(j,true);
                        System.out.printf("%d ",j);
                    }
                }
                System.out.println();
            }
        }
        if(!flag) System.out.println("No duplicates found");
    }
}
