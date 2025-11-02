public class Bicicleta {
    private String marca;
    private String cor;

    public Bicicleta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public void pedalar() { System.out.println("Pedalando a bicicleta " + marca); }
    public void frear() { System.out.println("Freando a bicicleta."); }
}
