import jdk.jfr.Unsigned;

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
        System.out.println("Функция Add - добавление " + count + " элементов: ");
        System.out.println("    ArrayList: " + Zeit.zeitAdd(arr, count) + " нс");
        System.out.println("    LinkedList: " + Zeit.zeitAdd(link, count) + " нс");
        System.out.println("=============================================");
        System.out.println("Функция Get - извлечение " + count + " элементов: ");
        System.out.println("    ArrayList: " + Zeit.zeitGet(arr, count) + " нс");
        System.out.println("    LinkedList: " + Zeit.zeitGet(link, count) + " нс");
        System.out.println("=============================================");
        System.out.println("Функция Delete - удаление " + count + " элементов: ");
        System.out.println("    ArrayList: " + Zeit.zeitDelete(arr, count) + " нс");
        System.out.println("    LinkedList: " + Zeit.zeitDelete(link, count) + " нс");
        System.out.println("=============================================");
    }
}
