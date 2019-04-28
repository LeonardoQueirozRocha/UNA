
package exercício.pkg2.modularização;

import java.util.Scanner;


public class Exercício2Modularização {
    
    public static int VetorPosicao( int []p, int x){
    for ( int i = 0; i < p.length; i++){
        if ( x == p[i]){
            return i;
        }                
    }
    return -1;

    
}
    
    public static int MediaVetor( int []m){
        
        int med;
        
        for ( int i = 0; i < m.length; i++){
            
        }
        med = SomaVetor(m)/5;
        return med;
    }
    
    public static int SomaVetor( int []s ){
        
        int soma = 0, med;
        
        for ( int i = 0; i < s.length; i++){
            soma = soma + s[i];
        }
        med = soma / 5;
        return soma;
        
      
    }
    
    public static int VetorMenor( int []c){
        
        int menor = c[0];
        
        for ( int i = 0; i < c.length; i++){
            if ( c[i] < menor ){
                menor = c[i];
            }
        }
        return menor;
    }
    
    public static int VetorMaior( int []b ){
         
        int maior = b[0];
        
        for ( int i = 0; i < b.length; i++){
           if ( b[i] > maior){
               maior = b[i];
           }                           
        }
        return maior;        
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, opcao;
        int a[] = new int[5];
     
        for (int i = 0; i < a.length; i++){
            System.out.print("Digite o " + (i+1) + ("º número: "));
            a[i] = input.nextInt();
        }
                        
        do{
            System.out.println("1 - O maior elemento do vetor");
            System.out.println("2 - O menor elemento do vetor");
            System.out.println("3 - A soma dos elementos do vetor");
            System.out.println("4 - A Média Aritmética dos elementos do vetor");
            System.out.println("5 - Verificar se um elementos está no vetor");
            System.out.println("6 - Sair");
            
            opcao = input.nextInt();
            
            switch (opcao){
                case 1: System.out.println("O maior número é " + VetorMaior(a)); break;
                case 2: System.out.println("O menor número é " + VetorMenor(a)); break;
                case 3: System.out.println("A soma dos número do vetor é " + SomaVetor(a)); break;
                case 4: System.out.println("A Média Aritmética é " + MediaVetor(a)); break;
                case 5: System.out.print("Digite um número para vericar se ele está no vetor: ");
                        b = input.nextInt();
                        int pos = VetorPosicao(a,b);
                        if ( pos >= 0){
                        System.out.println("O número " + b + " está na posição " + (VetorPosicao(a,b) + 1) + " do vetor!"); break;
                        }
                        else
                        System.out.println("O número " + b + " não está no vetor!"); break;
                case 6: System.out.println("Fim do programa!!!"); break;
                default: System.out.println("Opção inválida!!!");
            }
        }while (opcao != 6);
         
     
    }
    
}
