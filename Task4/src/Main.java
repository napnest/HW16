//телефонный номер через регулярные выражения (11 цифр)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ввод телефонного номера
        String telephoneNumber = new Scanner(System.in).nextLine();
        //убираем лишние символы при вводе, если номер начинается с 7 заменяем на 8
        telephoneNumber = telephoneNumber.replaceAll("[\\D\\s\\+\\-()]", "").trim();
        telephoneNumber = telephoneNumber.replaceAll("^8", "7");
        boolean flag = true;
        //если цифр 10 добавляем 7 в начале строки
        if (telephoneNumber.length() == 10) {
            telephoneNumber = "7" + telephoneNumber;
        }
        //если длина 11, но начинается не с 8 или 7 выводим на экран сообщение
        if ((telephoneNumber.length() == 11) &&
                !((telephoneNumber.startsWith("7") || (telephoneNumber.startsWith("8"))))) {
            System.out.println("Phone number is invalid");
            flag=false;
        }
        //если длина не соответствует 11 выводим сообщение
        if (telephoneNumber.length() != 11) {
            System.out.println("Phone number is ivalid");
            flag=false;
        }
        //если условия верны выводим номер по заданному шаблону
        if(flag) {
            telephoneNumber=telephoneNumber.replaceAll("(^\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
            ,"+$1 ($2) $3 $4-$5");
            System.out.print("Your phone number is: "+telephoneNumber);
        }
    }
}