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
    public boolean equals(Object obj){
        return listaA.equals(listaA);
    }
    public String get (int index){
        return listaA.get(index);
    }
    public String set (int index, String element){
        return listaA.set(index,element);
    }
    public void add(int index, String element){
        listaA.add(index,element);
    }
    public int indexOf(String element){
        return listaA.indexOf(element);
    }
    public int lastIndexOf(String element){
        return listaA.lastIndexOf(element);
    }
    public List<String> subList(int fromIndex, int toIndex){
        return listaA.subList(fromIndex,toIndex);
    }
}
