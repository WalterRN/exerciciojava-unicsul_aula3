import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args){

        double base, altura, area, perimetro;
           
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Base do retangulo metro: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do retangulo metro: "));
        
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        
       
        JOptionPane.showMessageDialog(null, String.format("A area do retangulo é: %.0fm²\nSeu perimetro é: %.0fm", area, perimetro));

    }

}