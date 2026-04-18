package ch.allianz.lehrlingsausbildung.ringpuffer;

import ch.allianz.lehrlingsausbildung.ringpuffer.puffer.Ringpuffer;

public class Application {
    public static void main(String[] args) {
        Ringpuffer ringpuffer = new Ringpuffer();

        for (int i = 1; i <= 8; i++) {
            ringpuffer.einfuegen(i);
        }

        System.out.println("Inhalt des Ringpuffers:");
        while (!ringpuffer.istLeer()) {
            System.out.println(ringpuffer.entnehmen());
        }
    }
}
