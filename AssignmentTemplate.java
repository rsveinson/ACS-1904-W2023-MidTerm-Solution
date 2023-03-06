import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Arrays;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class AssignmentTemplate{
    public static void main(String[] args)throws FileNotFoundException {
        final int MAX = 15;
        int[] list = new int[MAX];
        int n = 0;
        int numberIn;
        Random rnd = new Random();
        
        numberIn = rnd.nextInt(21);
        
        while(numberIn != 0 && n < MAX){
            list[n] = numberIn;
            n++;
            numberIn = rnd.nextInt(21);
        }
        
        printList(list, n);
        shift(list, n);
        printList(list, n);
        
        System.out.println();
        Arrays.sort(list);
        list[1] = 22;
        printList(list, n);
        
        System.out.println();
        System.out.println("Sorted or not");
        System.out.println();
        System.out.println(isSorted(list, n));
        

        
        System.out.println("end of program");
    }
    
    public static boolean isSorted(int[] list, int n){
        boolean sorted = true;
        
        for(int i = 0; i < n -1 ; i++){
            if(list[i] > list[i + 1]){
                sorted = false;
            }
        }
        
        return sorted;
    }
    
    public static void shift(int[] l, int n){
        int temp = l[n - 1];
        
        System.out.println("\n" + temp + "\n");
        
        for(int i = n - 1; i > 0 ; i--){
            l[i] = l[i - 1];
        }
        
        l[0] = temp;
    }
    
    public static void printList(int[] l, int n){
        for(int i = 0; i < n; i++){
            System.out.println(l[i]);
        }
    }
}
