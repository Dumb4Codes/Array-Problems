
public class LargestElement {
    public static void main(String[] args) {
        
        int[] array = {32, 54, 1, 63, 85, 21, 73};

        int largestElement = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] > largestElement){
                largestElement = array[i];
            }
        }
        System.out.println("The largest element in the given array is "+largestElement);
    }
}
