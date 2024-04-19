public class Main {
    public static void main(String[] args) {

        System.out.println("BTK ders 10 stringler :) --------------------->");
        System.out.println("-----------------");

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("-----------------");

        System.out.println("Elelman sayısı : "+ mesaj.length());
        System.out.println("-----------------");
        System.out.println("5. eleman "+mesaj.charAt(4));
        System.out.println("-----------------");
   for( int karaktersayısı=0;karaktersayısı<mesaj.length();karaktersayısı++ ) {
       System.out.println(karaktersayısı+1 + ". eleman = " + mesaj.charAt(karaktersayısı));// +1 dememin nedeni 0. eleman demesin diye
   }
        System.out.println("-----------------");
   System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println("-----------------");
        System.out.println(mesaj.startsWith("B"));// B ile başlıyor ise true
        System.out.println("-----------------");// Hatırlatma java büyük küçük harflere duyarlı
        System.out.println(mesaj.endsWith("l"));// l ile bitiyor ise true
        System.out.println("-----------------");

    System.out.println("a harfi kaçıncı eleman   --> "+mesaj.indexOf("a"));
        System.out.println("-----------------");
        System.out.println("çok metni  kaçıncı sırada    --> "+mesaj.indexOf("çok"));
        System.out.println("-----------------");
        System.out.println("ha  metni sondan kaçıncı sırada    --> "+mesaj.lastIndexOf("ha"));





    }
}