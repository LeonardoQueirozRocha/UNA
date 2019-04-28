package exercício.pkg1.modularização;

import java.util.Scanner;


public class Exercício1Modularização {
    
    public static boolean Primo( int num ){
         boolean  prim = true;
         int divisor = 2;
         while ( (prim) && (divisor != num)){
             if ( num % divisor ==0){
                 prim = false;
             }
             else 
                 divisor++;
         }
         return prim;
    }
    
    public static int Soma( int num1){
        int s = 0;
        for (int i = 1; i<=num1; i++){
            s = s + i;
        }
        return s;
    }
    
    public static int  Fatorial( int p1){
        int f=1;
            for (int i=1; i<=p1; i++){
            f = f * i;
        } 
        return f;   
    }
    
    public static double Media( double p1, double p2, double p3){
        double m;
        m = (p1 + p2 + p3)/3;
        return m;
    }
    
    public static int Maior(int p1, int p2){
        if (p1 > p2){
            return p1;
        }
        else 
            return p2;
    }
    
    public static int Dobro(int p1){
        int a, b;
        a = p1;
        b = 2 * a;
        return b;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, numero1, numero2, y, z, p;
        double n1, n2, n3;
        
        System.out.println("Um número inteiro e que retorne o dobro deste número");
        
         System.out.print("Digite um número: ");
         x = input.nextInt();
         System.out.println("O dobro de " + x + " é " + Dobro(x));
         
         System.out.println("Dois números inteiros e que retorne o maior entre eles");
         
         System.out.print("Digite o 1º número: ");
         numero1 = input.nextInt();
         System.out.print("Digite o 2º número: ");
         numero2 = input.nextInt();
         System.out.println("Entre " + numero1 + " e " + numero2 + " o maior número é " + Maior(numero1,numero2));
         
         System.out.println("Três números reais e que retorne a média aritmética desses três números");
         
         System.out.print("Digite o 1º número: ");
         n1 = input.nextDouble();
         System.out.print("Digite o 2º número: ");
         n2 = input.nextDouble();
         System.out.print("Digite o 3º número: ");
         n3 = input.nextDouble();
         System.out.println("A média Aritmética dos números " + n1 + ", " + n2 + ", " + n3 + " é " + Media(n1, n2, n3));
         
         System.out.println("Um número inteiro e que retorne o valor do fatorial deste número");
         
         System.out.print("Digite um número: ");
         y = input.nextInt();
         if ( y > 0 ){
            System.out.println("O fatorial do número " + y + " é " + Fatorial(y));
         }else 
            System.out.println("Não foi possível calcular o fatorial do número " + y);
         
         System.out.println("Um número inteiro e positivo, que retorne a soma dos elementos inteiros existentes entre 1 e o número (inclusive)");
         
         System.out.print("Digite um número: ");
         z = input.nextInt();
         if ( z > 0 ){
            System.out.println("A soma dos elementos inteiros entre 1 e o número " + z + " é " + Soma(z)); 
         }
         else
             System.out.println("Não foi possível realizar a soma dos elementos inteiros entre 1 e o  número " + z);
         
         System.out.println("Um número inteiro e que retorne true se o número for primo, e false caso contrário");
         
         System.out.print("Digite um número: ");
         p = input.nextInt();
         if (Primo(p)){
             System.out.println("O número " + p + " é Primo!");
         }
         else 
             System.out.println("O número " + p + " não é Primo!");
    }    
}
