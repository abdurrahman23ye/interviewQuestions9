import java.util.HashMap;
import java.util.Map;

public class Q04_PrintMap {
    public static void main(String[] args) {
         /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */
        Map<Integer,String> map=new HashMap<>();

        map.put(10,"Java");
        map.put(20,"PHP");
        map.put(2,"Python");
        map.put(57,"C++");
        map.put(89,"C#");
        map.put(40,"Javascript");

        for (Integer each: map.keySet()
             ) {
            System.out.println(each+" "+map.get(each));

        }
    }
}
