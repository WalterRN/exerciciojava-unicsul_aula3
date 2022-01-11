import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args){

        double salario, tc, ts;
           
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe se salario: "));
        
        tc = 0.05 * salario;
        ts = salario + tc ;
       
        JOptionPane.showMessageDialog(null, String.format("Seu salario com comissão de 5 porcento é de: R$ %.0f", ts));

    }

}