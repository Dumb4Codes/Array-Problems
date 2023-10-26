public class LeftArrayRotateByTimes {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        leftRotate(array, 2);

        for(int i : array){
            System.out.print(i+" ");
        }
    }
    private static void leftRotate(int[] array, int n){

        if(array.length == 0)return;

        n = n % array.length;

        int[] temp = new int[n];

        for(int i=0; i<n; i++){
            temp[i] = array[i]; //1, 2
        }

        for(int i=n; i<array.length; i++){ // n=2
            array[i-n] = array[i];
        }

        for(int i=0; i<n; i++){
            array[array.length-n+i] = temp[i];
        }
    }
}
