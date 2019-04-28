
package exercício.pkg3.modularização;

import java.util.Scanner;

public class Exercício3Modularização {
    
    public static int potencia(int a, int b){
        int p = 1;
        for ( int i = 1; i <= b; i++ ){
            p = multiplicacao(p,a);
        }
        return p;
         
    }
    
    public static int resto(int a, int b){
        
        return a - multiplicacao(divisao(a,b),b);
        
    }
    
    public static int divisao(int a, int b){
        int c = 0;
        while ( a >= b){
            a = a - b;
            c = c + 1;
        }
        return c;
    }
    
    public static int multiplicacao(int a, int b){
        int m = 0;
        for (int i = 0; i < b; i++){
            m = m + a;
        }
        return m;
    }
    
    public static int subtracao(int a, int b){
        int s = a - b;
        return s;
    }
    
    public static int soma(int a, int b){
        int s = a + b;
        return s;
    }

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = input.nextInt();
        
        System.out.println("A soma entre os números " + n1 + " e " + n2 + " é " + soma(n1,n2));
        System.out.println("A subtração entre os números " + n1 + " e " + n2 + " é " + subtracao(n1,n2));
        System.out.println("A multiplicação entre os números " + n1 + " e " + n2 + " é " + multiplicacao(n1,n2));
        System.out.println("A divisão entre os números " + n1 + " e " + n2 + " é "+ divisao(n1,n2));
        System.out.println("O resto da divisão entre os números " + n1 + " e " + n2 + " é " + resto(n1,n2));
        System.out.println("A potência entre os números " + n1 + " e " + n2 + " é " + potencia(n1,n2));
        
        

    }
    
}
