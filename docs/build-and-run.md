# Bauen und Starten

## Kompilieren

Im Projektordner kann das Programm mit folgendem Befehl kompiliert werden:

```bash
mkdir -p out
javac -d out src/ch/allianz/lehrlingsausbildung/ringpuffer/Application.java src/ch/allianz/lehrlingsausbildung/ringpuffer/puffer/Ringpuffer.java
```

## Starten

Nach dem Kompilieren kann die Anwendung so gestartet werden:

```bash
java -cp out ch.allianz.lehrlingsausbildung.ringpuffer.Application
```

## Erwartete Ausgabe

```text
Inhalt des Ringpuffers:
3
4
5
6
7
8
```

## Hinweis

Die Klassen werden im Verzeichnis `out/` erzeugt. So bleiben die Java-Quelltexte in `src/` von den kompilierten Klassen getrennt.

Die Ausgabe zeigt die letzten sechs eingefügten Werte, weil der Ringpuffer nur eine feste Kapazität von `6` Einträgen besitzt.
