import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(boolean isPresent);
}

class Teacher {
    private String name;
    private List<Observer> observers = new ArrayList<>();
    private boolean isPresent;

    public Teacher(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(isPresent);
        }
    }

    public String getName() {
        return name;
    }
}
