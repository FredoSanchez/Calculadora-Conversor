package maker.tools;

import maker.tools.aritmeticas.Aritmetica;
import maker.tools.conversores.Conversor;

public interface Tool {
    Aritmetica getOperacion(String type);
    Conversor getConversion(String type);
}
