package nivel1.genericMethodsWithDifferentParameters;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Miguel", "Hernandez", 30);
        Person person2 = new Person("Juan", "Suarez", 40);
        Person person3 = new Person("Dalia", "Salazar", 45);

        GenericMethods gm = new GenericMethods();

        gm.printAll(person1, person2,person3);
        System.out.println();
        gm.printAll( person3,person1, person2);
    }
}
