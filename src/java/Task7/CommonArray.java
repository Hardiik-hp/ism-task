package java.Task7;

import java.util.*;
class CommonArray {
	public static void main(String[] args) 
    {
      int[] arr1 = {3,25,7,4,41,2,4,8,32,5};
      int[] arr2 = {8,6,25,86,41,9,32,36,9,7};
 
       System.out.println("Array1 -: "+Arrays.toString(arr1));
       System.out.println("Array2 -: "+Arrays.toString(arr2));
 
      
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                {
                 
                 System.out.println("Common Element are : "+(arr1[i]));
                 }
            }
        }
 
    }
}
