public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Assuming one number is missing
        
        int n = array.length + 1; // Total number of elements including the missing number
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
