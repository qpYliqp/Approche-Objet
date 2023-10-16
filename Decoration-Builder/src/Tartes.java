import java.util.concurrent.ExecutionException;

public class Tartes implements Gateaux{
    public boolean base = false;
    @Override
    public String getDescription() {

        if(!this.base)
        {
            throw new IllegalArgumentException("Les tartes doit être soit à la pomme, soit à l'abricot");
        }
        return "Plat : Tarte";

    }


}
