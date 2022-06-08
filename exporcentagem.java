import java.lang.management.ThreadInfo;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.Scanner;

public class exporcentagem {
    public static void main( String [] args){
 
        Scanner sla = new Scanner(System.in);
        //variavel
         double i = 0.007;
         double c, j;
         double m;
         double conta;

System.out.println("Escreva o valor sem adições:");
c = sla.nextDouble();
j = (c * i * 12);
m = (j + c);
System.out.printf("R$: %.2f %n" , m);
    }  
}
