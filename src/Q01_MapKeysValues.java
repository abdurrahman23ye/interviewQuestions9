import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
    public static void main(String[] args) {
        //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
        //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
        //5 tane ulke ismi yazdırıyoruz. (keyset())
        //5 tane ulke nufusunu yazdırıyoruz. (values())
        //nüfusların toplamını yazdırın.
        //kaç tane 50 milyondan fazla nüfuslu ülke var?
        // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

        Map<String,Integer>ulkeler=new HashMap<>();

        ulkeler.put("Türkiye",80);
        ulkeler.put("Yunanistan",15);
        ulkeler.put("Bulgaristan",8);
        ulkeler.put("Gürcistan",3);
        ulkeler.put("Suriye",30);

        System.out.println(ulkeler);

        System.out.println(ulkeler.keySet());
        System.out.println(ulkeler.values());

        int toplamNufus=0;

        for (int each:ulkeler.values()) { toplamNufus+=each; }
        System.out.println(toplamNufus);

        System.out.println(ulkeler.values().stream().filter(t -> t > 50).count());


    }
}
