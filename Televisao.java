public class Televisao {
    private String marca;
    private int tamanho;

    public Televisao(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void ligar() { System.out.println("TV " + marca + " ligada."); }
    public void trocarCanal(int canal) { System.out.println("Trocando para o canal " + canal); }
    public void desligar() { System.out.println("TV desligada."); }
}
