package Part_2_Selection_Sort;

import java.util.Random;

// Part 2

public class Main
{
    public static void main(String[] args)
    {
        Selection selection = new Selection();
        Integer[] array = randArr();

        output(array, selection);
    }

    // More organized output
    public static void output(Integer[] a, Selection s)
    {
        System.out.println("Before sorting:");
        for (Integer num : a) {
            System.out.print(num + " ");
        }

        s.sort(a);

        System.out.println("\u001B[32m\nAfter sorting:\u001B[0m");
        for (Integer num : a) {
            System.out.print(num + " ");
        }
    }

    // Random array creation
    public static Integer[] randArr()
    {
        // Array of 10
        Integer[] array = new Integer[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(100); // Generates random integers between 0 and 99
        }
        return array;
    }
}
