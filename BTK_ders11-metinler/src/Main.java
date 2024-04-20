public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugin hava çok güzel  ";

        String ymesaj = mesaj.replace(' ', '-');// boşluk yerine - atadık
        System.out.println(ymesaj);
        System.out.println("---------------------------------------");
        System.out.println(mesaj.substring(2,6));// 2 den 6 ya kadarki karakterleri yazdırdı
        System.out.println("---------------------------------------");

        for (String y1mesaj :mesaj.split(" ")){
    System.out.println(y1mesaj);
    }
        System.out.println("---------------------------------------");
    String büyükmesaj ="BU METİNİN HEPSİ BÜYÜK HARF Tİ ";

        System.out.println(büyükmesaj.toLowerCase());
        System.out.println("---------------------------------------");
        String küçükmesaj ="bu metinin hepsi küçük harf ti ";
        System.out.println(küçükmesaj.toUpperCase());

    }
}