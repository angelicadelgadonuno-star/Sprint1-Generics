package nivel1.classWithoutGenerics;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Elements Natural Order ---");
        NoGenericMethods elements = new NoGenericMethods("element1", "element2", "element3");
        System.out.println(elements.getElement1());
        System.out.println(elements.getElement2());
        System.out.println(elements.getElement3());

        System.out.println("--- Elements In Any Order ---");
        NoGenericMethods elementsTwo = new NoGenericMethods("element3", "element1", "element2");
        System.out.println(elementsTwo.getElement1());
        System.out.println(elementsTwo.getElement2());
        System.out.println(elementsTwo.getElement3());
    }
}
