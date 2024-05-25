package ExempleModificatoriAcces.pachetPrivate;

import ExempleModificatoriAcces.pachetPublic.TestPublic;

public class Main {
    public static void main(String[] args) {
        TestPrivate testPrivate = new TestPrivate();
        TestPublic testPublic = new TestPublic();
        testPublic.name = "Marcel";
    }
}
