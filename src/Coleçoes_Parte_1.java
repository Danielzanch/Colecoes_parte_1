import java.util.Set;
import java.util.TreeSet;

public class Coleçoes_Parte_1 {
    public static void main(String args[]) {
        ListaDeNomeOrganizada();
    }

    private static void ListaDeNomeOrganizada() {
        int i = 1;
        Set<String> nomes = new TreeSet<>();
        nomes.add("Mariana Ferreira");
        nomes.add("Pedro Costa");
        nomes.add("Ana Santos");
        nomes.add("Ricardo Oliveira");
        nomes.add("Sofia Pereira");
        nomes.add("Tiago Carvalho");
        nomes.add("Marta Gomes");
        nomes.add("Miguel Rodrigues");
        nomes.add("Inês Matos");
        nomes.add("Bruno Sousa");
        nomes.add("Bruna Zanchetta");
        nomes.add("Catarina Marques");

        System.out.println(" ");
        for (String nome : nomes) {
            System.out.println(i + " - " + nome);
            i = i + 1;
        }
    System.out.println(" ");
    }
}
