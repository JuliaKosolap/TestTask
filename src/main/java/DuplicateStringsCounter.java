import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateStringsCounter {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Olga");
        strings.add("Maxim");
        strings.add("Olga");
        strings.add("Julia");
        strings.add("Maxim");
        strings.add("Bogdan");
        strings.add("Olga");
        
        System.out.println(countDuplicatedStrings(strings));
    }
    public static HashMap<String, Integer> countDuplicatedStrings(List<String> strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str: strings) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }
        return hashMap;
    }

}
