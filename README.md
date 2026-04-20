# Ringpuffer

Dieses Projekt zeigt eine einfache Ringpuffer-Implementierung in Standard-Java.
Als Puffer wird ein Array einer festen Grösse verwendet
## Inhalt

- `src/`: Java-Quellcode
- `docs/`: Projektdokumentation und Grafiken
- `out/`: kompilierte Klassen nach dem Build

## Bauen und Starten

Die genaue Anleitung steht in [docs/build-and-run.md](./docs/build-and-run.md).

Kurzfassung:

```bash
mkdir -p out
javac -d out src/ch/allianz/lehrlingsausbildung/ringpuffer/Application.java src/ch/allianz/lehrlingsausbildung/ringpuffer/puffer/Ringpuffer.java
java -cp out ch.allianz.lehrlingsausbildung.ringpuffer.Application
```

## Dokumentation

Die Uebersicht der Dokumentation steht in [docs/README.md](./docs/README.md).
