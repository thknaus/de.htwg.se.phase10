package de.htwg.se.phase10.util.observer;

public interface IObservable {
    void addObserver(IObserver s);

    void removeObserver(IObserver s);

    void removeAllObservers();

    void notifyObservers();

    void notifyObservers(Event e);
}
