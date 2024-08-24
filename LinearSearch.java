/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;
import java.util.*;
/**
 *
 * @author premk
 */
public class LinearSearch {
    
    public int linearSearch(int[] array,int target){
        for(var i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
          }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numbers = {7,1,3,6,5};
        System.out.println(Arrays.toString(numbers));
        var is = new LinearSearch();
        int index = is.linearSearch(numbers,7);
        System.out.println("found at index = "+index);
        // TODO code application logic here
    }
    
}
