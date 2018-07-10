/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author Gerardo L
 */
class Menu {
    public void main(){
        
        int opor;
        
        Scanner tec = new Scanner(System.in);
        System.out.println();
        System.out.println("Menu".toUpperCase());
        System.out.println();
        System.out.println("1. Crear Evento");
        System.out.println("2. Ver Evento");
        System.out.println("3. Salir");
        
        System.out.println();
        
        System.out.println("Escoja su opcion");
        System.out.print("→ ");
        opor = tec.nextInt();
        System.out.println();
        
        if(opor == 1){
            crear call = new crear();
            call.crear();
            
        }else if(opor == 2){
            mostrar call = new mostrar();
            call.show();
            System.out.println();

        }else if(opor == 3){
            System.out.println();
            start call = new start();
            call.registration();
        }
    
    }
    
}
