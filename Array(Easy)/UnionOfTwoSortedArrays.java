import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7, 0, 0};
        int[] arr2 = {2, 3, 5, 6, 0};

        ArrayList<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of two sorted arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;

        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                    i++;
                }
            }
            else if(arr2[j] < arr1[i]){
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                    j++;
                }
            }
            
        }
        while(i < m){
            if(union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
                i++;
            }
        }

        while(j < n){
            if(union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
                j++;
            }
        }
       

        return union;
    }
}
