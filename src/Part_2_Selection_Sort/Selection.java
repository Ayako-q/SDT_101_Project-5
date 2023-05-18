package Part_2_Selection_Sort;

import java.lang.Comparable;

/* Part 2
Implementing selection sort
*/

public class Selection
{
    public static void sort(Comparable[] a)
    {
        int count = 0; // counter of steps
        for (int i = 0; i < a.length; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++)
            {
                // Code
                if (less(a[j], a[minIndex]))
                {
                    minIndex = j;
                    // Tets case
                    System.out.println("\n\u001B[35mNext step:\u001B[0m");
                    for (int k = 0; k < a.length; k++)
                    {
                        if (k == minIndex || k == i)
                        {
                            System.out.print("\u001B[33m" + a[k] + " " + "\u001B[0m");
                        }
                        else
                        {
                            System.out.print(a[k] + " ");
                        }
                    }
                    System.out.println("");
                }
            }
            exch(a, i, minIndex);
        }
    }
    // Implementing less and exch
    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
