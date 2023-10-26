import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        
        int[] array = {100, 4, 200, 1, 3, 2, 101, 102, 103};

        System.out.println("The longest consecutive sequence is "+LongestConsecutiveElements(array));
    }

    private static int LongestConsecutiveElements(int[] array) {
        
        if(array.length == 0) return 0;

        Arrays.sort(array);
        int currentStreak = 1;
        int LongestStreak = 1;

        for(int i=1; i<array.length; i++){
            if(array[i] != array[i-1]){
                if(array[i] == array[i-1]+1){
                    currentStreak++;
                }
                else{
                    LongestStreak = Math.max(LongestStreak, currentStreak);                   
                    currentStreak = 1; //reset
                }
            }
        }

        for(int i=0; i<Math.max(currentStreak, LongestStreak); i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();

        return Math.max(currentStreak, LongestStreak);
    }
}
