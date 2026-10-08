package CollectionFramework.Sets;

// EnumSet in Java

import java.util.EnumSet;
import java.util.Iterator;

enum Day{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday
}

public class Lecture5 {
    public static void main(String[] args) {

        Day day  = Day.Sunday;
        System.out.println(day);

        // allOf(Class<E> elementType)
        EnumSet<Day> days = EnumSet.allOf(Day.class);
        // Give me an EMPTY set of this enum type.
        System.out.println(days);

        // clone()

        EnumSet<Day> days1 = days.clone();

        System.out.println("After clone : " + days1);

        // noneOf(Class<E> elementType)

        EnumSet<Day> days2 = EnumSet.noneOf(Day.class);
        System.out.println(days2);
        days2.add(Day.Monday);
        System.out.println(days2);

        //  Accessing Elements:

        days.iterator().forEachRemaining(days::add);
       // days.iterator().forEachRemaining(System.out::println);

        System.out.println(days);
        System.out.println("---");

        days.remove(Day.Monday);

        Iterator<Day> itr = days.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Range : " + days.range(Day.Sunday, Day.Thursday));

        // EnumSet complementOf() Method in Java

        EnumSet<Day> days3 = EnumSet.of(Day.Monday, Day.Tuesday, Day.Wednesday);
        System.out.println("First : " + days3);

        EnumSet<Day> days4 = EnumSet.complementOf(days3);
        System.out.println("Second : " + days4);

    }
}


/*

days.iterator().forEachRemaining(days::add);
System.out.println(days);

Dry run:

step1: days.iterator()

Creates an Iterator that goes through the elements of days.

step2: .forEachRemaining()

Process every element that the iterator has not visited yet.

step3: days::add

This is a method reference

day -> days.add(day)
--------------------------
EnumSet.copyOf(): Creates a new EnumSet containing the same elements.

EnumSet<Day> set1 =
        EnumSet.of(Day.MONDAY, Day.FRIDAY);

EnumSet<Day> set2 =
        EnumSet.copyOf(set1);

Here:

Creates a new EnumSet object ✅
Copies the elements from set1
Does not create a new Day enum ❌
------------------------------
EnumSet<Day> set1 = EnumSet.of(Day.MONDAY, Day.FRIDAY);
EnumSet<Day> set2 = set1.clone();

here:
Also creates a new EnumSet object ✅
Copies the elements from set1
Does not create a new Day enum ❌

 */