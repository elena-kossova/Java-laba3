import java.util.*;

/** The class counts the execution time of various functions
 * */
public class Zeit{
    /** The function counts the operation time of the add element function
     * @param arr list of elements
     * @param count number of iterations
     * @return working hours of the add function
     * */
    public static long zeitAdd(List <Integer> arr, int count){
        long begin = System.nanoTime();
        for (int i=0; i<count; i++){
            arr.add(i);
        }
        long end = System.nanoTime();
        long result = end - begin;
        return result;
    }
    /** The function counts the operation time of the element extraction function
     * @param arr list of elements
     * @param count number of iterations
     * @return working hours of the get function
     * */
    public static long zeitGet(List <Integer> arr, int count){
        long begin = System.nanoTime();
        for (int i=0; i<count; i++){
            arr.get(i);
        }
        long end = System.nanoTime();
        long result = end - begin;
        return result;
    }
    /** The function counts the operation time of the element removal function
     * @param arr list of elements
     * @param count number of iterations
     * @return working hours of the delete function
     * */
    public static long zeitDelete(List <Integer> arr, int count){
        long begin = System.nanoTime();
        for (int i = count - 1; i > 0; i--){
            arr.remove(i);
        }
        long end = System.nanoTime();
        long result = end - begin;
        return result;
    }
}