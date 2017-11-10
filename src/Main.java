/**
 * BAZINE Tarek - CHIKHAISSA Mahfoud
 * EXO 7 PDC -STRUCTURAL PATTERNS-
 **/

public class Main {

    public static void main(String[] args) {


//        crée une  commande de véhicule
        VehiculeCommande vehiculeCommande = new VehiculeCommande("BOGATI");
        System.out.println("crée une commande de véhicule");

//        creation des options Avec l'Abstract Factory
        OptionVehiculeFactory optionVehiculeFactory=new OptionVehiculeFactory();
        ConcreteOptionVehicule airBag = optionVehiculeFactory.getOptionVehicule("air bag");
        ConcreteOptionVehicule vitreElectrique = optionVehiculeFactory.getOptionVehicule("vitre électrique");
        ConcreteOptionVehicule directionAssistee = optionVehiculeFactory.getOptionVehicule("direction assistée");
        System.out.println("creation des options Avec l'Abstract Factory");

//        Affecter l'etat extrinsèque (le prix vente de le option), determiner par rapport a le véhicule
        airBag.setPrixVente(vehiculeCommande.getPrixVente(airBag.getNom()));
        vitreElectrique.setPrixVente(vehiculeCommande.getPrixVente(vitreElectrique.getNom()));
        directionAssistee.setPrixVente(vehiculeCommande.getPrixVente(directionAssistee.getNom()));
        System.out.println("Affecter l'etat extrinsèque (le prix vente de le option) pour chaque option");

//        Ajouter les option a le véhicule
        vehiculeCommande.addOption(airBag);
        vehiculeCommande.addOption(vitreElectrique);
        vehiculeCommande.addOption(directionAssistee);
        System.out.println("Ajouter les option a le véhicule");

//        affichage
        System.out.println("\nLe véhicule "+vehiculeCommande.getNom());
        System.out.println("\n------------|-----------------\n" +
                "Le option   |  Prix de Vente" +
                        "\n------------|-----------------");
        for (ConcreteOptionVehicule opt:
                vehiculeCommande.getOptions()) {
            System.out.println(opt.getNom()+ " | "+ opt.getPrixVente() + "DA");
        }


    }
}
