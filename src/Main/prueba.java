/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import data.Arbin;
import data.ArbolesString;

/**
 *
 * @author Clon
 */
public class prueba {
        public static void main(String[] args) {
            ArbolesString arb = new ArbolesString();
            Arbin<String> raiz=arb.crear();
            System.out.println("EL PESO ES: "+arb.peso(raiz));
            arb.inorden(raiz);
    }
}
