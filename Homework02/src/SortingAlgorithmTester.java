//-----------------------------------------------------
// Title: Sorting tester class
// Author: Hilalnur Beral
// ID: 11549136358
// Section: 2
// Assignment: 2
// Description: This class tests the execution times of algorithms
//-----------------------------------------------------


//org.springframework.util.StopWatch;

public class SortingAlgorithmTester {
	
	
	public static void main(String[] args) { 
		
		int[] a = {2,31,34,41,50,66,98};
		int[] b = {98,66,50,41,34,31,20,8};
		int[] c = {50,9,33,99,4,23,31,4,2};
		
		
		
		
		long start, time ,timeb,timec,time2,time2b,time2c,time3a,time3b,time3c,time4a,time4b,time4c,time5a,time5b,time5c;
		long start1,start2,start3,start4,start5,start6,start7,start8,start9,start11,start12,start13,start14,start15,start16;
		
		start1 = System.nanoTime();
		
		SortingAlgorithms.sort1(a, 11549136358L);
	
		time = System.nanoTime() - start1;
		
		
start2 = System.nanoTime();
		
		SortingAlgorithms.sort1(b, 11549136358L);
	
		timeb = System.nanoTime() - start2;
		
		
start3 = System.nanoTime();
		
		SortingAlgorithms.sort1(c, 11549136358L);
	
		timec = System.nanoTime() - start3;
		
		
start4 = System.nanoTime();
		
		SortingAlgorithms.sort2(a, 11549136358L);
	
		time2 = System.nanoTime() - start4;
		
		
start5 = System.nanoTime();
		
		SortingAlgorithms.sort2(b, 11549136358L);
	
		time2b = System.nanoTime() - start5;
		
		
start6 = System.nanoTime();
		
		SortingAlgorithms.sort2(c, 11549136358L);
	
		time2c = System.nanoTime() - start6;
		
start7 = System.nanoTime();
		
		SortingAlgorithms.sort3(a, 11549136358L);
	
		time3a = System.nanoTime() - start7;
		
start8 = System.nanoTime();
		
		SortingAlgorithms.sort3(b, 11549136358L);
	
		time3b = System.nanoTime() - start8;
		
		
		
		start9 = System.nanoTime();
		
		SortingAlgorithms.sort3(c, 11549136358L);
	
		time3c = System.nanoTime() - start9;
		
		
		start11 = System.nanoTime();
		
		SortingAlgorithms.sort4(a, 11549136358L);
	
		time4a = System.nanoTime() - start11;
		

		start12 = System.nanoTime();
		
		SortingAlgorithms.sort4(b, 11549136358L);
	
		time4b = System.nanoTime() - start12;
		

		start13 = System.nanoTime();
		
		SortingAlgorithms.sort4(c, 11549136358L);
	
		time4c = System.nanoTime() - start13;
		
		
start14 = System.nanoTime();
		
		SortingAlgorithms.sort5(a, 11549136358L);
	
		time5a = System.nanoTime() - start14;
		

		start15 = System.nanoTime();
		
		SortingAlgorithms.sort5(b, 11549136358L);
	
		time5b = System.nanoTime() - start15;
		

		start16 = System.nanoTime();
		
		SortingAlgorithms.sort5(c, 11549136358L);
	
		time5c = System.nanoTime() - start16;
		
		/*Stopwatch watcher = new Stopwatch(); 
        watcher.Start(); 

        SortingAlgorithms.sort5(b, 1234567801L); 

        watcher.Stop();*/
		

	
		System.out.println("elapsed time " + time);
		System.out.println("elapsed time " + timeb);
		System.out.println("elapsed time " + timec +"\n");
		System.out.println("elapsed time " + time2);
		System.out.println("elapsed time " + time2b);
		System.out.println("elapsed time " + time2c +"\n");
		System.out.println("elapsed time " + time3a);
		System.out.println("elapsed time " + time3b);
		System.out.println("elapsed time " + time3c +"\n");
		System.out.println("elapsed time " + time4a);
		System.out.println("elapsed time " + time4b);
		System.out.println("elapsed time " + time4c+ "\n");
		System.out.println("elapsed time " + time5a);
		System.out.println("elapsed time " + time5b);
		System.out.println("elapsed time " + time5c + "\n");
		
		
	}

	
	}

