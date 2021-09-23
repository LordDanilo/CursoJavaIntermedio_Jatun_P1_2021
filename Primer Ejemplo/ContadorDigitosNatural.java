public class ContadorDigitosNatural{
    public int contadorDigitos(int numero){
        int contador = 0;
        while(numero>0){
            numero = numero/10;
            contador++;
        }
        return contador;
    }
    
    public int contarDigitosRec(int numero){
        int contador;
        if(numero>0){
            numero = numero/10;
            contador = 1+ contarDigitosRec(numero);
        }else{
            contador = 0;
        }
        return contador;
    }
    
}
