package Q17.entity;

public interface Emprestavel {
    boolean emprestar(Usuario usuario);

    boolean devolver(Usuario usuario);
}
