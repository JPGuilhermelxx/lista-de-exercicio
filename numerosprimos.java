import java.util.Scanner;
public class numerosprimos {
    static Integer numero;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        System.out.println("Digite um número entre 1 e 130");
        int numero = scan.nextInt();       
        for(int i = 2; i <= numero; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }
    }


    
}

