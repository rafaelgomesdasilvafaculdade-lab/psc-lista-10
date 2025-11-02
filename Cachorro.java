public class Cachorro extends Animal {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca, int idade, double peso, String cor) {
        super("Cachorro", idade, peso, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public void latir() { System.out.println(nome + " está latindo!"); }
    public void brincar() { System.out.println(nome + " está brincando."); }
}
