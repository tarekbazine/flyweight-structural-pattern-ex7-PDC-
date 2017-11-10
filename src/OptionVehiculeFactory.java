import java.util.HashMap;
import java.util.Map;

/**
 * Le flyweight factory
 */
public class OptionVehiculeFactory {
    private Map<String,ConcreteOptionVehicule> options;

    public OptionVehiculeFactory() {
        this.options = new HashMap<>();
    }

    public ConcreteOptionVehicule getOptionVehicule(String nomOption){
        ConcreteOptionVehicule option;

        if( options.containsKey(nomOption) )
            option = options.get(nomOption);
        else {
            option = new ConcreteOptionVehicule(nomOption);
            options.put(nomOption,option);
        }

        return option;
    }
}
