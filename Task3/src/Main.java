//Ввести ФИО и вывести на экран, используя регулярные выражения
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим ФИО
        String FIO = sc.nextLine().trim();
        //соответствие ФИО регулярному выражению (только кириллица, 3 слова)
        if (!FIO.matches("([А-яЁё]+\\s){2}([А-яЁё]+)")){
            System.out.println("Введенная строка не является ФИО");
        }
        //записываем ФИО отдельно в переменные и выводим на экран
        else {
            String familia = FIO.replaceAll("\\s[А-яЁё]+"," ").trim();
            String name = FIO.replaceAll("(^[А-яЁё]+\\s)|(\\s[А-яЁё]+$)"," ").trim();
            String otchestvo = FIO.replaceAll("(^[А-я]+)(\\s[А-я]+\\s)"," ").trim();
            System.out.println("Фамилия: "+ familia);
            System.out.println("Имя: "+name);
            System.out.println("Отчество: "+otchestvo);
        }

    }
}