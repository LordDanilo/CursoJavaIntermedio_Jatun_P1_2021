import java.util.*;
public class ArbolBin<T>{
    private T raiz;
    private ArbolBin<T> izq;
    private ArbolBin<T> der;
    public ArbolBin(){
        raiz = null;
        izq = der = null;
    }
    public boolean estaVacio(){
        return raiz == null;
    }
    public void addAmplitud(T dato){
        if(estaVacio()){
            raiz = dato;
            izq = new ArbolBin<>();
            der = new ArbolBin<>();
        }else{
            Queue<ArbolBin<T>> cola = new LinkedList<>();
            cola.offer(izq);
            cola.offer(der);
            addAmplitud(dato,cola);
        }
    }
    public void addAmplitud(T dato, Queue<ArbolBin<T>> cola){
        ArbolBin<T> act = cola.poll();
        if(act.estaVacio()){
            act.setRaiz(dato);
            act.crearArbol("izq");
            act.crearArbol("der");
        }else{
            cola.offer(act.getArbolIzq());
            cola.offer(act.getArbolDer());
        }
    }
    private ArbolBin<T> getArbolIzq(){
        return izq;
    }
    private ArbolBin<T> getArbolDer(){
        return der;
    }
    private void setRaiz(T dato){
        raiz = dato;
    }
    private void crearArbol(String rama){
        if(rama.equals("izq")){
            izq = new ArbolBin<>();
        }else{
            der = new ArbolBin<>();
        }
    }
}
