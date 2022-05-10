import java.util.LinkedHashMap;
import java.util.Map;

public class Q03_PrintMap {
    public static void main(String[] args) {
        //aşağıdaki çıktıyı elde ediniz
        // Kiraz 100
        // İncir 200
        // Enginar 150
        // Üzüm 145
        // Nar 250

        Map<Integer,String> map=new LinkedHashMap<>();

        map.put(100,"Kiraz");
        map.put(200,"İncir");
        map.put(150,"Enginar");
        map.put(145,"Üzüm");
        map.put(145,"Nar");

        for (Integer each: map.keySet()
             ) {
            System.out.println(map.get(each)+" "+each);

        }


    }
}
