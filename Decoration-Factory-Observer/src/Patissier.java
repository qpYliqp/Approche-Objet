import java.util.ArrayList;

public class Patissier {


    private int stock;
    private ArrayList<Observateur> observateurs = new ArrayList<>();


    public Patissier()
    {
        stock = 10;
    }

    public void CreationGateaux(GateauxFactory factory)
    {
        if(stock > 0)
        {
            stock --;

        }
        notifyObservers(factory);

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addObserver(Observateur observer) {
        observateurs.add(observer);
    }

    public void removeObserver(Observateur observer) {
        observateurs.remove(observer);
    }

    private void notifyObservers(GateauxFactory factory) {
        for (Observateur observer : observateurs) {
            observer.update(stock, factory, this);
        }
    }



}
