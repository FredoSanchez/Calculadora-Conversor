package maker.tools;

import maker.tools.aritmeticas.FactoryAritmetica;
import maker.tools.conversores.FactoryConversor;

public class Operacion {

    public static Tool getFactory(String type) {
        switch (type) {
            case "aritmetica":
                return new FactoryAritmetica();
            case "conversor":
                return new FactoryConversor();
        }
        return null;
    }
}
