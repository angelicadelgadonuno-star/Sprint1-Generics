package nivel1.classWithoutGenerics;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Primer Objeto ---");
        NoGenericMethods elements = new NoGenericMethods("element1", "element2", "element3");
        System.out.println(elements.getElement1());
        System.out.println(elements.getElement2());
        System.out.println(elements.getElement3() + "\n");

        System.out.println("--- Segundo Objeto ---");
        NoGenericMethods elementsTwo = new NoGenericMethods("element3", "element1", "element2");
        System.out.println(elementsTwo.getElement1());
        System.out.println(elementsTwo.getElement2());
        System.out.println(elementsTwo.getElement3());
    }
}
