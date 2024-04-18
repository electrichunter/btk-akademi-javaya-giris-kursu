public class Main {
    public static void main(String[] args) {


        String[] ogr_s = new String[5];// fazla olursa ne yapacak dedim null yani boş diyormuş en azından hata vermiyor
// 0 dan başladım çünkü java 0 dan başlıyor
        // normalde veri tabnından çekeriz ama şimdi üşendim idare edin derste de böyle yaptı ama   :)

        //derste yukardaki fazla olursa dedigim şeyi eksik yazıyor o zaman hata veriyor dikkat edin
        ogr_s[0] = "ömer";
        ogr_s[1] = "faruk";
        ogr_s[2] = "uysal";
        ogr_s[3] = "volkan";

        for (int i = 0; i < ogr_s.length; i++) {
            System.out.println(ogr_s[i]);


        }
        System.out.println("Daha kaliteli yöntem ");

        //daha kısa daha güzel
        for (String DENEME:ogr_s){
        System.out.println(DENEME);
        }



    }
}