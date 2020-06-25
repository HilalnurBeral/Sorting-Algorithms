
// -----------------------------------------------------
// Title: Sorting
// Author: Hilalnur Beral
// ID: 11549136358
// Section: 1
// Assignment: 2
// Description: Different sorting algorithms which is asked in our homework are implemented in this class.
// -----------------------------------------------------

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class SortingAlgorithm {
	
	 // Here, input integer array is sorted in descending order and then array is sorted from right to left.
	
	private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // is v < w ?
    private static boolean less(Object v, Object w, Comparator comparator) {
        return comparator.compare(v, w) < 0;
    }
	 
	 private static void exch(Object[] a, int i, int j) {
	        Object swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }
	 
	 private static boolean isSorted(Comparable[] a) {
	        return isSorted(a, 0, a.length);
	    }

	    // is the array a[lo..hi) sorted
	    private static boolean isSorted(Comparable[] a, int lo, int hi) {
	        for (int i = lo + 1; i < hi; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }

	    private static boolean isSorted(Object[] a, Comparator comparator) {
	        return isSorted(a, 0, a.length, comparator);
	    }

	    // is the array a[lo..hi) sorted
	    private static boolean isSorted(Object[] a, int lo, int hi, Comparator comparator) {
	        for (int i = lo + 1; i < hi; i++)
	            if (less(a[i], a[i-1], comparator)) return false;
	        return true;
	    }
	 
	 
	 public static void sortingg(Comparable[] a) {
	        int n = a.length;
	        for (int i = 1; i < n; i++) {
	            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
	                exch(a, j, j-1);
	            }
	            assert isSorted(a, 0, i);
	        }
	        assert isSorted(a);
	    }
	
	public static void sort(Comparable[] arr) {
		int i;
		int j;
		int N = arr.length;
		for (i = N; i > 0; i--) {
			for (j = i; j < N && arr[j - 1].compareTo(arr[j]) < 0; j++) {
				Comparable temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	// This is an  Insertion sort algorithm for sorting an array of double values. 
	public static void sortDouble(Comparable[] arrayOfDoubles) {
		int i;
		int j;
		int N = arrayOfDoubles.length;
		for (i = 1; i < N; i++) {
			for (j = i; j > 0 && arrayOfDoubles[j].compareTo(arrayOfDoubles[j - 1]) < 0; j--) {
				Comparable temp = arrayOfDoubles[j];
				arrayOfDoubles[j] = arrayOfDoubles[j - 1];
				arrayOfDoubles[j - 1] = temp;
			}
		}
	}

	// This is an  Merge Sort algorithm for  sorting  an integer array in descending order.
	public static void merge(Comparable[] a, int low, int high, int mid) { 
		
	    Comparable<Integer>[] temp = new Comparable[ high - low + 1 ]; 
	
	 int i = low, j = mid + 1, n = 0; 
	    
		// 'i' monitors the head index of the low half of the range.
		 // 'j' monitors the head index of upper half of the range.
	 // While we still have a entry in one of the halves.
	    while ( i <= mid || j <= high ) 
	    { 
	        // in Here Lower half is exhausted. Only copy from the upper half.
	        if ( i > mid ) 
	        { 
	            temp[ n ] = a[ j ]; 
	            j++; 
	        } 
	        // in here Upper half is exhausted. only copy from the lower half.
	        else if ( j > high ) 
	        { 
	            temp[ n ] = a[ i ]; 
	            i++; 
	        } 
	        // Compare the two Movie4 objects at the head of the lower and upper halves.
	        // If lower is less than upper copy from lower.
	        else if ( a[ i ].compareTo(a[ j ]) == 1) 
	        {   
	            temp[n] = a[i];
	            i++;
	        }
	        // Lower is bigger than upper. Copy from upper.
	        else
	        {
	            temp[n] = a[j];
	            j++;
	        }
	        n++;
	    }
	    // Here ,elements are copied back to the 'movie' array from the temp buffer.
	    for ( int k = low ; k <= high ; k++ ) 
	    {
	        a[ k ] = temp[ k - low ]; 
	    }


	}
	
	
	// Temporary array for merges.
	private static Comparable[] temp; 

	public static void mergeSort(Comparable[] arr) {
		temp = new Comparable[arr.length]; 
		sorti(arr, 0, arr.length - 1);
	}

	private static void sorti(Comparable[] a, int low, int high) {
		if (low <= high)
			return;
		int mid = (high - low) / 2 + low;
		sorti(a, low, mid);
		sorti(a, mid + 1, high);
		merge(a, low, mid, high);
	}

	public static void main(String[] args) throws IOException {
		 FileReader file = new FileReader("Input.txt");
		 Scanner input = new Scanner(file);
		 int size = input.nextInt();
	        Comparable[] arr1 = new Comparable [size];
	        int j=0;
	        try {
	            
	            while(input.hasNext())
	            {
	                arr1[j] = input.nextInt();
	                j++;
	            }
	            input.close();
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	       // System.out.println(arr1);

		

		//Comparable[] arr1 = { 1, 5, 14, 7, 9, 23 };

		Comparable[] arr2 = { 1.08, 5.98, 14.03, 7.04, 9.06, 23.15 };

		for (int i = 0; i < arr2.length; i++) {
			sortDouble(arr2);

			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			sort(arr1);

			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {

			mergeSort(arr1);

			System.out.print(arr1[i] + " ");
		}
		
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {

			sortingg(arr1);

			System.out.print(arr1[i] + " ");
		}

	}

}
