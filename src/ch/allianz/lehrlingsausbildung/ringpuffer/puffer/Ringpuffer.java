package ch.allianz.lehrlingsausbildung.ringpuffer.puffer;

public class Ringpuffer {
    private static final int KAPAZITAET = 6;

    private final int[] daten = new int[KAPAZITAET];
    private int leseIndex = 0;
    private int schreibIndex = 0;
    private int anzahlElemente = 0;

    public void einfuegen(int wert) {
        daten[schreibIndex] = wert;
        schreibIndex = (schreibIndex + 1) % KAPAZITAET;

        if (anzahlElemente < KAPAZITAET) {
            anzahlElemente++;
            return;
        }

        leseIndex = (leseIndex + 1) % KAPAZITAET;
    }

    public int entnehmen() {
        if (istLeer()) {
            throw new IllegalStateException("Der Ringpuffer ist leer.");
        }

        int wert = daten[leseIndex];
        leseIndex = (leseIndex + 1) % KAPAZITAET;
        anzahlElemente--;
        return wert;
    }

    public boolean istLeer() {
        return anzahlElemente == 0;
    }

    public boolean istVoll() {
        return anzahlElemente == KAPAZITAET;
    }

    public int groesse() {
        return anzahlElemente;
    }
}
