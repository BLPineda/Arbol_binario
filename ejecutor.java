/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arbol_Binario;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class ejecutor {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    static ArbolBinario arbol = new ArbolBinario();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int eleccion;
        boolean salir = false;
        while(salir != true){
            System.out.println("Elija lo que desea hacer:"
                    + "\n1. Añadir un nuevo nodo"
                    + "\n2. Mostrar si está vacío"
                    + "\n3. Ordenar en orden"
                    + "\n4. Ordenar en pre orden"
                    + "\n5. Ordenar en post orden"
                    + "\n6. Salir");
            eleccion = sc.nextInt();
        
        switch(eleccion){
            case 1: System.out.println("Ingrese el número que desea añadir");
                    int dato = sc.nextInt();
                    arbol.AñadirNodo(dato);
            break;
            case 2: if(arbol.estaVacia()){
                System.out.println("El árbol está vacía");
                }
            break;
            case 3: if(!arbol.estaVacia()){
                arbol.inOrden(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            case 4: if(!arbol.estaVacia()){
                arbol.preOrden(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            case 5: if(!arbol.estaVacia()){
                arbol.postOrden(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            case 6: salir = true;
            break;
        }
        }
    }
    
}
