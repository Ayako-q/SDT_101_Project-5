package Part_1_Person;

/*
Project 5 - Sort
Part 1 - Implement the java.lang.Comparable<T> interface
Oleksii Ishchenko for SDT 101
*/


public class Main
{
    public static void main (String[] args)
    {
        // Creating objects of a Person class
        Person person1 = new Person(1992);
        Person person2 = new Person(1994);
        Person person3 = new Person(2004);

        // Using my personAnalyz in order to demonstrate comparison with compareTo() method
        System.out.println("\nComparing person 1 (1992) and 2 (1994)");
        personAnalyz(person1, person2);
        System.out.println("\nComparing person 1 (1992) and 3 (2004)");
        personAnalyz(person1, person3);
        System.out.println("\nComparing person 3 (2004) and 2 (1994)");
        personAnalyz(person3, person2);
    }

    // Function that receives two Person calss objects and after comparing them using .compareTo()
    // prints a corresponding message
    public static void personAnalyz(Person person1, Person person2)
    {
        if (person1.compareTo(person2) == 0)
        {
            System.out.println("They are identical");
        }
        else if (person1.compareTo(person2) == 1)
        {
            System.out.println("Second one is younger than the first one");
        }
        else if (person1.compareTo(person2) == -1)
        {
            System.out.println("First one is younger than the second");
        }
    }
}
