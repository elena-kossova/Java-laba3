import java.util.*;
/** @author Elena Chernuhina
 * */
public class main_Zeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество итерраций");
        int count = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer> link = new LinkedList<Integer>();

        System.out.println("=============================================");
        System.out.println("                     Add                     ");
        System.out.println("   добавление " + count + " элементов");
        System.out.println("---------------------------------------------");
        System.out.println(" ArrayList: " + Zeit.zeitAdd(arr, count) + " наносекунд");
        System.out.println(" LinkedList: " + Zeit.zeitAdd(link, count) + " наносекунд");
        System.out.println("-------------------------------");
        if (Zeit.zeitAdd(arr, count) < Zeit.zeitAdd(link, count)){
            System.out.println(" Быстрее ArrayList");
        }
        else System.out.println(" Быстрее LinkedList");
        System.out.println("=============================================");
        System.out.println("                     Get                     ");
        System.out.println("   извлечение " + count + " элементов");
        System.out.println("---------------------------------------------");
        System.out.println(" ArrayList: " + Zeit.zeitGet(arr, count) + " наносекунд");
        System.out.println(" LinkedList: " + Zeit.zeitGet(link, count) + " наносекунд");
        System.out.println("-------------------------------");
        if (Zeit.zeitGet(arr, count) < Zeit.zeitGet(link, count)){
            System.out.println(" Быстрее ArrayList");
        }
        else System.out.println(" Быстрее LinkedList");
        System.out.println("=============================================");
        System.out.println("                    Delete                   ");
        System.out.println("   удаление " + count + " элементов");
        System.out.println("---------------------------------------------");
        System.out.println(" ArrayList: " + Zeit.zeitDelete(arr, count) + " наносекунд");
        System.out.println(" LinkedList: " + Zeit.zeitDelete(link, count) + " наносекунд");
        System.out.println("-------------------------------");
        if (Zeit.zeitDelete(arr, count) < Zeit.zeitDelete(link, count)){
            System.out.println(" Быстрее ArrayList");
        }
        else System.out.println(" Быстрее LinkedList");
        System.out.println("=============================================");
    }
}
