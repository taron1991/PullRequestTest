import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Feachure {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("David", "M");
        map.put("Kate", "W");
        map.put("Petr", "M");
        map.put("Nataly", "W");

        Map<String, List<Map.Entry<String, String>>> collect = map.entrySet().stream().collect(Collectors.groupingBy(x -> x.getValue()));
        System.out.println(collect);

    }
}
