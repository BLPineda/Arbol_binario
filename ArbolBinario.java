/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol_Binario;

/**
 *
 * @author lenin
 */
public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario() {
    }
    
    public void AñadirNodo(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true){
                padre=aux;
                if(dato<aux.dato){
                    aux = aux.hijoizquierdo;
                    if(aux==null){
                        padre.hijoizquierdo=nuevo;
                        return;
                    }
                }else{
                    aux = aux.hijoderecho;
                    if(aux==null){
                        padre.hijoderecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean estaVacia(){
        return this.raiz == null;
    }
    
    public void inOrden(NodoArbol root){
        
        if(root!=null){
            inOrden(root.hijoizquierdo);
            System.out.println(root.dato);
            inOrden(root.hijoderecho);
        }
    }
    
    public void preOrden(NodoArbol root){
        
        if(root!=null){
            System.out.println(root.dato);
            System.out.println(root.hijoizquierdo);
            System.out.println(root.hijoderecho);
        }
    }
     public void postOrden(NodoArbol root){
        
        if(root!=null){
            System.out.println(root.hijoizquierdo);
            System.out.println(root.hijoderecho);
            System.out.println(root.dato);
        }
     }
}
