import java.util.Stack;
public class EjemploStack{
    private Stack<Integer> pila;
    public EjemploStack(){
        pila = new Stack<>();
    }
    public void agregar(int valor){
        pila.push(valor);
    }
    public Integer obtenerTope(){
        return pila.pop();
    }
}
