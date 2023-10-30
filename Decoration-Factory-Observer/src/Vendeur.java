import java.util.Scanner;

public class Vendeur implements Observateur {
    private int seuil;
    int dialogue = 0;


    public Vendeur(int seuil) {
        this.seuil = seuil;
    }

    @Override
    public void update(int stock, GateauxFactory factory, Patissier patissier) {
        if (stock >= seuil) {
            System.out.println("Le Vendeur fait une commande au patissier : ");
            Gateaux gateaux = factory.Creation();
            System.out.println("######");
            System.out.println(gateaux.getDescription());
            System.out.println("######");
        }
        else if(stock == 0)
        {

            dialogue = 2;
        }
        else
        {
            dialogue = 1;
        }
    }

    public void Conversation_Client(Patissier patissier)
    {
        boolean talk = true;
        int choix;

        while(talk){

            switch (dialogue) {

                case 0:{
                    System.out.println("\n****************************************************\n");
                    System.out.println("Bienvenue dans notre boulangerie ! Que voulez vous ? ");
                    System.out.println("1 : TarteAbricotMeringue");
                    System.out.println("2 : TartePommeAmande");
                    System.out.println("3 : ChouxChocolatNoisette");
                    System.out.println("4 : Rien (partir)");
                    System.out.println("\n****************************************************");
                    System.out.println("Entrez votre choix : ");
                    Scanner scanner = new Scanner(System.in);
                    choix = scanner.nextInt();
                        switch(choix)
                        {
                            case 1:{
                                patissier.CreationGateaux(new ChouxChocolatNoisette());
                                break;
                            }
                            case 2:{
                                patissier.CreationGateaux(new  TartePommeAmande());

                                break;
                            }
                            case 3:{
                                patissier.CreationGateaux(new TarteAbricotMeringue());
                                break;
                            }
                            case 4:{
                                System.out.println("Passez une bonne journée");
                                talk = false;
                                break;
                            }
                        }


                    break;

                }
                case 1: {
                    System.out.println("Le nombre de gateau en vente ("+ patissier.getStock() + ") est inférieur au seuil de vente que nous nous sommes fixés : " + this.seuil);
                    System.out.println("Cependant nous pouvons vous donner une Tarte à la pomme");
                    System.out.println("1 : Oui");
                    System.out.println("2 : Non (Partir)");
                    Scanner scanner = new Scanner(System.in);
                    choix = scanner.nextInt();

                    switch(choix)
                    {
                        default:break;
                        case 1: {
                            patissier.CreationGateaux(new TartePommeAmande());
                            break;
                        }
                        case 2 :
                        {
                            System.out.println("Passez une bonne journée :)");
                            talk = false;
                            break;
                        }
                    }
                    break;
                }
                case 2 :
                {
                    System.out.println("Nous n'avons plus rien, désolé.");
                    talk = false;
                }
                default: break;
            }
        }
    }
}