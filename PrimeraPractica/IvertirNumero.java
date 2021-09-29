public class IvertirNumero{
    public int invertirNumero(int numero){
        int n = contarDigitos(numero);
        int aux = (int)(Math.pow(10,n-1));
        return invertirNumero(numero, aux);
    }
    private int invertirNumero(int numero, int aux){
        int res; 
        if(numero<10){
            res = numero;
        }else{
            int dig = numero%10;
            res = (dig*aux)+invertirNumero(numero/10, aux/10);
        }
        return res;
    }
    private int contarDigitos(int n){
        if(n<10){
            return 1; 
        }else{
            return 1+contarDigitos(n/10);
        }
    }
}
