import java.util.*;
import java.util.concurrent.TimeUnit;
public class Quicksort
{
    public static int partition(int[] arr, int lo, int hi)
    {
       // Partitions arr[lo]...arr[hi] around a pivot.
       // The pivot could be the first element in this section of the array
       // or perhaps a random element in the array.
       // Returns the final resting index of the pivot element
       // (needed for the quicksort recursion)
       int[] Arr = new int[hi-lo+1];
       for (int a=lo; a<=hi; a++)
       {
           Arr[a-lo] = arr[a];
       }
       
       int pivot = Arr[0];
       int count = 0;
       for (int i=1; i<Arr.length; i++)
       {
           if (Arr[i]<=pivot)
           {
               count++;
           }
       }
       
       int[] arrLo = new int[count];
       int[] arrHi = new int[Arr.length-count-1];
       int LoIndex=0;
       int HiIndex=0;
       
       for (int j=1; j<Arr.length; j++)
       {
           if (Arr[j]<=pivot)
           {
               arrLo[LoIndex] = Arr[j];
               LoIndex++;
           }
           else
           {
               arrHi[HiIndex] = Arr[j];
               HiIndex++;
           }
       }
       
       for (int x=0; x<arrLo.length; x++)
       {
           Arr[x] = arrLo[x];
       }
       Arr[count] = pivot;
       for (int y=0; y<arrHi.length; y++)
       {
           Arr[count+1+y] = arrHi[y]; 
       }
       
       for (int z=lo; z<=hi; z++)
       {
           arr[z] = Arr[z-lo];
       }
       
       return (count+lo);
    }
    
    public static void quickSort(int[] arr, int lo, int hi)
    {
        if (lo < hi ) // base case is when lo >= hi (nothing to sort)
        {
            // 1. partion the array around the pivot, p
            int p = partition(arr,lo,hi);
            // 2. sort the elements to the left of the pivot
            quickSort(arr,lo,p-1);
            // 3. sort the elements to the right of the pivot
            quickSort(arr,p+1,hi);    
        }
    }
    
    // this method allows for a more client friendly way of 
    // invoking a sort
    public static void sort(int[] arr) 
    {
        quickSort(arr,0,arr.length-1);
    }
    
    private static void print(int[] arr)
    {
        System.out.print("[");
        for (int i =0; i < arr.length-1; i++)
            System.out.print(arr[i] + ",");
        System.out.println(arr[arr.length-1] + "]");
    }   
        
    
    //tester code  
    public static void main (String[] args)
    {    
        //int[] numbers = {3,1,4,5,9,2};
        
        
        int[] numbers = {5,1,9,2,8,3,7,4,6};
        int[] grades = {92,85,76,76,45,95,100,100,64,47,99};
        
        sort(numbers);
        sort(grades);
        print(numbers);
        print(grades);
        
                       
    }
}