package Q14.entity;

public class SistemaRelatorios {
    public static String exportarRelatorio(ExportadorRelatorio exportador, String titulo, String conteudo){
        return exportador.exportar(titulo, conteudo);
    }
}
