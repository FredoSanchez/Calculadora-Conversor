/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maker.window.GUI;

/**
 *
 * @author fredy
 */
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import maker.tools.Operacion;
import maker.tools.Tool;
import maker.tools.aritmeticas.Aritmetica;
import maker.tools.conversores.Conversor;
import maker.window.GUI.Ventana;


/**
 *
 * @author fredy
 */
public class Ventana extends JPanel{
    public int WIDTH = 900, widthTF=120, widthB=80;
    public int HEIGHT = 500, heightTF = 30, heightB =30;
    public JTextField textF1, textF2, textF3, textF4, textF5;
    public JButton button1, button2, button3, button4, button5, button6, button7, button8;
    
    
    public Ventana(){
        Tool herramienta;
        herramienta =  Operacion.getFactory("aritmetica");
        Aritmetica suma = herramienta.getOperacion("suma");
        Aritmetica resta = herramienta.getOperacion("resta");
        Aritmetica multiplicacion = herramienta.getOperacion("multiplicacion");
        Aritmetica division = herramienta.getOperacion("division");
        //Calculadora        
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(200, 40, widthTF, heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(600, 40, widthTF, heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(390, 170, widthTF, heightTF));
        
        button1 = new JButton("Sumar");
        button1.setBounds(new Rectangle(120, 115, widthB, heightB));
        
        button2 = new JButton("Restar");
        button2.setBounds(new Rectangle(320, 115, widthB, heightB));
        
        button3 = new JButton("Multiplicar");
        button3.setBounds(new Rectangle(520, 115, widthB+15, heightB));
        
        button4 = new JButton("Dividir");
        button4.setBounds(new Rectangle(720, 115, widthB, heightB));
        
        
        button1.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                float a = Float.parseFloat(textF1.getText());
                float b = Float.parseFloat(textF2.getText());
                float resultado = suma.operar(a, b);                
                textF3.setText(Float.toString(resultado));
            }
        });
        
        button2.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                float a = Float.parseFloat(textF1.getText());
                float b = Float.parseFloat(textF2.getText());
                float resultado = resta.operar(a, b);                
                textF3.setText(String.valueOf(resultado));
            }
        });
        
        button3.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                float a = Float.parseFloat(textF1.getText());
                float b = Float.parseFloat(textF2.getText());
                float resultado = multiplicacion.operar(a, b);                
                textF3.setText(String.valueOf(resultado));
            }
        });
        
        button4.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                float a = Float.parseFloat(textF1.getText());
                float b = Float.parseFloat(textF2.getText());
                float resultado = division.operar(a, b);                
                textF3.setText(String.valueOf(resultado));
            }
        });
        
        //Conversor
        Tool herramienta2;
        herramienta2 =  Operacion.getFactory("conversor");
        Conversor binario = herramienta2.getConversion("binario");
        Conversor decimal = herramienta2.getConversion("decimal");
        Conversor hexadecimal = herramienta2.getConversion("hexadecimal");
        Conversor octal = herramienta2.getConversion("octal");
        
        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(390, 270, widthTF, heightTF));
        
        textF5 = new JTextField();
        textF5.setBounds(new Rectangle(390, 370, widthTF, heightTF));
        
        button5 = new JButton("Binario");
        button5.setBounds(new Rectangle(120, 315, widthB, heightB));
        
        button6 = new JButton("Decimal");
        button6.setBounds(new Rectangle(320, 315, widthB, heightB));
        
        button7 = new JButton("Hexadecimal");
        button7.setBounds(new Rectangle(510, 315, widthB+30, heightB));
        
        button8 = new JButton("Octal");
        button8.setBounds(new Rectangle(720, 315, widthB, heightB));
        
        button5.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                
                String conversion = binario.convertir(Float.parseFloat(textF4.getText()));
                textF5.setText(conversion);
            }
        });
        
        button6.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                
                String conversion = decimal.convertir(Float.parseFloat(textF4.getText()));
                textF5.setText(conversion);
            }
        });
        
        button7.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                
                String conversion = hexadecimal.convertir(Float.parseFloat(textF4.getText()));
                textF5.setText(conversion);
            }
        });
        
        button8.addActionListener(new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent arg0){
                
                String conversion = octal.convertir(Float.parseFloat(textF4.getText()));
                textF5.setText(conversion);
            }
        });
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(true);
        textF5.setEditable(false);
        
        add(textF1);
        add(textF2);
        add(textF3);
        add(textF4);
        add(textF5);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
}
