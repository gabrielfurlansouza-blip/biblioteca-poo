import java.util.*;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro(1,"Java","Autor",2);
        Aluno a = new Aluno(1,"Carlos");

        Emprestimo e = new Emprestimo(1,a,l,"2026-04-17");

        List<Emprestimo> lista = new ArrayList<>();
        lista.add(e);

        for (Emprestimo x: lista) {
            if (x.aberto())
                System.out.println(x.getAluno().getNome()+" com "+x.getLivro().getTitulo());
        }

        e.devolver("2026-04-18");
    }
}
