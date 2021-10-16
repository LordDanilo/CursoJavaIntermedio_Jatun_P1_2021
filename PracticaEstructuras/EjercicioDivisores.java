import java.util.PriorityQueue;
public class EjercicioDivisores{
    class Numero implements Comparable<Numero>{
        int valor;
        public Numero(int v){
            valor = v;
        }

        public int compareTo(Numero otro){
            int res;
            int valor2 = otro.getValor();
            if(valor%2==0 && valor2%2!=0){
                res = 1;
            }else{
                if(valor%2!=0 && valor2%2==0){
                    res = -1;
                }else{
                    if(valor<valor2){
                        res = -1;
                    }else{
                        if(valor>valor2){
                            res = 1;
                        }else{
                            res = 0;
                        }
                    }
                }
            }
            return res;
        }

        public int getValor(){
            return valor;
        }
    }
    
    public PriorityQueue sacarDivisores(int num){
        PriorityQueue<Numero> res = new PriorityQueue<>();
        for(int div = 1; div <= (num/2); div++){
            if(num%div == 0){
                Numero nuevo = new Numero(div);
                res.offer(nuevo);
            }
        }
        return res;
    }
}
