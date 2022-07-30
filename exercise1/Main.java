
import java.util.Scanner;

public class Main {

    /**
     * Программа вычисляет числа фибоначи
     * На вход программа принимает индекс n
     * С помощью в зависимости от отрицательного или положительного значения программа рассчитывает путем рекурсии
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер числа Фибоначи которое вы хотите вывести");
        try {
            long n = scanner.nextLong();
            if (n == 0) {
                System.out.printf("Число с порядковым номером %d равно %d\n", n, 0);
            } else if (n == 1) {
                System.out.printf("Число с порядковым номером %d равно %d\n", n, 1);
            } else if (n < 0) {
                //Вычисление числа Фибоначи с отрицательным индексом
                System.out.printf("Число с порядковым номером %d равно %d\n", n, fibonachiNumber(n - 1));
            } else {
                //Вычисление числа Фибоначи с положительным индексом
                System.out.printf("Число с порядковым номером %d равно %d\n", n, fibonachiNumber(n + 1));
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        }
    }

    public static long fibonachiNumber(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n == -1) {
            return 1;
        } else if (n > 0) {
            return fibonachiNumber(n - 1) + fibonachiNumber(n - 2);
        } else {
            //Для случая с отрицательным числом
            int sign = n % 2 == 0 ? 1 : -1;
            return sign * fibonachiNumber(-n);
        }
    }
}
