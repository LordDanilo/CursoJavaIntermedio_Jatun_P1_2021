public class ColaPrioridad<T extends Comparable> extends Cola<T>{
    @Override
    public void offer(T nuevoDato){
        boolean agregado = false;
        if(cola.estaVacia()){
            cola.add(nuevoDato);
            agregado = true;
        }else{
            for(int pos=0; pos<cola.size() && !agregado; pos++){
                T actual = cola.get(pos);
                if(nuevoDato.compareTo(actual) < 0){
                    cola.add(nuevoDato, pos);
                    agregado = true;
                }
            }
            if(!agregado){
                cola.add(nuevoDato);
                agregado = true;
            }
        }
    }
}
