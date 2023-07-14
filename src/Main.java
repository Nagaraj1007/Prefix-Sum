
public class Main {

    public static int[] prefixSum(int array[]){
        for (int iterator = 1; iterator < array.length ; iterator++){
            array[iterator] += array[iterator-1] ;
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = {4, 3, 2};
        array = prefixSum(array);
        for (int element : array){
            System.out.print(element + " ");
        }
    }
}