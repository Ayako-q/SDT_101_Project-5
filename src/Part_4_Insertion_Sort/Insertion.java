package Part_4_Insertion_Sort;

import Part_2_Selection_Sort.Selection;

public class Insertion
{
    public static void sort(Comparable[] a)
    {
        int n = a.length;
        for (int i = 1; i < n; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
            {
                exch(a, j, j - 1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void output(Integer[] a)
    {
        System.out.println("Before sorting:");
        for (Integer num : a) {
            System.out.print(num + " ");
        }

        sort(a);

        System.out.println("\u001B[32m\nAfter sorting:\u001B[0m");
        for (Integer num : a) {
            System.out.print(num + " ");
        }
    }
}
