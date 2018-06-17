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
public class Binario implements Conversor {

    @Override
    public String convertir(float a) {
        String cad = "";
        while (true) {
            int num = (int) (a/2);
            int Bin = (int) (a % 2);
            cad = String.valueOf(Bin)+cad;
            if (num <= 0) {
               break; 
            }
            
             a=num;
        }
        return cad;
        
    }

}
