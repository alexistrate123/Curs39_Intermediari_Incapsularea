package ExempleModificatoriAcces.pachetDefault;

import ExempleModificatoriAcces.pachetPublic.TestPublic;

public class Main {
    public static void main(String[] args) {
        TestPublic testPublic = new TestPublic();
        testPublic.name = "Marcus";
        TestDefault testDefault = new TestDefault();
        testDefault.text = "Am 23 de ani.";
    }


}
