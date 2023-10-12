import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FIO = sc.nextLine().trim();
        if (!FIO.matches("([А-яЁё]+\\s){2}([А-яЁё]+)")){
            System.out.println("Введенная строка не является ФИО");
        }
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