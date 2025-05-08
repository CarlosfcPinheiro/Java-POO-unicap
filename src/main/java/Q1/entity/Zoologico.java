package Q1.entity;

public class Zoologico {
    private Cachorro cachorro;
    private Gato gato;

    public Zoologico(Cachorro cachorro, Gato gato) {
        this.cachorro = cachorro;
        this.gato = gato;
    }

    public void emitirSom(){
        cachorro.som();
        gato.som();
    }
}
