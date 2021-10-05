import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Juego juego1 = new Juego(6,6,10);
        juego1.prepararTablero();
        while(juego1.estaEnCurso()){
            System.out.print("Ingrese coordenadas: ");
            int i = sc.nextInt();
            int j = sc.nextInt();
            juego1.jugar(i,j);
        }
    }
}
