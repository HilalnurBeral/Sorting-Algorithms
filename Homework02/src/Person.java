//-----------------------------------------------------
// Title: Sorting Person class
// Author: Hilalnur Beral
// Section: 1
// Assignment: 2
// Description: IDs are sorted in descending order in this class.
//-----------------------------------------------------
public class Person implements Comparable<Person> {

   // These are the declerations.

	public String name;
	public String surname;
	public long id;

	//Constructor for Person. 

	public Person(String name, String surname, long id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	/* Getters and setters. */

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	  private static void sort(Comparable[] a, int lo, int hi) { 
	        if (hi <= lo) return;
	        int j = partition(a, lo, hi);
	        sort(a, lo, j-1);
	        sort(a, j+1, hi);
	        assert isSorted(a, lo, hi);
	    }

	    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
	    // and return the index j.
	    private static int partition(Comparable[] a, int lo, int hi) {
	        int i = lo;
	        int j = hi + 1;
	        Comparable v = a[lo];
	        while (true) { 

	            // find item on lo to swap
	            while (less(a[++i], v)) {
	                if (i == hi) break;
	            }

	            // find item on hi to swap
	            while (less(v, a[--j])) {
	                if (j == lo) break;      // redundant since a[lo] acts as sentinel
	            }

	            // check if pointers cross
	            if (i >= j) break;

	            exch(a, i, j);
	        }

	        // put partitioning item v at a[j]
	        exch(a, lo, j);

	        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
	        return j;
	    }

	    /**
	     * Rearranges the array so that {@code a[k]} contains the kth smallest key;
	     * {@code a[0]} through {@code a[k-1]} are less than (or equal to) {@code a[k]}; and
	     * {@code a[k+1]} through {@code a[n-1]} are greater than (or equal to) {@code a[k]}.
	     *
	     * @param  a the array
	     * @param  k the rank of the key
	     * @return the key of rank {@code k}
	     * @throws IllegalArgumentException unless {@code 0 <= k < a.length}
	     */
	    public static Comparable select(Comparable[] a, int k) {
	        if (k < 0 || k >= a.length) {
	            throw new IllegalArgumentException("index is not between 0 and " + a.length + ": " + k);
	        }
	       
	        int lo = 0, hi = a.length - 1;
	        while (hi > lo) {
	            int i = partition(a, lo, hi);
	            if      (i > k) hi = i - 1;
	            else if (i < k) lo = i + 1;
	            else return a[i];
	        }
	        return a[lo];
	    }



	   /***************************************************************************
	    *  Helper sorting functions.
	    ***************************************************************************/
	    
	    // is v < w ?
	    private static boolean less(Comparable v, Comparable w) {
	        if (v == w) return false;   // optimization when reference equals
	        return v.compareTo(w) < 0;
	    }
	        
	    // exchange a[i] and a[j]
	    private static void exch(Object[] a, int i, int j) {
	        Object swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }


	   /***************************************************************************
	    *  Check if array is sorted - useful for debugging.
	    ***************************************************************************/
	    private static boolean isSorted(Comparable[] a) {
	        return isSorted(a, 0, a.length - 1);
	    }

	    private static boolean isSorted(Comparable[] a, int lo, int hi) {
	        for (int i = lo + 1; i <= hi; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }

	
	
	
	//Quick sort partition method for sorting elements in descending order.

	private static int partitionD(Comparable[] arr, int low, int high) {
		int i = low, j = high + 1;
		Comparable pivot = arr[low];
		while (true) {
			while (pivot.compareTo(arr[++i]) < 0)
				if (i == high)
					break;
			while (arr[--j].compareTo(pivot) < 0)
				if (j == low)
					break;
			if (i >= j)
				break;

			Comparable temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}

		Comparable temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

		return j;
	}

	public static void sortD(Comparable[] a)
	 {
	 sortD(a, 0, a.length - 1);
	 }

	private static void sortD(Comparable[] arr, int low, int high) {
		if (high <= low)
			return;
		int j = partitionD(arr, low, high);
		sortD(arr, low, j - 1); // Sort left part.
		sortD(arr, j + 1, high); // Sort right part.
	}
	public int compareTo(Person o) {
		if (this.id > o.id ) return +1;
		 if (this.id < o.id ) return -1;
		 
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		/*Creating ten different authors*/
		//rearrange names and ids
		
		Person one =new Person("Mary Benedict", "Hudson", 423456789L);
		Person two= new Person("Taylor", "Swift", 787654321L);
		Person three = new Person("Stephan", "King", 456783921L);
		Person four = new Person("Sherlock", "Holmes", 214365578L);
		Person five = new Person("Kate", "Middleton", 132435465L);
		Person six = new Person("Tesla", "Edison", 914263547L);
		Person seven = new Person("Adam", "Smith", 867594321L);
		Person eight = new Person("Hilalnur", "Beral", 868593468L);
		Person nine = new Person("Hary", "Markle", 573458743L);
		Person ten = new Person("Elizabeth", "Queen", 846327641L);
		
		Comparable p[]= {one.getId(),two.getId(),three.getId(),four.getId(),five.getId(),six.getId(),
				seven.getId(),eight.getId(),nine.getId(),ten.getId()};
		Comparable p2[]= {one.getId(),two.getId(),three.getId(),four.getId(),five.getId(),six.getId(),
				seven.getId(),eight.getId(),nine.getId(),ten.getId()};
		// I am Calling sort method to sort the objects according to their IDs.
		System.out.println("Quicksort in ascending order");
		sort(p,0,p.length-1);

		for(int i=0; i<p.length;i++) {		
		System.out.println(p[i]);
		}	
		
		System.out.println("Quicksort in descending order");
	
		sortD(p2);
		for(int i=0; i<p2.length;i++) {		
			System.out.println(p2[i]);
			}	
	}
}
