import java.util.*;

public class Time {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,3,4,0,8,2,34,7));

        Collections.shuffle(list);
        System.out.println(list);
    }
}
