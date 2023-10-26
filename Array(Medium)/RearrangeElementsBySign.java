import java.util.ArrayList;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        
        int[] array = {3,1,-2,-5,2,-4};

        rearrangeArray(array);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static int[] rearrangeArray(int[] array) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            if(array[i] > 0){
                pos.add(array[i]);
            }
            else{
                neg.add(array[i]);
            }
        }

        for(int i=0; i<array.length / 2; i++){
            array[2*i] = pos.get(i);
            array[2*i+1] = neg.get(i);
        }

        return array;

    }
}
