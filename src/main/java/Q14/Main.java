package Q14;

import Q14.entity.ExportadorPDF;
import Q14.entity.SistemaRelatorios;

public class Main {
    public static void main(String[] args) {
        ExportadorPDF exp = new ExportadorPDF();
        exp.exportar("Spring Start Here", "Livro sobre Spring");

        String info = SistemaRelatorios.exportarRelatorio(exp, "Sapies", "Livro Sapiens de Yuval Noah Harari");
        System.out.println(info);
    }
}
