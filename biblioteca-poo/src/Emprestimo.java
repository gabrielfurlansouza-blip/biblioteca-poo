public class Emprestimo {
    private int id;
    private Aluno aluno;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int id, Aluno aluno, Livro livro, String data) {
        this.id = id;
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = data;
        livro.emprestar();
    }

    public void devolver(String data) {
        livro.devolver();
        dataDevolucao = data;
    }

    public boolean aberto() { return dataDevolucao == null; }

    public Livro getLivro() { return livro; }
    public Aluno getAluno() { return aluno; }
}
