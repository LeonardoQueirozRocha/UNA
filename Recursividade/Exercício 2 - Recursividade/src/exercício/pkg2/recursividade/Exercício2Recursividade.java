
package exercício.pkg2.recursividade;

import java.util.Scanner;

public class Exercício2Recursividade {
    
    public static int fibonacci( int x){        
        if ( x < 2 ){
            return x;
        }else 
         return fibonacci(x-1) + fibonacci(x-2);    
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        System.out.println("O resultado da função Fibonacci do número " + n + " é " + fibonacci(n));
        
    }
    
}
