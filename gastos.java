import java.util.Scanner;

import javax.swing.SpringLayout;

public class gastos {
    public static void main( String [] args ) {
        Scanner OK = new Scanner(System.in);
        //variavel
        double aluguel, alimentacao, transporte, contas, F, d, g;

        System.out.println("Informe o valor de aluguel: ");
        aluguel = OK.nextDouble();
    
        System.out.println("Informe o valor de alimentação: ");
        alimentacao = OK.nextDouble();
        
        System.out.println("Informe o valor do transporte");
        transporte = OK.nextDouble();

        System.out.println("Informe o valor das contas");
        contas = OK.nextDouble();

        F = (aluguel + alimentacao + transporte + contas)*2;

    System.out.println("O salário ideal é de: " + F);

    d = F * 0.3;
    g = F * 0.2;
    
    System.out.println("30% para atividades próprias: " + d + " e 20% para guardar: " + g);
    }
}
