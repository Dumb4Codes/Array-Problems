public class KadaneAlgorithm {
    public static void main(String[] args) {
        
        int[] array = {1, -2, 3, -4, -6, 3, 5};

        System.out.println("The maximum subarray has the largest sum is "+maxSubArray(array));
    }

    private static int maxSubArray(int[] array) {
        
        //-------------------------Kadane's Algorithm------------------------------

        // int maxEndingHere = array[0];
        // int maxSoFar = array[0];

        // for(int i=1; i<array.length; i++){
        //     maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
        //     maxSoFar = Math.max(maxSoFar, maxEndingHere);
        // }
        // return maxSoFar;

        //-------------------------Another example---------------------------------

        int maxSoFar = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = -1; // if all elements in the array is negative

        for(int i=0; i<array.length; i++){

            sum += array[i];

            if(sum > maxSoFar){
                maxSoFar = sum;
                end = i; // Update the end index when a new maximum sum if found
            }

            else if(sum < 0){
                sum = 0;
                start = i+1; // Update the start index when the sum becomes negative
            }
        }

        if(end != -1){

            for(int i=start; i<=end; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }

        return maxSoFar;

    }
}
