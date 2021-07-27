import java.util.ArrayList;
import java.util.List;

//Дано два списка со случайными целыми числами. Необходимо создать в третий список, в котором будут те элементы,
// которые есть и в первом и втором списках

public class SecondSolution {
    public static List<Integer> findMatchNumbers(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        List<Integer> result = new ArrayList<>(firstList);
        result.retainAll(secondList);
        return result;
    }
}
