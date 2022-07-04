package exercicios.teste;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import java.util.Scanner;
public class emanuel {
    public static void main(String[] args) {
        Scanner idade = new Scanner (System.in);
        System.out.println("Digite a sua idade: ");
        Integer id = idade.nextInt();
        if (id <= 2) {
            JOptionPane.showMessageDialog(null, "Bebê");
        };
        if (id >= 3 & id <= 11  ) {
            JOptionPane.showMessageDialog(null, "Criança");
        };
        if (id >= 12 & id <= 19  ) {
            JOptionPane.showMessageDialog(null, "Adoslescente");
        };
        if (id >= 20 & id <= 30  ) {
            JOptionPane.showMessageDialog(null, "Jovem");
        };
        if (id >= 31 & id <= 60  ) {
            JOptionPane.showMessageDialog(null, "Adulto");
        };
        if (id >=61) {
            JOptionPane.showMessageDialog(null, "Idoso");
        };
    }
    
}
