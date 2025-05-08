package Q8.entity;

public class SistemaBiblioteca {
    public static String registrarEmprestimo(MaterialBiblioteca material){
        return "TÍTULO: " + material.getTitulo() + ", PRAZO DEVOLUÇÃO: " + material.getPrazoDevolucao();
    }

    public static double calcularMulta(MaterialBiblioteca material, int diasAtraso){
        return material.calcularMulta(diasAtraso);
    }
}
