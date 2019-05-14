package ueb07;

import java.util.Comparator;

public class Sortieren {
    public static<T> void swap(T[] array, int i, int j) {
        T help = array[j];
        array[j] = array[i];
        array[i] = help;
    }

    static<T extends Comparable> void BubbleSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j].compareTo(array[j+1])>0)
                    swap(array,j,j+1);
            }
        }
    }

    static<T> void BubbleSort(T[] array, Comparator comparator) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(comparator.compare(array[j],array[j+1])>0)
                    swap(array,j,j+1);
            }
        }
    }
}
