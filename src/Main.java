import java.util.Arrays;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] amountSpent = new int[5];
        Arrays.fill(amountSpent, 5);
        int sum = Arrays.stream(amountSpent).sum();
        out.println("Сумма трат за месяц составила " + sum + " рублей");
        out.println();
        //Задача 2
        int[] arr = {3, 5, 9, 1, 8, 7, 6};
        int maxValue = Arrays.stream(arr).max().getAsInt();
        out.println("Максимальная сумма трат за неделю составила " + maxValue + " рублей");
        int minValue = Arrays.stream(arr).min().getAsInt();
        out.println("Минимальная сумма трат за неделю составила " + minValue + " рублей");
        out.println();
        //Задача 3
        int[] amountSpentMid = {1, 2, 3, 4, 6, 8};
        double avargeValue = Arrays.stream(amountSpentMid).average().getAsDouble();
        out.println("Средняя сумма трат за месяц составила " + avargeValue + " рублей");
        out.println();
        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String reversName = new String(reverseFullName);
        StringBuilder sb = new StringBuilder(reversName).reverse();
        out.println(sb);
    }
    }
