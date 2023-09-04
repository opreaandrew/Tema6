package ro.fasttrackit.Exercises1And2;

public class Main {
    public static void main(String[] args) {
        Person andrei = new Person("Andrei", 33, true);
        Person geanina = new Person("Geanina", 32, true);
        Person iris = new Person("Iris", 4, false);

        //Treaba de mai jos ar fi mai eleganta cu un toString, dar nu era in cerinta :)
        System.out.println("Name: " + andrei.getName() +
                ", age: " + andrei.getAge() +
                ", married: " + andrei.isMarried());
        System.out.println("Name: " + geanina.getName() +
                ", age: " + geanina.getAge() +
                ", married: " + geanina.isMarried());
        System.out.println("Name: " + iris.getName() +
                ", age: " + iris.getAge() +
                ", married: " + iris.isMarried());

    }
}