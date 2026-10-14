package nivel1.classWithoutGenerics;

public class NoGenericMethods {

    private String element1;
    private String element2;
    private String element3;

    public NoGenericMethods(String phrase1, String phrase2, String phrase3) {
        this.element1 = phrase1;
        this.element2 = phrase2;
        this.element3 = phrase3;
    }

    public String getElement1() {
        return element1;
    }

    public String getElement2() {
        return element2;
    }

    public String getElement3() {
        return element3;
    }
}

