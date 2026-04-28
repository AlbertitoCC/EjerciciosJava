/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9for;

import java.util.Scanner;


public class Tema3Ejercicio9For {
    
    
/*El For se usa para repetir las acciones un limite de acciones, es decir,
    cuando conocemos el numero de veces que queremos repetir las acciones
*/

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce una nota");
        int num1=teclado.nextInt();
        System.out.println("Introduce otra nota");
        int num2=teclado.nextInt();
        System.out.println("Introduce otra nota");
        int num3=teclado.nextInt();
        System.out.println("Introduce otra nota");
        int num4=teclado.nextInt();
        System.out.println("Introduce otra nota");
        int num5=teclado.nextInt();
        int nota=num1+num2+num3+num4+num5;
        int notaFinal=nota/5;
        
        
        for (int notilla = 0; nota<5; notaFinal ++) {
            System.out.println("Introduce una nota " + num1);
            System.out.println("Introduce otra nota "+ num2);
            System.out.println("Introduce otra nota "+ num3);
            System.out.println("Introduce otra nota "+ num4);
            System.out.println("Introduce otra nota "+ num5);
            num1=teclado.nextInt();
            num2=teclado.nextInt();
            num3=teclado.nextInt();
            num4=teclado.nextInt();
            num5=teclado.nextInt();
            
            
            if (notaFinal<5){
                System.out.println("Suspenso");
            }else if(notaFinal>5){
                System.out.println("Aprobado");
            }
                
            
        }
        
        
        
    }
    
}
