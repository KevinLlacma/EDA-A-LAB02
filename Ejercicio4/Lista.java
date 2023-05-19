import java.util.*;
public class Lista {
    ArrayList<String> listaA;
    public Lista(String a){
        listaA = new ArrayList<String>();
    }
    public boolean add(String element){
        return listaA.add(element);
    }
    public boolean addAll(Collection<? extends String>collection){
        return listaA.addAll(listaA);
    }
    public boolean addAll(int index, Collection<? extends String>collection){
        return listaA.addAll(index,listaA);
    }
    public boolean removeAll(Collection<? extends String>collection){
        return listaA.removeAll(listaA);
    }
    public void clear(){
        listaA.clear();
    }

}
