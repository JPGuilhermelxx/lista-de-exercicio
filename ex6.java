package ex456;
import java.util.Scanner;
public class ex6 {
public static void main(String[] args) {
    Scanner escolha = new Scanner (System.in);
    Double libra = 354.0;
    Double quilo = 1000.0;
    Double cquilo;
    Double clibra;
    System.out.println("Digite a quantidade de gramas: ");
    Integer gramas = escolha.nextInt();
    cquilo = gramas / quilo;
    clibra = gramas / libra;
    System.out.println("Quantidade de gramas em libras: " + clibra);
    System.out.println("Quantidade de gramas em quilos: " + cquilo);





}
    
}
