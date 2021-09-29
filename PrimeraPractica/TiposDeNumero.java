public class TiposDeNumero{
    public String verificarNumero(int numero){
        String res;
        int sumatoriaDivisores = sumarDivisores(numero, 1);
        if(sumatoriaDivisores == numero){
            res = "Es un numero Perfecto";
        }else{
            if(sumatoriaDivisores > numero){
                res = "Es un numero Abundante";
            }else{
                res = "Es un numero Defectivo";
            }
        }
        return res;
    }
    private int sumarDivisores(int num, int div){
        int res;
        if(div <= (num/2)){
            if(num%div == 0){
                res = div+sumarDivisores(num, div+1);
            }else{
                res = sumarDivisores(num, div+1);
            }
        }else{
            res = 0;
        }
        return res;
    }
}
