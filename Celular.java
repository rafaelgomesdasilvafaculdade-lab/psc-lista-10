public class Celular {
    private String marca;
    private String modelo;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar() { System.out.println("Ligando celular " + modelo); }
    public void tirarFoto() { System.out.println("Tirando uma foto..."); }
    public void tocarMusica() { System.out.println("Tocando música..."); }
}
