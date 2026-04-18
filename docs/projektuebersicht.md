# Projektübersicht

## Verzeichnisstruktur

Die Quelltexte liegen unter:

`src/ch/allianz/lehrlingsausbildung/ringpuffer`

Dort gibt es:

- `Application.java` als Driver-Klasse
- `puffer/Ringpuffer.java` mit der eigentlichen Datenstruktur

## Aufgabe der Klassen

`Application` startet das Programm, fügt Testwerte in den Ringpuffer ein und gibt danach den Inhalt auf der Konsole aus.

`Ringpuffer` verwaltet ein internes Array mit 6 Speicherplätzen. Zusätzlich werden ein Leseindex, ein Schreibindex und die aktuelle Anzahl gespeicherter Elemente gehalten.

## Grafik

![Projektstruktur](./images/projektstruktur.svg)

## Klassenübersicht

Die folgende Grafik zeigt die beiden zentralen Klassen und ihre Beziehung:

![Klassenübersicht](./images/klassenuebersicht.svg)
