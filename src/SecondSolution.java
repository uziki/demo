import java.util.ArrayList;
import java.util.List;

//Дано два списка со случайными целыми числами. Необходимо создать в третий список, в котором будут те элементы,
// которые есть и в первом и втором списках

public class SecondSolution {
    public static List<Integer> findMatchNumbers(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        mergeSort(firstList);
        mergeSort(secondList);
        ArrayList list = new ArrayList();

        int i = 0, j = 0;
        while (i < firstList.size() && j < secondList.size()) {
            if (firstList.get(i) < secondList.get(j)) {
                i++;
            } else if (firstList.get(i) > secondList.get(j)) {
                j++;
            } else {
                list.add(firstList.get(i));
                i++;
                j++;
            }
        }

        return list;
    }

    public static void mergeSort(ArrayList<Integer> list) {
        int mid;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        if (list.size() > 1) {
            mid = list.size() / 2;

            for (int i = 0; i < mid; i++)
                left.add(list.get(i));

            for (int j = mid; j < list.size(); j++)
                right.add(list.get(j));

            mergeSort(left);
            mergeSort(right);
            merge(list, left, right);
        }
    }

    private static void merge(ArrayList<Integer> numList, ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        int numbersIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                numList.set(numbersIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                numList.set(numbersIndex, right.get(rightIndex));
                rightIndex++;
            }
            numbersIndex++;
        }

        int tempIndex = 0;
        if (leftIndex >= left.size()) {
            temp = right;
            tempIndex = rightIndex;
        } else {
            temp = left;
            tempIndex = leftIndex;
        }

        for (int i = tempIndex; i < temp.size(); i++) {
            numList.set(numbersIndex, temp.get(i));
            numbersIndex++;
        }
    }
}
