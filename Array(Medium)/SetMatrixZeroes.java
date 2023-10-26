public class SetMatrixZeroes {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {0, 2, 3, 4},
            {4, 5, 0, 4},
            {7, 8, 9, 3}
        };

        System.out.println("The original matrix is: ");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes: ");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        //check if first row has zero
        for(int j=0; j<cols; j++){
            if(matrix[0][j] == 0){
                firstRowHasZero = true;
            }
        }

        //check if first cols has zero
        for(int i=0; i<rows; i++){
            if(matrix[i][0] == 0){
                firstColHasZero = true;
            }
        }

        //mark rows and columns to be zero
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0; //mark the first element with 0 in the row
                    matrix[0][j] = 0; //mark the first element with 0 in the column
                }
            }
        }

        // Set rows to zero based on the first element in the row
        for(int i=1; i<rows; i++){
            if(matrix[i][0] == 0){
                for(int j=1; j<cols; j++){
                    matrix[i][j] = 0; // i remains same as the index
                }
            }
        }

        // Set cols to zero based on the first element in the cols
        for(int j=1; j<cols; j++){
            if(matrix[0][j] == 0){
                for(int i=1; i<rows; i++){
                    matrix[i][j] = 0; // j remains same as the index
                }
            }
        }

        if(firstRowHasZero){
            for(int j=0; j<cols; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstColHasZero){
            for(int i=0; i<rows; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
