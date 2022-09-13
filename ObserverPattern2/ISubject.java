package ObserverPattern2;

public interface ISubject {

    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
    public void setChanged();

}
