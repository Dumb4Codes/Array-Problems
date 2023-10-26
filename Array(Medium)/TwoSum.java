
public class TwoSum {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 10;

        //System.out.println(twoSum(array, target));

        int[] n = twoSum(array, target);

        for(int i : n){
            System.out.print(i+" ");
        }
    }

    private static int[] twoSum(int[] array, int target) {

        int[] ans = new int[2];

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){

                if(array[i] + array[j] == target){
                    ans[0] = i;
                    ans[1] = j;

                    return ans;
                }
            }
        }
        return ans;
    }

    // private static String twoSum(int[] array, int target) {

    //     for(int i=0; i<array.length; i++){
    //         for(int j=i+1; j<array.length; j++){

    //             if(array[i] + array[j] == target){
    //                 return "YES";
    //             }
    //         }
    //     }

    //     return "NO";
    
}
