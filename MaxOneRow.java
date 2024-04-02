public class MaxOneRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        
        int maxOnesRowIndex = findMaxOnesRow(matrix);
        
        System.out.println("Row with maximum number of 1's: " + maxOnesRowIndex);
    }
    
    public static int findMaxOnesRow(int[][] matrix) {
        int maxOnesRowIndex = -1;
        int maxOnesCount = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRowIndex = i;
            }
        }
        
        return maxOnesRowIndex;
    }
}
