public class CurvaHilbert{
    public int calcularLineasDeNivel(int nivel){
        if(nivel == 1){
            return 3;
        }else{
            if(nivel%2 == 0){
                return (calcularLineasDeNivel(nivel-1)*3)+4;
            }else{
                return calcularLineasDeNivel(nivel-1)*3;
            }
        }
    }
}
