import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 2, 1};

        // Map<Integer, Integer> frequencyMap = new HashMap<>();

        // int element = 0;
        // int frequency = 0;

        // for(int i : array){
        //     frequencyMap.put(i, frequencyMap.getOrDefault(i, 0)+1);
        // }

        // for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
        //     System.out.println("The element "+entry.getKey()+" has the frequency of "+entry.getValue());
        // }

        // int minFrequency = Integer.MAX_VALUE;
        // int minElement = 0;

        // for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
        //     if(entry.getValue() > 0 && entry.getValue() < minFrequency){
        //         minFrequency = entry.getValue();
        //         minElement = entry.getKey();
        //     }
        // }

        // System.out.println();
        // System.out.println("The Element "+minElement+" has the lowest frequency with frequecny "+minFrequency);

        //------------------------------------------------------------------------

        int xor = 0;

        for(int i=0; i<array.length; i++){

            xor = xor ^ array[i];
        }

        System.out.println("The element which has the lowest frequency in the array is "+xor);
    }
}
