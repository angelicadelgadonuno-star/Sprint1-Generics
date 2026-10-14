package nivel1.genericMethodsWithDifferentParameters;

public class GenericMethods {

    public <String, U, V> void printElements(String element1, U element2, V element3) {
        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);
    }

}
