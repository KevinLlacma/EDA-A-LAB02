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
    
}
