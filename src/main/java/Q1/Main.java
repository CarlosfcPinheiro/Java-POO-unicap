package Q1;

import Q1.entity.Cachorro;
import Q1.entity.Gato;
import Q1.entity.Zoologico;
import Q1.exceptions.AgeLessThanZeroException;

public class Main {
    public static void main(String[] args){
        try{
            Gato gato = new Gato("Jeff", 12);
            Cachorro cachorro = new Cachorro("Bob", 2);

            Zoologico zoo = new Zoologico(cachorro, gato);
        } catch(AgeLessThanZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
