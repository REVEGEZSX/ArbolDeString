/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;

/**
 *
 * @author Clon
 */
public interface Arbin<E> {
    Arbin<E> izq();
    Arbin<E> der();
    void EnIzq(Arbin<E> x);
    void EnDer(Arbin<E> x);
    E obtener();
    void Cambiar(E x); 
}
