public class Animal {
    private String especie;
    private int idade;
    private double peso;
    private String cor;

    public Animal(String especie, int idade, double peso, String cor) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

    public void correr() { System.out.println(especie + " está correndo."); }
    public void comer() { System.out.println(especie + " está comendo."); }
    public void dormir() { System.out.println(especie + " está dormindo."); }
}
