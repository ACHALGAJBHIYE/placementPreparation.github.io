public class ArraySort {
    public static void main(String args[]){
        int[] array = {5, 12, 3, 9, 7,2, 15, 8};

        sortFirstHalfAccending(array);
        sortSecondHalfDecending(array);
        System.out.println("Sorted array = ");
        for(int num:array){
            System.out.println(num+" ");
        }
    }
    // Function for First Half Accending order
    public static void sortFirstHalfAccending(int[] array)
    {
        for(int i=0; i<array.length/2-1; i++)
        {
            for(int j=0; j<array.length/2-1; j++)
            {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        } 
    }
    // Function for Second Half Desending order
    public static void sortSecondHalfDecending(int[] array)
    {
        for(int i=array.length/2-1; i<array.length-1; i++)
        { 
            for(int j=array.length/2-1; j<array.length-1; j++)
            {
                if(array[i] < array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
