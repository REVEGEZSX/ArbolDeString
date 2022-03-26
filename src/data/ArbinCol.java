/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Stiven
 * @param <E>
 */
public class ArbinCol<E> implements Arbin<E> {
    Arbin<E> i; 
    Arbin<E> d;
    E datos;

    public ArbinCol(E datos) {
        this.datos = datos;
    }
    
    @Override
    public Arbin<E> izq() {
        return i;    }

    @Override
    public Arbin<E> der() {
        return d;
    }

    @Override
    public void EnIzq(Arbin<E> x) {
        i=x;
    }

    @Override
    public void EnDer(Arbin<E> x) {
        d=x;
    }

    @Override
    public E obtener() {
        return datos;
    }

    @Override
    public void Cambiar(E x) {
        datos=x;
    }
}