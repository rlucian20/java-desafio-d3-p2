import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas= new ArrayList<>();

        pessoas.add(new Pessoa("Davi", 12));
        pessoas.add(new Pessoa("Maria", 32));
        pessoas.add(new Pessoa("Joao", 23));
        for (Pessoa pessoa : pessoas) {
            System.out.print(pessoa.getNome() + " - " + pessoa.getIdade() + " anos");
        }

        System.out.println("Pessoas acima de 18 anos");

        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18)
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .forEach(pessoa -> System.out.println(pessoa.getNome() + " " + pessoa.getIdade()));
    }

}