
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
//key와 value로 구성된 구조
public class map {
	public static void main(String[] ar){
		map map = new map();
        map.checkHashMap();
    }

    public void checkHashMap(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "A");
        map1.put("b", "B");
        System.out.println("map1 = " + map1);
//        map1 = {a=A, b=B}

        System.out.println("map1.get(\"a\") = " + map1.get("a"));
//        map1.get("a") = A

        System.out.println("map1.get(\"A\") = " + map1.get("A"));
//        map1.get("A") = null
        map1.put("b", "BitCoin");
        System.out.println("map1 = " + map1);
//        map1 = {a=A, b=BitCoin}
        System.out.println("------------------------------------------");
        Set<String> keySet = map1.keySet();
        System.out.println("KeySet = " + keySet);
//        KeySet = [a, b]

        System.out.println();
        for(String tempKey: keySet){
            System.out.println("map1.get(\"" + tempKey + "\") = " + map1.get(tempKey));
        }
//        map1.get("a") = A
//        map1.get("b") = BitCoin

        System.out.println();
        Collection<String> values = map1.values();
        System.out.println("values = " + values);
//        values = [A, BitCoin]
    }
}
