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
public class Decimal implements Conversor{
    @Override
    public String convertir(float a) {
        int cifra, resultado=0, exp=0;
        int n = (int) (a);
        do{
            cifra=n%10;
            resultado = resultado + (cifra*(int)Math.pow(2, exp));
            exp++;
            n=n/10;
        }while(n>0);
        
        String cad =String.valueOf(resultado);
        
        return cad;
    }
}
