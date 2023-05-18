package Part_8_Quicksort;

import Part_2_Selection_Sort.Selection;

public class Quicksort
{
    public static int count = 0;

    public static void sort(Comparable[] a)
    {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo)
        {
            outPrintArr(a);
            return;
        }
        int partitionIndex = partition(a, lo, hi);
        sort(a, lo, partitionIndex - 1);
        sort(a, partitionIndex + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i = lo;
        int j = hi + 1;
        Comparable pivot = a[lo];

        while (true)
        {
            while (less(a[++i], pivot))
            {
                if (i == hi) {
                    break;
                }
            }
            while (less(pivot, a[--j]))
            {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void outPrintArr(Comparable[] a)
    {
        System.out.println("\nStep " + count + ": ");
        for (Comparable b : a)
        {
            System.out.print(b + " ");
        }
        count++;
    }

    public static void output(Integer[] a)
    {
        System.out.println("\u001B[35m\n\nBefore sorting:\u001B[0m");
        outPrintArr(a);
        sort(a);

        System.out.println("\u001B[32m\n\nAfter sorting:\u001B[0m");
        outPrintArr(a);
    }
}
