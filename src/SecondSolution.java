import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Дано два списка со случайными целыми числами. Необходимо создать в третий список, в котором будут те элементы,
// которые есть и в первом и втором списках

public class SecondSolution {
    public static List<Integer> findMatchNumbers(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet set = new HashSet<>(firstList);
        for (int i = 0; i < secondList.size(); i++) {
            if (set.contains(secondList.get(i))) {
                list.add(secondList.get(i));
            }
            i++;
        }
        return list;
    }
}
