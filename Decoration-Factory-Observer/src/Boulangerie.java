import java.lang.reflect.Array;
import java.util.ArrayList;

public class Boulangerie {


    public static void main(String[] args) {
        Patissier patissier = new Patissier();
        Vendeur vendeur = new Vendeur(8);
        patissier.addObserver(vendeur);


        //vendeur.Conversation_Client(patissier);

        for (int i = 0; i < 10; i++) {
        patissier.CreationGateaux(new ChouxChocolatNoisette());
           //System.out.println(test.getDescription());
        }

    }



}
