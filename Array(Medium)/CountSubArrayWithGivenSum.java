import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSubArrayWithGivenSum {
    public static void main(String[] args) {
        
        int[] array = {3, 1, 2, 5, 6, 1, 3, 3};

        System.out.println("The index where the given sum adds upto is "+subarraySum(array, 6));
    }

    private static int subarraySum(int[] array, int k) {
        
        int sum = 0;
        int count = 0;

        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);

        for(int i : array){
            sum += i;
            
            if(sumMap.containsKey(sum - k)){
                count += sumMap.get(sum - k);
            }

            sumMap.put(sum, sumMap.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}
