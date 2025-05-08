package Q14.entity;

public class ExportadorCSV implements ExportadorRelatorio{
    @Override
    public String exportar(String titulo, String conteudo){
        return "Arquivo " + titulo + " e conteúdo " + conteudo + " exportado para CSV";
    }
}
