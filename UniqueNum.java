import java.util.HashSet;
import java.util.Set;

public class UniqueNum {
    public static void main(String []args){
        int[] array = {1, 2,0,9,7,3,3,4,6,5,9,7, 8};
        System.out.println("Original Array:");
        printArray(array);

        System.out.println("\nUnique Number");
        printUniqueNum(array);
    }
    // Function to print Unique Array
    public static void printUniqueNum(int[] array)
    {
        Set<Integer> uniqueSet= new HashSet<>();
        for(int n:array)
        {
            uniqueSet.add(n);
        }
        for(int uniqueNum : uniqueSet)
        {
            System.out.print(uniqueNum+" ");
        }
    }
    // Function to print original array
    public static void printArray(int[] array)
    {
        for(int n:array){
            System.out.print(n+" ");
        }
    }
}
