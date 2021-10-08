public class ListaEnlazada<T>{
    private Nodo<T> ini;
    private int size;
    public ListaEnlazada(){
        ini  = new Nodo<T>();
        size = 0;
    }

    public void add(T valor){
        Nodo<T> actual = ini;
        while(!actual.estaVacio()){
            actual = actual.getSig();
        }
        actual.setDato(valor);
        size++;
    }

    public void addRec(T valor){
        Nodo<T> actual = ini;
        addRec(valor, actual);
    }

    private void addRec(T valor, Nodo<T> actual){
        if(actual.estaVacio()){
            actual.setDato(valor);
            size++;
        }else{
            addRec(valor, actual.getSig());
        }
    }

    public T get(int pos){
        Nodo<T> actual = ini;
        int posActual = 0;
        T res = null;
        if(pos>=0 && pos<size){
            while(posActual != pos){
                actual = actual.getSig();
                posActual++;
            }
            res = actual.getValor();
        }
        return res;
    }

    public T remove(int pos){
        Nodo<T> actual = ini;
        Nodo<T> anterior = null;
        int posActual = 0;
        T res = null;
        if(pos>=0 && pos<size){
            if(pos==0){
                res = ini.getValor();
                ini = ini.getSig();
                size--;
            }else{
                while(posActual != pos){
                    anterior = actual;
                    actual = actual.getSig();
                    posActual++;
                }
                res = actual.getValor();
                anterior.setSig(actual.getSig());
                size--;
            }
        }
        return res;
    }

    public int getSize(){
        return size;
    }
}
