/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.de.cristhian.limongi;

/**
 *
 * @author Cristhian
 */
public class DeberDeCristhianLimongi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int numero=0,numero1=0,numero2=0,mayor=0;
        //ingresar los 3 numeros 
        numero=1;
        numero1=2;
        numero2=3;
     
          //hallar el mayor
        mayor=hayar(numero,numero1,numero2);
        
    }
     public static int hayar (int valor1,int valor2,int valor3){
        int mayorito=0;
        mayorito=valor1;
        
        if (valor2>mayorito){
            mayorito=valor2;
             
        }
        if (valor3>mayorito){
            mayorito=valor3;
             return (valor3);
        }
        if (valor2==mayorito){
            return(valor2);
        }
        return (valor1);
    }
     public static void mostrar (int mayore ,int number1,int number2,int number3){
        System.out.printf(" la mayor de las variables es %d de las  variables %d %d %d \n",mayore,number1,number2,number3);
    }
}
