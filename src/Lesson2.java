import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Lesson2 {
    public static void main(String[] args)throws IOException {
        /*Задача 2.2
         Написать программу, в которую пользователь будет вводить температуру по Цельсию,
         а программа должна преобразить ее в температуру по фаренгейту.
         */
         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы узнать какая сейчас температура по фаренгейту введите темпартуру в цельсиях");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius*1.8+32;
        System.out.println("Температура по фаренгейту "+fahrenheit);
        */

        /*Задача 2.3
        Написать конвертер валют. Пользователь вводит рубли, а программа печатает значение в долларах и евро.
        Взять актуальный курс валют.
         */
        double bidUSD = 60.47;
        double bidEUR = 60.86;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму в рублях");
        double RUB = Double.parseDouble(reader.readLine());
        double USD = RUB/bidUSD;
        double EUR = RUB/bidEUR;
        USD= Math.floor(USD * 100) / 100;
        EUR = Math.floor(EUR * 100) / 100;
        System.out.println("Вы сможете купить "+USD+" долларов.");
        System.out.println("Вы сможете купить "+EUR+" евро.");
    }
}
