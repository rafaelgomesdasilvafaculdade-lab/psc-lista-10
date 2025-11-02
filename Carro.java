public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void ligar() { System.out.println("Carro ligado."); }
    public void acelerar() { System.out.println("Carro acelerando..."); }
    public void frear() { System.out.println("Carro freando..."); }
    public void desligar() { System.out.println("Carro desligado."); }
}
