package de.unistuttgart.vis.dsass2019.ex02.p2;

public class Sorter {


    public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
    	
    	int minIndex = 0;
    	
    	for (int i = 0; i <= list.size(); i++) {
    		minIndex = i;
    		
    		for (int j = i + 1; j < list.size(); j++) {
    			if (list.get(j).compareTo(list.get(minIndex)) < 0) {
    				minIndex = j;
    			}
    		}

			list.swap(i, minIndex);
    	}
	}

    public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		
    	for (int i = 0; i < list.size() - i; i++) {
			    
			 for(int j = 0; j < list.size() - 1 - i; j++) {
			    if (list.get(j + 1).compareTo(list.get(j)) < 0) {
			    	list.swap(j, j + 1);
			    }
			 }
    	}
	}

	private static  <T extends Comparable<T>> int divide(SimpleList<T> list, int start, int end, int pivot) {
    	int newPivot = start;
		T pivotValue = list.get(pivot);
		list.swap(pivot, end);

		for (int i = start; i < end; i++) {
			if (list.get(i).compareTo(pivotValue) <= 0) {
				list.swap(newPivot, i);
				newPivot++;
			}
		}

		list.swap(end, newPivot);
    	return newPivot;
	}

	public static <T extends Comparable<T>> void quickSort(SimpleList<T> list, int start, int end) {
    	if (end > start) {
    		int pivot = divide(list, start, end, end);
    		quickSort(list, start, pivot - 1);
    		quickSort(list, pivot + 1, end);
		}
	}

}
