import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String telephoneNumber = new Scanner(System.in).nextLine();
        telephoneNumber = telephoneNumber.replaceAll("[\\D\\s\\+\\-()]", "").trim();
        telephoneNumber = telephoneNumber.replaceAll("^8", "7");
        boolean flag = true;
        if (telephoneNumber.length() == 10) {
            telephoneNumber = "7" + telephoneNumber;
        }
        if ((telephoneNumber.length() == 11) &&
                !((telephoneNumber.startsWith("7") || (telephoneNumber.startsWith("8"))))) {
            System.out.println("Phone number is invalid");
            flag=false;
        }
        if (telephoneNumber.length() != 11) {
            System.out.println("Phone number is ivalid");
            flag=false;
        }
        if(flag) {
            telephoneNumber=telephoneNumber.replaceAll("(^\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})"
            ,"+$1 ($2) $3 $4-$5");
            System.out.print("Your phone number is: "+telephoneNumber);
        }
    }
}