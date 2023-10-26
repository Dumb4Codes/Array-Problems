public class ZeroesToTheEnd {
    public static void main(String[] args) {
        
        int[] array = {2, 3, 4, 0, 1, 5, 0};

        shiftZeroes(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void shiftZeroes(int[] array) {

        int count = 0;

        for(int i=0; i<array.length; i++){
            
            if(array[i] != 0){
                array[count] = array[i];
                count++;
            }
        }
        while(count < array.length){
            array[count] = 0;
            count++;
        }
        
    }
}
