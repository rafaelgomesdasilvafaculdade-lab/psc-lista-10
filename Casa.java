public class Casa {
    private String endereco;
    private String cor;
    private int quartos;

    public Casa(String endereco, String cor, int quartos) {
        this.endereco = endereco;
        this.cor = cor;
        this.quartos = quartos;
    }

    public void abrigarPessoa(Pessoa p) {
        System.out.println(p.getNome() + " está morando na casa " + cor + " localizada em " + endereco);
    }
}
