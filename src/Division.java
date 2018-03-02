import javax.swing.JOptionPane;
import java.lang.*;
public class Division {
    public static void main(String[] args){
    int div = 0;
    double div2 = 0;
    int N1 = 0;
    int N2 = 0;
    int R = 0;
    boolean exact = true;
    do {
            try {
               N1 = (int) Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Ingresa el primer numero",
                "Ingresando valores",
                JOptionPane.QUESTION_MESSAGE));
                exact = true;
                N2 = (int) Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Ingresa el segundo numero",
                "Ingresando valores",
                JOptionPane.QUESTION_MESSAGE));
                exact = true;
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, 
                "Tonto, escribe sólo números :P",
                "Cuidado", 
                JOptionPane.INFORMATION_MESSAGE);
                exact = false;
            }
        } while(exact != true);
        
        
        div = N1/N2;
        R = N1%N2;
        if (R == 0){
         JOptionPane.showMessageDialog(null, 
        "El resultado de la division es : " + div + 
        "\nEl modulo es : " + R +
        "\nLa division es exacta",
        "Resultados", 
        JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, 
        "El resultado de la division es : " + div + 
        "\nEl modulo es : " + R +
        "\nLa division no es exacta",
        "Resultados", 
        JOptionPane.INFORMATION_MESSAGE);

        }        
    }
}
