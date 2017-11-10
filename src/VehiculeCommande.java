import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Le Client du flyweight
 **/
public class VehiculeCommande {

    private String nom;
    private Map<String,Float> prixOptions;
    private List<ConcreteOptionVehicule> options;

    public VehiculeCommande(String nomVehicule) {

        this.nom=nomVehicule;

        options = new ArrayList<>();

        // list des prix d'options par rapport a cette vehicule
        Map<String,Float> prixOptions= new HashMap<>();
        prixOptions.put("autre option 1",(float)1223000);
        prixOptions.put("air bag",(float)12000);//1
        prixOptions.put("vitre électrique",(float)10000);//2
        prixOptions.put("autre option 9",(float)2025000);
        prixOptions.put("direction assistée",(float)20000);//3
        prixOptions.put("autre option 22",(float)20090022);
        this.prixOptions = prixOptions;
    }

    public void addOption(ConcreteOptionVehicule opt){
        options.add(opt);
    }

    public Float getPrixVente(String nomOpt){
        if (prixOptions.containsKey(nomOpt) ){
            return prixOptions.get(nomOpt);
        }
        return (float) 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<ConcreteOptionVehicule> getOptions() {
        return options;
    }

    public void setOptions(List<ConcreteOptionVehicule> options) {
        this.options = options;
    }
}
