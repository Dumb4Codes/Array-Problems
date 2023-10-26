public class StockBuyAndSell {
    public static void main(String[] args) {
        
        int[] array = {7, 2, 4, 5, 2, 4};

        System.out.println("The maximum profit you can achieve is "+maxProfit(array));
    }

    private static int maxProfit(int[] array) {
        
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<array.length; i++){ 
            
            min = Math.min(min, array[i]); //buy
            maxProfit = Math.max(maxProfit, array[i] - min);
        }
        return maxProfit;
    }
}
