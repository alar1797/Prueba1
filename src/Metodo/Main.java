
package Metodo;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        //Llamar los metodos en la clase Operacion
        int n1, n2;
        Scanner entrada = new Scanner(System.in); // capturar los datos
        System.out.println("Digite el primer numero: ");
        n1 = entrada.nextInt();//Lea el dato
        System.out.println("Digite el segundo numero: ");
        n2 = entrada.nextInt();
        
        //Se declarara el objeto
        Operacion operacion1 = new Operacion();
        // Ahora se llaman los metodos de la clase Operacion
        //Primero se llama al objeto
        operacion1.sumar(n1, n2);
        operacion1.restar(n1, n2);
        operacion1.multipliciar(n1, n2);
        operacion1.dividir(n1, n2);
        
        //Ahora falta mostrar el resultado
        operacion1.mostrarResultado();
        
    }
}
