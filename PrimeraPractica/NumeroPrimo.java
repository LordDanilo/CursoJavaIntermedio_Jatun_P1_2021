public class NumeroPrimo{
    public String verificarNumero(int numero){
        int cDiv = 2;
        return verificarNumero(numero,cDiv);
    }

    private String verificarNumero(int numero, int cDiv){
        String res;
        if(numero==1){
            res = "Es un Numero Compuesto";
        }else{
            if(cDiv > (numero/2)){
                res = "Es un Numero Primo";
            }else{
                if(numero % cDiv == 0){
                    res = "Es un Numero Compuesto";
                }else{
                    res = verificarNumero(numero, cDiv+1);
                }
            }
        }

        return res;
    }
}
