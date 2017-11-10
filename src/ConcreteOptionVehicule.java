import java.util.*;

/**
 * Le concrete flyweight
 */
public class ConcreteOptionVehicule implements IOptionVehicule{
    private String nom;
    private String explication;
    private float prixStandard;
    private float prixVente = 0;
    private List<IOptionVehicule> incompOptions;
    private List<VehiculeCommande> incompVehicules;


    @Override
    public void setPrixVente(float prixVente) {
            this.prixVente = prixVente;
    }

    public ConcreteOptionVehicule(String nom) {
        this.nom = nom;
    }

    public ConcreteOptionVehicule(String nom, String explication, float prixStandard,
                                  List<IOptionVehicule> incompOptions,
                                  List<VehiculeCommande> incompVehicules) {
        this.nom = nom;
        this.explication = explication;
        this.prixStandard = prixStandard;
        this.incompOptions = incompOptions;
        this.incompVehicules = incompVehicules;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public float getPrixStandard() {
        return prixStandard;
    }

    public void setPrixStandard(float prixStandard) {
        this.prixStandard = prixStandard;
    }

    public List<IOptionVehicule> getIncompOptions() {
        return incompOptions;
    }

    public void setIncompOptions(List<IOptionVehicule> incompOptions) {
        this.incompOptions = incompOptions;
    }

    public List<VehiculeCommande> getIncompVehicules() {
        return incompVehicules;
    }

    public void setIncompVehicules(List<VehiculeCommande> incompVehicules) {
        this.incompVehicules = incompVehicules;
    }
}
