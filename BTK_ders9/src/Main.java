public class Main {
    public static void main(String[] args) {
        int gurup = 1;// kaçıncı gurup oldugu belli olsun diye ekledim
        String[][] sehırler = new String[3][3];

        sehırler[0][0] = "İstanbul";
        sehırler[0][1] = "Aksaray";
        sehırler[0][2] = "Ankara";
        // 2.gurup
        sehırler[1][0] = "Konya";
        sehırler[1][1] = "Rize";
        sehırler[1][2] = "Nigde";
        //3.gurup
        sehırler[2][0] = "Adana";
        sehırler[2][1] = "Diyarbakır";
        sehırler[2][2] = "KahramanMaraş";

        for (int i = 0; i < 3; i++) {
            System.out.println(gurup + ".Gurup");
            gurup++;
            for (int a = 0; a <= 2; a++) {
                System.out.println(sehırler[i][a]);
            }
        }
    }}
