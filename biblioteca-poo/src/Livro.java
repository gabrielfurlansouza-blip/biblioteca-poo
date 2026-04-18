public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(int id, String titulo, String autor, int quantidade) {
        if (titulo == null || titulo.isEmpty()) throw new IllegalArgumentException();
        if (quantidade < 0) throw new IllegalArgumentException();
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public boolean disponivel() { return quantidade > 0; }

    public void emprestar() {
        if (!disponivel()) throw new IllegalArgumentException();
        quantidade--;
    }

    public void devolver() { quantidade++; }

    public String getTitulo() { return titulo; }
}
