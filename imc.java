package simm;
import javax.swing.JOptionPane;

public class imc {
    public static void main(String[] args) {
    float altura = 0, peso = 0, imc = 0;
    String aux = "";          
    try{
        aux=JOptionPane.showInputDialog("Digite o seu peso: ");
        peso = Float.parseFloat(aux);
        aux=JOptionPane.showInputDialog("Digite a sua altura:  ");
        altura = Float.parseFloat(aux);

        imc = peso/(altura * altura);
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Peso abaixo do normal.");
        }
        if (imc >= 18.5 && imc <= 24.4) {
            JOptionPane.showMessageDialog(null, "Peso ideal.");
        }
        if (imc >= 24.5 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Peso Pré-obesidade.");
        }
        if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade classe 1.");
        }
        if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade severa.");
        }
        if (imc > 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade móbida.");
        }
      }  
      catch (NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Houve erro, por favor tente novamente");
      }    
    }
}
