import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      /*  1.Write a Java program to test if the first and the last element of an array of integers are same.
       The length of the array must be greater than or equal to 2
        Test Data:
        array = 50, -20, 0, 30, 40, 60, 10
        Sample Output: false */

        /*
        ArrayList<Integer> array = new ArrayList <>();
        array.add(50);
        array.add(-20);
        array.add(0);
        array.add(30);
        array.add(40);
        array.add(60);
        array.add(10);
        System.out.println(array);

        // boolean result = array.getFirst().equals(array.get(array.size()-1));
        boolean result = array.getFirst().equals(array.getLast());

        if(result){
            System.out.println(result);
          //  System.out.println("The first and last are the same   "+result);

        } else{
            System.out.println(result);
            //System.out.println("The first and last elements are not the same    "+ result);
        }
*/




      /*  2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        Original Array:
        [1, 4, 17, 7, 25, 3, 100]
        Expected Output:
        The average of the said array is: 22.0 The numbers in the said array that are
        greater than the average are: 25 100 */

/*
        int[] originalarray = {1,4,17,7,25,3,100};

        double sum = 0;
        double average = 0;

        // Find the average of the array
        for(int num : originalarray){

            sum += num;
        }
        average = sum / originalarray.length;
        System.out.println("The average of the array is: "+average);

        System.out.print("The numbers greater than the average are:");
        for (int i = 0; i < originalarray.length; i++) {
            if(originalarray[i]>average){
                System.out.print(originalarray[i] +" ");

            }
        }  */


        //Note:
    // I also can use the for-each:
        /*  for(int num : originalarray){
            if (num > average){
                System.out.print(num+ " ");
            }
        } */




 /* 3.Write a Java program to get the larger value between first and last element of an array of integers.
        Original Array:
        [20, 30, 40]
        Sample Output:
        Larger value between first and last element: 40 */

 /*
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(20);
        array1.add(30);
        array1.add(40);

        if (array1.getFirst() > array1.getLast()) {
         System.out.println("Larger value between first and last element: "+array1.getFirst());
            } else{
                System.out.println("Larger value between first and last element: "+array1.getLast());
            } */





       /* 4.Write a Java program to swap the first and last elements of an array and create a new array.
        Original Array:
        [20, 30, 40]
        Sample Output:
        New array after swapping the first and last elements: [40, 30, 20] */

        /*
        // Original Array
        int[] originalarray = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(originalarray));

        int first = originalarray[0];
        int last = originalarray.length - 1;

        // Swap the first and last elements of the array
        originalarray[0] = originalarray[last];
        originalarray[last] = first;

        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(originalarray));
*/





       /* 5. Write a program that places the odd elements of an array before the even elements.
        Original Array:
        [2,3,40,1,5,9,4,10,7]
        Sample Output: [3,1,5,9,7,2,40,4,10] */
/*
        //Original Array:
       int[] originalarray = {2,3,40,1,5,9,4,10,7};
       System.out.println(Arrays.toString(originalarray));


      ArrayList <Integer> result = new ArrayList<>();

      for(int num : originalarray){
          if(num % 2 ==1){
              result.add(num);
          }
        }

        for(int num : originalarray){
            if(num % 2 ==0){
                result.add(num);
            }
        }

        // Array after replacing the odd before the even elements
        System.out.println(result);
*/



 /* 6. Write a program that test the equality of two arrays.
       [2,3,6,6,4] [2,3,6,6,4]
        Sample Output: true */

  /*  int [] array1= {2,3,6,6,4};
      int [] array2= {2,3,6,6,4};

      boolean arraysequal = true;

// check the length of the array
      if(array1.length != array2.length){
          arraysequal = false;
      } else {
    //compare each element
          int i=0;
      for(int num : array1){
          if(num != array2[i++]){
              arraysequal = false;
              break;
          }
      }}
        System.out.println(arraysequal); */






    }
}