//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sayi = 102;
        int hesap = sayi % 2;

        if (hesap==0)
        {
            System.out.println(sayi+"  sayısı asal degildir");

        } else if (hesap==1) {
            System.out.println(sayi+"  sayısı asaldır");
        }
else {
    System.out.println(" Geçerli bir sayı giriniz");
        }
    }
    }
