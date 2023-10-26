public class SortColors {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 0, 0, 2, 0, 1};

        sortColors(array);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void sortColors(int[] array) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<array.length; i++){

            if(array[i] == 0) count0++;
            else if(array[i] == 1) count1++;
            else if(array[i] == 2) count2++;
        }

        for(int i=0; i<count0; i++){
            array[i] = 0;
        }
        for(int i=count0; i<count0 + count1; i++){
            array[i] = 1;
        }
        for(int i=count0 + count1; i<array.length; i++){
            array[i] = 2;
        }
    }
}
