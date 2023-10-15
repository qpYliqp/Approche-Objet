import java.util.concurrent.ExecutionException;

public class Tartes extends Gateaux{

    public Tartes() throws Exception
    {
        this.description = "Patisserie : Tarte";
        if(getDescription().contains("chocolat"))
        {
            throw new IllegalArgumentException("Chocolat");
        }
        else
        {
            System.out.println("Je ne vois pas le chocolat");
        }
    }
}
