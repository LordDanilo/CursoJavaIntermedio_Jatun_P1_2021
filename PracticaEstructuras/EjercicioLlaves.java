import java.util.Stack;
public class EjercicioLlaves{
    public String numerarLlaves(String cad){
        String res = "";
        Stack<Integer> pila = new Stack<Integer>();
        int marca = 1;
        for(int pos=0; pos<cad.length(); pos++){
            char act = cad.charAt(pos);
            if(act == '{'){
                res = res+" "+marca;
                pila.push(marca);
                marca++;
            }else{
                if(act == '}'){
                    res = res+" "+pila.pop();
                }
            }
        }
        return res;
    }
}
