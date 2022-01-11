import javax.swing.JOptionPane;

public class Exercicio5{
        public static void main(String[] args){
            
            double tC, tF, tK;
           
            tC = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em graus Celsius: "));
            
            tF = 1.8 * tC + 32;
            tK = tC + 273;
           
            JOptionPane.showMessageDialog(null, String.format("Temperatura informada na escala Fahrenheit é: %.0fºF \ne na escala Kelvin é: %.0fK", tF, tK));
        }
    }