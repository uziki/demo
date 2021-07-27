import java.util.*;

//Дан список случайных целых чисел. Нужно удалить три последовательно идущих заданных числа
public class FirstSolution {
    public static List<Integer> removeThreeNumbers(ArrayList<Integer> list, int a, int b, int c) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        ListIterator<Integer> iterator = newList.listIterator();
        try {
            while (iterator.hasNext()) {
                if (iterator.next() == a) {
                    if (iterator.next() == b) {
                        if (iterator.next() == c) {
                            iterator.remove();
                            iterator.previous();
                            iterator.remove();
                            iterator.previous();
                            iterator.remove();
                        }
                    }
                }
            }
        } catch (NoSuchElementException e) {
            return list;
        }
        return newList;
    }
}
