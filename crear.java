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
class crear {
    public void crear(){
      
        Scanner sc = new Scanner(System.in);
     
        int escoger;
        int dia =0;
        int hora = 0;
        int finevento = 0;
        String titulo;
        String details;
        String ubicacion;
        
        System.out.println();
        System.out.println("Ingresar Datos");
        System.out.println();
        
        System.out.println("Titulo del Evento");
        System.out.print("--> ");
        titulo = sc.nextLine();
        
        System.out.println();
        
        System.out.println("Detalles del Evento");
        System.out.print("--> ");
        details = sc.nextLine();
        
        System.out.println();
     
        System.out.println("Ubicacion del Evento");
        System.out.print("--> ");
        ubicacion = sc.nextLine();
        
        System.out.println();

        while(dia<=30){
       
            System.out.println("Ingrese el dia");
            System.out.print("--> ");
            dia = sc.nextInt();
        
            if(dia<=30){
                System.out.println(dia);
                System.out.println(); 
                break;
      
                }else{
                    System.out.println("Fecha Invalida");
                    System.out.println();
      
                    }
        
        }

            while(hora<=23){
        
                System.out.println("Hora inicio del Evento");
                System.out.print("--> ");
                hora = sc.nextInt();
        
                if (hora<=23){
                    System.out.println(hora);
                    break;
                         
                }else{
                    System.out.println("Hora invalida");
                    System.out.println();
                    }  
                }
                    while(finevento<=23){
                     System.out.println("Hora Fin del Evento");
                     System.out.print("--> ");
                     finevento = sc.nextInt();

                     if (finevento<=23){

                         if(hora<=finevento){
                            System.out.println(finevento);
                            System.out.println();
                            break;


                         }else{
                             System.out.println("Hora inicio y fin no coinciden");
                             System.out.println();
                         }

                          }else{
                             System.out.println("Hora invalidad");
                             System.out.println();
                        }
                    }
                                System.out.println();
                                System.out.println("      Resultados".toUpperCase());
                                System.out.println();

                                System.out.println("Titulo del Evento =  " + titulo );
                                System.out.println("fecha del evento =  " + dia);
                                System.out.println("Detalles del Evento =  " + details);
                                System.out.println("Ubicacion del Evento =  " + ubicacion);
        
        
                                    if (hora<=23){
                                        System.out.println("Hora Inicio del Evento =  "+ hora);

                                   }else{
                                       System.out.println("Hora Inicio del Evento =  "+ "Revise bien");
                                    }

                                    if (finevento<=23){
                                        System.out.println("Hora Fin del Evento =  "+ finevento); 

                                    }else{
                                        System.out.println("Hora Inicio del Evento =  " + "Revise bien");
                                    }
                                    
                                    System.out.println();
                                    System.out.println("¿Su informacion es correcta? 4 = si / 8 = no");
                                    System.out.print("--> ");
                                    escoger = sc.nextByte();
        

                                    if (escoger == 4){
                                        System.out.println();
                                        mostrar callprincipal = new mostrar();
                                        callprincipal.show();
                                        System.out.println();
                                        
                                       
                                        }else if (escoger == 8){
                                        System.out.println();

                                       Menu call = new Menu();
                                       call.main();
                                       
                                        }else{
                                            System.out.println("Error raza :v");
                                            System.out.println("Vuelva a intentarlo..");
                                            System.out.println();
                                            System.out.println("¿Su informacion es correcta?( 4 = si / 8 = no)");
                                            System.out.print("--> ");
                                            escoger = sc.nextByte();
                                        }
    }
    
}
