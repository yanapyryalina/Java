/**
* Class: CSE 11 Introduction to Computer Science: Object Oriented Programming (Java)
* Instructor: Dr. Robert August
* Description: The following class consists of three sort methods:
* bubble sort, selection sort, and insertion sort. 
* Each method takes in an unsorted array and returns a sorted array.
* The class requires a separate testing application called ThreeSortsTest shown below.
* Due: 05/20/2019
* Author: Yana Pyryalina
*
*/

import java.util.*;

public class ThreeSorts
{
  /** The following method is the bubble sort method */
  public int[] bubbleSort(int [] inputArr)
  {
    boolean isSorted = false;
    
    while(!isSorted)
    {
      isSorted = true;
      int temp = 0; // temporary storage variable used in swap
      
      // loop through the array for value comparisons and potential swaps
      for(int i = 0; i < inputArr.length - 1; i++)
      {
        
        // if true, swaps the two values
        // if false, skips & compares next values
        if(inputArr[i] > inputArr[i+1]) 
        {
          temp = inputArr[i];
          inputArr[i] = inputArr[i+1];
          inputArr[i+1] = temp;
          isSorted = false; // set to false to continue loop
        }
      }
      // when for loop ends, isSorted comes back to true and exits the loop
    }
    return inputArr;
  }
  
  /** The following method is the selection sort method */
  public int[] selectionSort(int [] inputArr)
  {
    int min = inputArr[0]; // default minimum value from the array
    int minLoc = 0; // default location of the minimum value from the array
    int temp;
    
    for(int i = 0; i < inputArr.length - 1; i++) 
    {
      min = inputArr[i];
      minLoc = i;
      for (int j = i; j < inputArr.length; j++)
      {
        // find and store the minimum value and its location - used for swapping values
        if(inputArr[j] < min)
        {
          min = inputArr[j];
          minLoc = j;          
        }
      }
        // swap the current value (i) and the minimum value
        temp = inputArr[i];
        inputArr[i] = inputArr[minLoc];
        inputArr[minLoc] = temp;
    }    
    return inputArr;
  }
  
  /** The following method is the insertion sort method */
  public int[] insertionSort(int [] inputArr)
  {
    // establish variables used in the loops
    int i; // variable for 1st loop
    int j; // variable for 2nd loop
    int temp; // temporary variable for swap
    
    for(i = 1; i < inputArr.length; i++)
    {
      j = i;
      // Insert numbers[i] into sorted part 
      // stopping once inputArr[i] in correct position
      while (j > 0 && inputArr[j] < inputArr[j - 1]) 
      {
        // Swap numbers[j] and inputArr[j - 1]
        temp = inputArr[j];
        inputArr[j] = inputArr[j - 1];
        inputArr[j - 1] = temp;
        --j;
       }
     } 
    return inputArr;
  } 
}

/**
* Class: CSE 11 Introduction to Computer Science: Object Oriented Programming (Java)
* Instructor: Dr. Robert August
* Description: The following application tests the Three Sorts class
* that performs bubble sort, selection sort, and insertion sort. 
* Due: 05/20/2019
* Author: Yana Pyryalina
*
*/

import java.io.*;

public class ThreeSortsTest
{
  public static void main(String [] args) throws IOException
  {    
    // establish variables for performing bubble sort
    int[] myArr1 = new int[300];
    int[] newArr1 = new int[300];
    
    // bubble sort
    myArr1 = readFile1();
    
        // create a new ThreeSorts object for bubble sort
        ThreeSorts threeSortsBubble = new ThreeSorts();
    
    newArr1 = threeSortsBubble.bubbleSort(myArr1);
    System.out.println("Bubble sort start.");
    displayItems(newArr1);
    System.out.println("");
    System.out.println("Bubble sort end. \n");
    
    

    // establish variables to perform selection sort
    int[] myArr2 = new int[400];
    int[] newArr2 = new int[400];
    
    // selection sort
    myArr2 = readFile2();
    
        // create a new ThreeSorts object for selection sort
        ThreeSorts threeSortsSelection = new ThreeSorts();
    
    newArr2 = threeSortsSelection.selectionSort(myArr2);
    System.out.println("Selection sort start.");
    displayItems(newArr2);
    System.out.println("");
    System.out.println("Selection sort end. \n");
    
    
    
    
    // establish variables to perform insertion sort
    int[] myArr3 = new int[500];
    int[] newArr3 = new int[500];
    
    // insertion sort
    myArr3 = readFile3();
    
        // create a new ThreeSorts object for insertion sort
        ThreeSorts threeSortsInsertion = new ThreeSorts();
    
    newArr3 = threeSortsInsertion.insertionSort(myArr3);
    System.out.println("Insertion sort start.");
    displayItems(newArr3);
    System.out.println("");
    System.out.println("Insertion sort end. \n");    
  }
  
  
  
  
  public static int[] readFile1() throws IOException
  {
    int[] unsorted = new int[300];
    
    // establish variables for reading the file
    FileInputStream is = new FileInputStream("rand300.txt");
    Scanner scnr = new Scanner(is);
    int count = 0; // keeps track of which element in array to fill
    
    // fill up the array with inputs from the file
    for(int i = 0; i < 300; i++) 
    {
      unsorted[count] = scnr.nextInt(); 
      // System.out.println(count + " " + holdArray[count]);
      count++; // increment index of the array
    }
    return unsorted;
  }
  
  public static int[] readFile2() throws IOException
  {
    int[] unsorted = new int[400];
    
    // establish variables for reading the file
    FileInputStream is = new FileInputStream("rand400.txt");
    Scanner scnr = new Scanner(is);
    int count = 0; // keeps track of which element in array to fill
    
    // fill up the array with inputs from the file
    for(int i = 0; i < 400; i++) 
    {
      unsorted[count] = scnr.nextInt(); 
      // System.out.println(count + " " + holdArray[count]);
      count++; // increment index of the array
    }
    return unsorted;
  }
  
    public static int[] readFile3() throws IOException
  {
    int[] unsorted = new int[500];
    
    // establish variables for reading the file
    FileInputStream is = new FileInputStream("rand500.txt");
    Scanner scnr = new Scanner(is);
    int count = 0; // keeps track of which element in array to fill
    
    // fill up the array with inputs from the file
    for(int i = 0; i < 500; i++) 
    {
      unsorted[count] = scnr.nextInt(); 
      // System.out.println(count + " " + holdArray[count]);
      count++; // increment index of the array
    }
    return unsorted;
  }

  public static void displayItems(int[] inputArr)
  {
    for(int i = 0; i < inputArr.length; i++)
    {
      System.out.print(inputArr[i] + "\t");
      if(i % 10 == 0)
      {
        System.out.println();
      }
    }
  }
}
