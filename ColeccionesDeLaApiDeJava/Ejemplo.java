//TreeSet, TreeMap, HashMap, HashSet
import java.util.TreeSet;
import java.util.TreeMap; 
import java.util.HashSet;
import java.util.HashMap;
public class Ejemplo{
    private TreeSet<Integer> arbol1;
    private TreeMap<String, Integer> arbolMapa;
    private HashSet<Integer> set;
    private HashMap<String, String> map;
    public Ejemplo(){
        arbol1 = new TreeSet<>();
        arbolMapa = new TreeMap<>();
        set = new HashSet<>();
        map = new HashMap<>();
    }
    public void agregarAlSet(Integer dato){
        set.add(dato);
    }
    public void agregar(Integer dato){
        arbol1.add(dato);
    }
    public void ponerParejaAlMapa(String palabra, String significado){
        map.put(palabra, significado);
    }
    public void ponerPareja(String nombre, Integer poblacion){
        arbolMapa.put(nombre, poblacion);
    }
}
