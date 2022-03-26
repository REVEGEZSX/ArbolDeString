/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Clon
 */
public class ArbolesString {
public Arbin<String> crear(){
        Arbin<String> Raiz = new ArbinCol<String>("a");
        
        Arbin<String> iz = new ArbinCol<String>("b");
        Arbin<String> de = new ArbinCol<String>("c");
        
        
        Raiz.EnIzq(iz);
        Raiz.EnDer(de);
        
        Raiz.izq().EnDer(new ArbinCol<String>("d"));
        Raiz.der().EnIzq(new ArbinCol<String>("e"));
        
        return Raiz;
    }
    
    public int peso (Arbin<String> r){
        if (r == null) {
            return 0;
        }else{
            return 1+peso(r.izq())+peso(r.der());
        }
    }
    
    public void inorden(Arbin<String> r){
        if (r != null){
            inorden(r.izq());
            System.out.println(r.obtener());
            inorden(r.der());
        }
    }
}
