import java.util.List;
import java.lang.Comparable;
public class SearchMax {
    public static <T extends Comparable<? super T>> T search(List<? extends T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }
}