/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maker.tools.conversores;

/**
 *
 * @author fredy
 */
public class Octal implements Conversor {

    @Override
    public String convertir(float a) {
        String cad = "";
        while (true) {
            int num = (int) (a / 8);
            int Oct = (int) (a % 8);
            cad = String.valueOf(Oct) + cad;
            if (num == 0) {
                break;
            }
            a = num;
        }
        return cad;
    }
}
