package de.unistuttgart.vis.dsass2019.ex02.p2;

public class Sorter {

    public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
    	
    	int minValue = 0;
    	
    	for (int i=0; i<list.size(); i++) {
    		minValue = i;
    		
    		for(int j=1; j<list.size(); j++) {
    			if(list.get(i).compareTo(list.get(j)) < 0) {
    				minValue = j;
    			}
    		list.swap(i, minValue);
    		}
    	} 
    	return;
    }

    public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		
    	for (int i=0; i<list.size(); i++) {
			    
			 for(int j=i+1; j<list.size()-1 -i; j++) {
			    if(list.get(i).compareTo(list.get(j)) < 0) {
			    	list.swap(i, j);
			    }
			 }
    	}
		return;
    }

    public static <T extends Comparable<T>> void quickSort(ISimpleList<T> list, int low, int high) {
    	
    	int i = low;
    	int j = high;
    	
    	int pivot = list[high];
    	
    	while (i <= j) {
    		
    		while (list[i] < pivot) {
    			i++;
    		}
    		
    		while (list[high] < pivot) {
    			j--;
    		}
    		if (i <= j) {
    			list.swap(i, j);
    			i++;
    			j--;
    		}
    	}
    	
    	if (low < j)
    		quickSort(list, low, j);
    	if (i < high)
    		quickSort(list, i,high);
    }

    static void qSort (ISimpleList<T> list) {
    	quickSort(list, 0, list.size -1);
    }
}
