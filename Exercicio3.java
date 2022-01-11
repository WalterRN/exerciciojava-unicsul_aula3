import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args){
        double tempoViagem, velocidade, dist;
           
            tempoViagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantas horas foi gasto na viagem: "));
            velocidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a velocidade média: "));
            
            dist = tempoViagem * velocidade;
           
            JOptionPane.showMessageDialog(null, String.format("A distância percorrida é: %.2f km", dist));
    }
    
}
