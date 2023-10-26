
public class SecondLargestElement {
    public static void main(String[] args) {
        
        int[] array = {32, 54, 1, 63, 85, 21, 73, 85};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest && array[i] < largest ){
                secondLargest = array[i];
            }
            
        }

        System.out.println("The largest element in the given array is "+largest+" and the second largest element is "+secondLargest);
    }
}
