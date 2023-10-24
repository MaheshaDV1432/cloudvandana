//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 
import java.util.*;
public class ArrayShuffle {
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(a);

        // Print the shuffled array
        for (int element : a) 
        {
            System.out.print(element + " ");
        }
    }

   
    public static void shuffleArray(int[] a) 
    {
        Random rand = new Random();
        for (int i = a.length - 1; i > 0; i--) 
        {
            int j = rand.nextInt(i + 1);
            // Swaping a[i] and a[j]
            
            a[i]=a[j]-a[i]+(a[j]=a[i]);
            
        }
    }
}
