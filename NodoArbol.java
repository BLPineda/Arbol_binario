/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol_Binario;

/**
 *
 * @author lenin
 */
public class NodoArbol {
    int dato;
    NodoArbol hijoizquierdo;
    NodoArbol hijoderecho;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.hijoderecho = null;
        this.hijoizquierdo = null;
    }

    @Override
    public String toString() {
        return "Su dato es: " + dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public NodoArbol getHijoizquierdo() {
        return hijoizquierdo;
    }

    public void setHijoizquierdo(NodoArbol hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    public NodoArbol getHijoderecho() {
        return hijoderecho;
    }

    public void setHijoderecho(NodoArbol hijoderecho) {
        this.hijoderecho = hijoderecho;
    }
    
}
