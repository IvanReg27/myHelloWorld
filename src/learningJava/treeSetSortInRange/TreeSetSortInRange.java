package learningJava.treeSetSortInRange;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSortInRange {  //создал коллекцию вида TreeSet, положил туда данные типа интов (предположим возраст работников)
    public static void main(String[] args) {

        TreeSet<Integer> usersTaxHabRegAge = new TreeSet<Integer>();
        usersTaxHabRegAge.add(34);
        usersTaxHabRegAge.add(40);
        usersTaxHabRegAge.add(37);
        usersTaxHabRegAge.add(59);
        usersTaxHabRegAge.add(50);
        usersTaxHabRegAge.add(59);
        usersTaxHabRegAge.add(38);
        usersTaxHabRegAge.add(48);
        usersTaxHabRegAge.add(43);
        usersTaxHabRegAge.add(49);

        TreeSet<Integer> sub_set = new TreeSet<Integer>(); // методом subSet определил необходимый диапазон
        sub_set = (TreeSet<Integer>)usersTaxHabRegAge.subSet(34,50);

        Iterator iterate; // итератором прошел по коллекции TreeSet в пределах ранее заданного диапазона
        iterate = sub_set.iterator();
        System.out.println("Sort users age in a range: ");

        while (iterate.hasNext()) {
            System.out.println(iterate.next() + " ");
        }
    }
}