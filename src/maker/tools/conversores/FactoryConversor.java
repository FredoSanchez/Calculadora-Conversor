/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maker.tools.conversores;

import maker.tools.Tool;
import maker.tools.aritmeticas.Aritmetica;

/**
 *
 * @author fredy
 */
public class FactoryConversor implements Tool {

    @Override
    public Aritmetica getOperacion(String type) {
        return null;
    }

    @Override
    public Conversor getConversion(String type) {
        switch (type) {
            case "binario":
                return new Binario();
            case "decimal":
                return new Decimal();
            case "octal":
                return new Octal();
            case "hexadecimal":
                return new Hexadecimal();
        }
        return null;
    }

}
