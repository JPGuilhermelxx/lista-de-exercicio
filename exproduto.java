import java.lang.management.ThreadInfo;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.Scanner;

public class exproduto {
    public static void main( String [] args){
        Scanner aa = new Scanner(System.in);
        //variavel
         double A , precoC, VF;


System.out.println("Escreva o valor do produto: ");
precoC = aa.nextDouble();
System.out.println("Escreva o valor de acréscimo:");
A = aa.nextDouble();
VF = (precoC * A)/100;
VF = VF + precoC; 

System.out.printf("R$: %.2f %n" , VF);
    }  
}
