import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 2, 3, 1, 3, 4, 2, 2, 2, 2, 2};

        int n = majorityElement(array);

        System.out.println("The majority element in this array is "+n);
        System.err.println("Array length is "+array.length);
    }

    private static int majorityElement(int[] array) {
        
        int max = Integer.MIN_VALUE;
        int maxElement = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i : array){
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        if(max > array.length / 2){
            return maxElement;
        }
        return 0;
    }
}
