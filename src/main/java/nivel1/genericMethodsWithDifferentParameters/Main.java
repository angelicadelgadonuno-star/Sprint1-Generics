package nivel1.genericMethodsWithDifferentParameters;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Miguel", "Hernandez", 30);

        GenericMethods gm = new GenericMethods();

        gm.printElements("Hey", person, 44);
        gm.printElements("See you later alligator ", 39, person);
    }
}
