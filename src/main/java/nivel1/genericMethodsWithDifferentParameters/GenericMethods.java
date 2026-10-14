package nivel1.genericMethodsWithDifferentParameters;

public class GenericMethods {

    public <T> void printAll(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
