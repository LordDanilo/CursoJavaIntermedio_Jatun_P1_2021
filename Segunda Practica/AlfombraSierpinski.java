public class AlfombraSierpinski{
    public int calcularCuadradosBlancos(int nivel){
        if(nivel == 1){
            return 1;
        }else{
            return (calcularCuadradosBlancos(nivel-1)*8)+1;
        }
    }
}
