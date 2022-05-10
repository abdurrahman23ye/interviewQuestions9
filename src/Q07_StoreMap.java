import java.util.HashMap;
import java.util.Map;

public class Q07_StoreMap {
    public static void main(String[] args) {

         /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */
        Map<Integer,Kimlik> bilgi=new HashMap<>();

        String isimSoyisim="Ahmet Oren";
        String adres="elazig";
        int tel=1234556675;
        Kimlik obj=new Kimlik(isimSoyisim,adres,tel);

        bilgi.put(1000,obj);

        System.out.println(bilgi.get(1000).adres);
        System.out.println(bilgi.get(1000).tel);
        System.out.println(bilgi.get(1000).isimSoyisim);

        for (Integer each: bilgi.keySet()
             ) {
            System.out.println(bilgi.get(each).isimSoyisim);

        }

    }
}
