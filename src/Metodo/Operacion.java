//Operaciones basicas suma, resta, multiplicacion, division
package Metodo;


public class Operacion {
    
    // En una clase va: ATRIBUTOS
    
    int suma, resta, multiplicacion, division;
    
    
     // En una clase va: METODOS
    
    public void sumar (int numero1, int numero2){
        //Acciones
        suma = numero1 + numero2;
    }
    
    public void restar (int numero1, int numero2){
        resta = numero1 - numero2;
    }
    
    public void multipliciar (int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }
    
    public void dividir (int numero1, int numero2){
        division = numero1 / numero2;
    }
    // 
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La division es: "+division);
        System.out.println("La multiplicacion es: "+multiplicacion);
    }
}
