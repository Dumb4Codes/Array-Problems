
public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};

        int temp = array[0];

        for(int i=0; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;

        //print array
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
