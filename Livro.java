public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void abrir() { System.out.println("Abrindo o livro: " + titulo); }
    public void ler() { System.out.println("Lendo o livro: " + titulo); }
    public void fechar() { System.out.println("Fechando o livro."); }
}
