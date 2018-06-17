package maker.tools.aritmeticas;

import maker.tools.Tool;
import maker.tools.conversores.Conversor;

public class FactoryAritmetica implements Tool {

    @Override
    public Aritmetica getOperacion(String type) {
        switch (type) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Suma();
            case "division":
                return new Suma();
        }
        return null;
    }
    @Override
    public Conversor getConversion(String type){
        return null;
    }
}
