import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test.");

        System.out.println();
        System.out.println("Druga linia.");

        System.out.println();
        System.out.println("Trzecia linia.");

        System.out.println();
        System.out.println("Sample of a list.");
        List<Integer> integerList = Arrays.asList(1, 2, 0, 5, 2, 2, 1, 0, 2);
        System.out.println("Print list:");
        integerList.forEach(System.out::println);

        System.out.println();
        System.out.println("Sort - natural order.");
        integerList.sort(Integer::compareTo);
        integerList.forEach(System.out::println);

        System.out.println();
        System.out.println("Sort - reverse order.");
        integerList.sort(Comparator.reverseOrder());
        integerList.forEach(System.out::println);

        System.out.println();
        System.out.println("Tablica z listy.");
        Integer[] tab = new Integer[integerList.size()];
        integerList.toArray(tab);
        System.out.println(Arrays.toString(tab));

        System.out.println();
        System.out.println("An array in natural order.");
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        System.out.println();
        System.out.println("An array in reversed order.");
        Comparator<Integer> comparator = Comparator.reverseOrder();
        Arrays.sort(tab, comparator);
        System.out.println(Arrays.toString(tab));


//        program pokaże unikalne pozycje w tablicy i policzy ilość wystąpień dla każdej pozycji


        System.out.println();
        Set<Integer> integerSet = new HashSet<>(integerList);
        Integer[] tabUnique = new Integer[integerSet.size()];
        integerSet.toArray(tabUnique);
        System.out.println("An array of unique elements.");
        System.out.println(Arrays.toString(tabUnique));

        int[] tabRepetitions = new int[tabUnique.length];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tabUnique.length; j++) {
                if (tab[i].equals(tabUnique[j])) {
                    tabRepetitions[j]++;
                }
            }
        }

        System.out.println();
        System.out.println("Unique elements and repetitions:");
        for (int i = 0; i < tabUnique.length; i++) {
            System.out.println(tabUnique[i] + ": " + tabRepetitions[i]);
        }
    }
}
