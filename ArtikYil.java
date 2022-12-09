import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yil girin: ");
        int year = scan.nextInt();
//300,500,1800,1900,100//false
//400,2000,2400
        if((year % 4==0 && year %100!=0) || (year%400==0) )//true
            System.out.println("Artik yil");
        else
            System.out.println("Artik yil degil");
    }
}
