package Q10.entity;

public abstract class MembroEquipe {
    private String nome;
    private String projeto;

    public MembroEquipe(String nome, String projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public abstract String trabalhar();

    public String obterDetalhes(){
        return "NOME: " + nome + ", PROJETO: " + projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
