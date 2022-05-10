import java.util.HashMap;
import java.util.Map;

public class Q05_PrintMap {
    public static void main(String[] args) {
          /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */
        Map<Integer,String> sayilar=new HashMap<>();

        sayilar.put(1,"bir");
        sayilar.put(2,"iki");
        sayilar.put(3,"üç");
        sayilar.put(4,"dört");
        sayilar.put(5,"beş");
        sayilar.put(6,"alti");

        for (Integer each: sayilar.keySet()
             ) {
            System.out.println(each+" "+sayilar.get(each));

        }
    }
}
