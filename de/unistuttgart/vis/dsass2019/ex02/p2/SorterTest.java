package de.unistuttgart.vis.dsass2019.ex02.p2;

import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    private static SimpleList<Integer> listToBeSorted;
    private static SimpleList<Integer> sortedList;

    @BeforeEach
    void init() {
        // 6, 12, 9, -4, 0, 2, 4
        listToBeSorted = new SimpleList<>();

        listToBeSorted.append(6);
        listToBeSorted.append(12);
        listToBeSorted.append(9);
        listToBeSorted.append(-4);
        listToBeSorted.append(0);
        listToBeSorted.append(2);
        listToBeSorted.append(4);

        sortedList = new SimpleList<>();
        sortedList.append(-4);
        sortedList.append(0);
        sortedList.append(2);
        sortedList.append(4);
        sortedList.append(6);
        sortedList.append(9);
        sortedList.append(12);
    }

    @org.junit.jupiter.api.Test
    void selectionSort() {
        Sorter.selectionSort(listToBeSorted);
        for (int i = 0; i < listToBeSorted.size(); i++) {
            assertEquals(sortedList.get(i), listToBeSorted.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void bubbleSort() {
        Sorter.bubbleSort(listToBeSorted);
        for (int i = 0; i < listToBeSorted.size(); i++) {
            assertEquals(sortedList.get(i), listToBeSorted.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void quickSort() {
        Sorter.quickSort(listToBeSorted, 0, listToBeSorted.size() - 1);
        for (int i = 0; i < listToBeSorted.size(); i++) {
            assertEquals(sortedList.get(i), listToBeSorted.get(i));
        }
    }
}