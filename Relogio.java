public class Relogio {
    private String marca;
    private String tipo;

    public Relogio(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public void marcarHora() { System.out.println("O relógio marca 14:30h."); }
    public void despertar() { System.out.println("O alarme está tocando!"); }
}
