import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
 
class ArrayTestArrange { 
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add(50);
        ls.add(3);
        ls.add(120);
        ls.add(32);
        ls.add(95);

        int[] a = {50, 3, 120, 32, 95};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}