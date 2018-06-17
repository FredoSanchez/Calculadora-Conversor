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
public class Hexadecimal implements Conversor {

    @Override
    public String convertir(float a) {
        String cad = "";
        while (true) {
            String Hex2 = "";
            int num = (int) (a / 16);
            int Hex = (int) (a % 16);
            switch (Hex) {
                case 10:
                    Hex2 = "A";
                    cad = Hex2 + cad;
                    break;
                case 11:
                    Hex2 = "B";
                    cad = Hex2 + cad;
                    break;
                case 12:
                    Hex2 = "C";
                    cad = Hex2 + cad;
                    break;
                case 13:
                    Hex2 = "D";
                    cad = Hex2 + cad;
                    break;
                case 14:
                    Hex2 = "E";
                    cad = Hex2 + cad;
                    break;
                case 15:
                    Hex2 = "F";
                    cad = Hex2 + cad;
                    break;
                default:
                    cad = String.valueOf(Hex) + cad;
                    break;
            }
            if (num == 0) {
                break;
            }
            a = num;
        }
        return cad;
    }
}
