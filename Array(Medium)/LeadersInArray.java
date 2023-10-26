import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        
        int[] array = {4, 7, 1, 0};

        ArrayList<Integer> ans = printLeaders(array);

        Collections.sort(ans, Collections.reverseOrder());

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    private static ArrayList<Integer> printLeaders(int[] array) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        int max = array[array.length-1];

        ans.add(array[array.length-1]);

        for(int i=array.length-2; i>=0; i--){
            if(array[i] > max){
                ans.add(array[i]);
                max = array[i];
            }
        }
        
        return ans;
    }
}
