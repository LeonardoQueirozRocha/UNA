
package exercício.pkg1.recursividade;

import java.util.Scanner;

public class Exercício1Recursividade {
    
    public static int fatoraliterativo( int y){
        int f = 1;
        if ( y == 0){
            return 1;
        }else
         for ( int i = 1; i<=y; i++){
            f = f*i;
        }
        return f;
    }
    
    public static int fatorial( int x){
        if (x == 0){
            return 1;
        }else 
            return(x*fatorial(x-1));
    }

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        System.out.println("O fatorial do número " + n + " é " + fatorial(n));
        System.out.println("O fatorial do número " + n + " é " + fatoraliterativo(n));
                  
    }
    
}
