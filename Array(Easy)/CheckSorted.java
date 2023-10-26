
public class CheckSorted {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean sorted = true;

        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i + 1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("The given array is sorted");
        }
        else{
            System.out.println("The given array is not sorted");
        }
    }
}
