public class LinearSearch {
    public static void main(String[] args) {
        
        // linear search = Iterate through a collection on element at a time 

        //                 runtime complexity: O(n)

        //                 Disadvantages:
        //                 Slow for large data sets 

        //                 Advantages:
        //                 Fast for searches of small to medium data sets
        //                 Does not need to sorted
        //                 Useful for data structures that do not have random access  (Linked List)

        int[] array = {3, 4, 2, 6, 1, 7, 4, 8, 8};

        int index = linearSearch(array, 7);

        if(index != -1){
            System.out.println("The element you've searched for is in the "+index+" index");
        }
        else{
            System.out.println("Element not found!");
        }
    }

    private static int linearSearch(int[] array, int n) {
        
        for(int i=0; i<array.length; i++){
            if(array[i] == n){
                return i;
            }
        }
        return -1;
    }
}
