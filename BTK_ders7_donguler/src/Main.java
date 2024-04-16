public class Main {
    public static void main(String[] args) {
//3 dersin kodunu buraya tek seferde yazmak istemekteyim ilk önce for dan başlıyacagım


        // for döngüsü


     /*   long startTime = System.currentTimeMillis();

        for (int i = 0; i <= 10000000; i++) {//"on milyon" olarak vermemin nedeni javanın hızını ölçmek işlemci ve bellek maksimum 40% ı gördü .
            // işlem zamanı çıktısı : İşlem 15.687 dakikada tamamlandı.
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime; //
        double minutes = duration / 1000.0; //  saniyeyi dakikaya çevir

        System.out.println("İşlem " + minutes + " dakikada tamamlandı.");


      */



    // while
int i = 0;
        while (i<=10){
            System.out.println(i);
            i++;//i++ şu koda eşittir bilmeyenler var ise i=i+1 bu da i+=1 e eşit

        }
        System.out.println("while bitti");



        // do-while          kullanılmaz be bu da egitimde var bende yazıyorum
        // bununda nedeni bence illaki 1 defa çalıştıgı için bence birazda karışık birde uzun


        do {
            System.out.println(i);
            i++;//i++ şu koda eşittir bilmeyenler var ise i=i+1 bu da i+=1 e eşit

        }
        while (i<=10)
            ;
        System.out.println("do-while bitti");
// bunu j olarak yapmış ta ben çevirmeyecegim zaten üst kısımda i++ ın i+=1 e eş oldugunu anlatmıştım hoca ileri görüşlü hoşuma gitti



    }
}