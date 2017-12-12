package shop;
import shop.users.Observer;

import java.util.ArrayList;


public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();


    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: this.observers){
            observer.update();
        }
    }
}

