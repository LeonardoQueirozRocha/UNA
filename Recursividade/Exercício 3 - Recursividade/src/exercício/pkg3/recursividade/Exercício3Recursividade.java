
package exercício.pkg3.recursividade;

import java.util.Scanner;


public class Exercício3Recursividade {
    
    public static int soma( int num){
        
        if (num == 0){
            return 0;
        }else 
            return num + soma( num - 1 );        
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        System.out.println("A soma dos números é " + soma(n));
     
    }
    
}
