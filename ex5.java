package ex456;
import javax.swing.*;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Double vhora;
        Integer nhora;
        Double rsalario;
       
        vhora = 10.25;
        System.out.println("Digite o valor de hora trabalhadas: ");
        nhora = input.nextInt();
        rsalario = vhora * nhora;
        System.out.println("Salário: " + rsalario);
        if (rsalario < 50) {
        JOptionPane.showMessageDialog(null,"Atenção, dirija-se à direção do Hotel!");
        }
    } 
}