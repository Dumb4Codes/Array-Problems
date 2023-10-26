public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        
        int[] array = {2, 3, 5, 1, 9, 4};
        long k = 20;
        
        int len = getLongestSubarray(array, k);

        System.out.println("The length of the longest subarray is: "+len);
    }

    private static int getLongestSubarray(int[] array, long k) {

        int len = 0;
        
        for(int i=0; i<array.length; i++){
            long s = 0;
            for(int j=i; j<array.length; j++){

                s += array[j];

                if(s == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}
