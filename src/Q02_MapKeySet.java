import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_MapKeySet {
    public static void main(String[] args) {
        // create a map of zipcodes and Cities, at least 3 entries
        // get the keySet and iterate over it, print the map like below:
        // zipcode1 => city1
        // zipcode2 => city2
        // part 2: print all the keys of the map

        Map<Integer,String> zipCodes=new HashMap<>();
        zipCodes.put(0,"Elazig");
        zipCodes.put(1,"Malatya");
        zipCodes.put(2,"Sivas");

        List<Integer> entryKeys=new ArrayList<>();

        for (Integer each: zipCodes.keySet()
             ) { entryKeys.add(each);

        }
        System.out.println("entryKeys = " + entryKeys);

        for (int i = 0; i < zipCodes.size() ; i++) {

            System.out.println(entryKeys.get(i)+"->"+zipCodes.get(i));
        }



        }

    }

