import java.util.Map;
import java.util.TreeMap;

public class Q06_TreeMapFrekans {
    public static void main(String[] args) {
        // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.

        String input="ahmet aaa";

        String[] input1=input.split("");

        Map<String,Integer> frekans=new TreeMap<>();

        for (int i = 0; i <input1.length ; i++) {
            if(!frekans.keySet().contains(input1[i])){frekans.put(input1[i],1);}
            else {frekans.put(input1[i],frekans.get(input1[i])+1);}


        }
        for (String each: frekans.keySet()
             ) {
            System.out.println(frekans.get(each)+" "+each);

        }
    }
}
