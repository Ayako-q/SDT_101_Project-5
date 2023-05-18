package Part_1_Person;

public class Person implements Comparable<Person>
{
    private int birthYear;

    // Person builder
    public Person(int birthYear)
    {
        this.birthYear = birthYear;
    }
    // getter
    public int getBirthYear()
    {
        return birthYear;
    }

    @Override
    public int compareTo(Person otherPerson)
    {
        return Integer.compare(this.birthYear, otherPerson.birthYear);
    }
}
