/**
* Class: CSE 11 Introduction to Computer Science: Object Oriented Programming (Java)
* Instructor: Dr. Robert August
* Description: The following class consists of three sort methods:
* bubble sort, selection sort, and insertion sort. 
* Each method takes in an unsorted array and returns a sorted array.
* The class requires a separate testing application called ThreeSortsTest.
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