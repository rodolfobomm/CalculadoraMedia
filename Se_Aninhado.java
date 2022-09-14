
package se_aninhado;

import java.util.Scanner;


public class Se_Aninhado {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        
        
        System.out.print("Informe a 1ª nota: ");
            double n1 = teclado.nextDouble();
        System.out.print("Informe a 2ª nota: ");   
            double n2 = teclado.nextDouble();
        System.out.print("Informe a 3ª nota: ");    
            double n3 = teclado.nextDouble();
            
            
            double media;
            media =(n1+n2+n3)/ 3;
            
            if (media<2){
                System.out.println("Péssimo");
            } 
            else if (media<4){
                System.out.println("Ruim");
            }
            else if (media<6){
                System.out.println("Regular");
        
            }
            else if (media<8){
                System.out.println("Bom");
            }
            else if (media<9.50){
                System.out.println("Ótimo");
            }
            else{ 
                System.out.println("Excelente");                
            }
            
            
    }
    
}
