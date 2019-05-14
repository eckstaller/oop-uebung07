package ueb07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class SortierenTest {

    @Test
    void swapTest(){
        Integer[] i = new Integer[] {1,2,3};
        System.out.println(Arrays.toString(i));
        Sortieren.swap(i, 0,1);
        System.out.println(Arrays.toString(i));
        Assertions.assertArrayEquals(new Integer[]{2,1,3}, i);
    }

    @Test
    void bubbleSortTest(){
        Integer[] i = new Integer[] {5,3,4,7,1};
        System.out.println(Arrays.toString(i));
        Sortieren.BubbleSort(i);
        System.out.println(Arrays.toString(i));
        Assertions.assertArrayEquals(new Integer[] {1,3,4,5,7},i);
    }
}
