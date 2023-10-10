//программа разделяет текст на слова и возвращает каждое слово на отдельной строке
public class Main {
    //сам текст
    static String text100 ="Terminator 2: Judgment Day is a 1991 American science fiction action film" +
            " directed by James Cameron, who co-wrote the script with William Wisher. " +
            "Starring Arnold Schwarzenegger, Linda Hamilton, Robert Patrick (pictured), and Edward Furlong," +
            " it is the sequel to The Terminator (1984). In the film, Skynet, a malevolent artificial" +
            " intelligence, sends a Terminator android (Patrick) back in time to 1995 to kill the young" +
            " John Connor (Furlong), the future leader of the human resistance. The resistance sends back" +
            " a less-advanced Terminator (Schwarzenegger), reprogrammed to protect Connor.";
    //метод редактирования текста
    static void words(String text){
        //заменяем все символы кроме слов на пробелы
        text=text.replaceAll("[^A-z]+"," ").trim();
        //отредактированный текст разделяем на пробелы и помещаем в массив
        String[] split=text.split("\\s");
        //выводим массив на экран
        for(String i:split){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        words(text100);
    }



}