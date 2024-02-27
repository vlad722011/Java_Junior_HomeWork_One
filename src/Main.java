import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Создадим список рандомной длины, состоящий из рандомных чисел" +
                " и выведем его на печать:");
        Random rnd = new Random();
        int listLength = rnd.nextInt(10, 30);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            int number = rnd.nextInt(10, 101);
            list.add(number);
        }
        System.out.println(list.toString());
        System.out.println();

        System.out.println("Надйем среднее значение четных чисел полученного списка, используя Srteam-ы! \n");
        System.out.println("Для начала получим из входящего списка, список содержащий только четные числа:");
        ArrayList<Integer> newList = (ArrayList<Integer>) list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println();

        System.out.println("Теперь найдем среднее значение чисел списка, и выведем его в консоль:");
        double result =(double) (newList.stream().mapToInt(x -> x = x).sum()) / (int) newList.stream().filter(x -> x % 2 == 0).count();
        System.out.println(result);
    }
}
