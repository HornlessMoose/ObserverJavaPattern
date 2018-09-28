package clean;

import clean.Interface.Observer;
import clean.Interface.Subject;

import java.util.ArrayList;

public class Product implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private boolean state;
    private String productName;

    public Product(String productName){
        this.productName = productName;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public String getProductName() {
        return productName;
    }


    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
