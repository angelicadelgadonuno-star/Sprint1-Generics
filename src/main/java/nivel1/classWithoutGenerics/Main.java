package nivel1.classWithoutGenerics;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Primer Objeto ---");
        NoGenericMethods elements = new NoGenericMethods("element1", "element2", "element3");
        System.out.println(elements.getPhrase1());
        System.out.println(elements.getPhrase2());
        System.out.println(elements.getPhrase3() + "\n");

        System.out.println("--- Segundo Objeto ---");
        NoGenericMethods elementsTwo = new NoGenericMethods("element3", "element1", "element2");
        System.out.println(elementsTwo.getPhrase1());
        System.out.println(elementsTwo.getPhrase2());
        System.out.println(elementsTwo.getPhrase3());
    }
}
