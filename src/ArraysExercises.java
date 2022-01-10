import java.util.Arrays;

public class ArraysExercises {


    //Create a static method named addPerson.
    // It should accept an array of Person objects, as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] people, Person person){

        Person[] newPeople = Arrays.copyOf(people, people.length + 1); // create new array that is copy of passed array + 1 length
        newPeople[newPeople.length - 1] = person; // add single person object to end of array

        return newPeople;

    }
    public static void main(String[] args) {

    //Create an array that holds 3 Person objects & assign a new instance of the Person class to each element.
    // Iterate through the array and print out the name of each person in the array.
        Person[] people = new Person[3];
        people[0] = new Person("Calais");
        people[1] = new Person("Jubilee");
        people[2] = new Person("Chanel");

//        for (Person person: people) {
//            System.out.println(person.getName());
//        }

        Person[] newPeople = addPerson(people, new Person("Nala"));
        for (Person person: newPeople) {
            System.out.println(person.getName());
        }

    }
}
