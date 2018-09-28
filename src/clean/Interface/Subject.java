package clean.Interface;

public interface Subject{

        boolean getState();

        void setState(boolean state);

        void attach(Observer observer);
        void detach(Observer observer);

        void notifyAllObservers();
}
