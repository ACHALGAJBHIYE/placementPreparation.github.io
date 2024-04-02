import java.util.*;

public class CommonEle {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();
        
        // Add elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }
        
        // Check common elements between array1 and array2
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }
        
        System.out.println("Common elements between array1 and array2:");
        for (int num : commonElements) {
            System.out.println(num);
        }
    }
}
