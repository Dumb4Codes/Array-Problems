public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        
        int[] array = {1,0,1,1,0,1};

        int count = 0;
        int max = 0;

        for(int i : array){
            if(i == 1){
                count++;
            }
            else{
                count = 0;
            }

            max = Math.max(max, count); //took the max number by comparing itself with count 
        }
        System.out.println("Maximum consecutive ones are "+max+" times");
    }
}
