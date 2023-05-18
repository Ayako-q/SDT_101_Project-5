package Part_6_Merge_Sort;

import Part_2_Selection_Sort.Selection;

public class Merge
{
    public static void sort(Comparable[] a)
    {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        if (hi <= lo)
        {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    // helper method that performs the merging step in the algorithm
    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    {
        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)
            {
                a[k] = aux[j++];
            }
            else if (j > hi)
            {
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i]))
            {
                a[k] = aux[j++];
            }
            else
            {
                a[k] = aux[i++];
            }
        }
    }

    // helper
    private static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}

    // Organizer
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