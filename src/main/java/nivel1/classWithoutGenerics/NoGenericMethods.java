package nivel1.classWithoutGenerics;

public class NoGenericMethods {

    private String phrase1;
    private String phrase2;
    private String phrase3;

    public NoGenericMethods(String element1, String element2, String phrase3) {
        this.phrase1 = element1;
        this.phrase2 = element2;
        this.phrase3 = phrase3;
    }

    public String getPhrase1() {
        return phrase1;
    }

    public String getPhrase2() {
        return phrase2;
    }

    public String getPhrase3() {
        return phrase3;
    }
}

