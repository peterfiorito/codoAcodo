/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.complementarios;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pedrofiorito
 */
public class EjerciciosComplementarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculos();
        Mezclador(1,2,3);
        sumaNat();
        porcentajes();
        promedio_diez();
    }
    public static void calculos(){
        System.out.println("Ingrese primer numero:");
        Scanner sc = new Scanner(System.in);
        int numero_uno = sc.nextInt();
        System.out.println("Ingrese segundo numero:");
        int numero_dos = sc.nextInt();
        // Llamar metodo suma y ejecutar
        int suma = suma(numero_uno, numero_dos);
        System.out.println("La suma es: "+ suma);
        // Llamar metodo resta
        int resta = resta(numero_uno, numero_dos);
        System.out.println("La resta es: "+ resta);
        // Llamar producto
        int producto = producto(numero_uno, numero_dos);
        System.out.println("El producto es: "+ producto);
        // Llamar producto
        int division = division(numero_uno, numero_dos);
        System.out.println("La division es: "+ division);        
    }
    
    public static int suma(int a, int b){
        return a + b;
    }
    
    public static int resta(int a, int b){
        return a - b;
    }
    
    public static int producto (int a, int b){
        return a * b;
    }
    
    public static int division (int a, int b){
        return a / b;
    }
    
    public static void Mezclador(int a, int b, int c){
        System.out.println("Parametros de entrada son:"+a+b+c);
        int aux = a;
         a = b;
         b = c;
         c = aux;
        System.out.println("Sus variables invertidas son:"+c+b+a);
    }
    
    public static int sumaNat (){
        int [] numerosNat = new int [10];
        int startValue = 0;
        for (int init = 0; init < numerosNat.length; init++){
            numerosNat[init] = init;
        }
        int suma =  Arrays.stream(numerosNat).reduce(startValue, (x,y) -> x+y);
        System.out.println("Suma de primeros 10 naturales: " + suma);
        return suma;
    }
    
    public static void porcentajes(){
        double total = (27 + 54);
        double porH = (27/total) * 100;
        double porM = (54/total) * 100;
        
        System.out.println("Porcentaje niños: " + porH);
        System.out.println("Porcentaje niñas: " + porM);
    }
    
    public static int promedio_diez() {
        int [] numerosPro = new int [10];
        int counter = 0;
        int startValue = 0;
        while(counter < 10){
            System.out.println("ingrese un numero");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            numerosPro[counter] = numero;
            counter++;
        }
        int suma =  Arrays.stream(numerosPro).reduce(startValue, (x,y) -> x+y);
        System.out.println("La suma de los numeros es "+ suma);
        int promedio = (suma/numerosPro.length);
        System.out.println("El promedio de los numeros es "+ promedio);
        return promedio;
    }
    
}
