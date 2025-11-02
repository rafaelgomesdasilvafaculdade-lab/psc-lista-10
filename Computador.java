public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void ligar() { System.out.println("Computador ligado."); }
    public void executarPrograma(String programa) { System.out.println("Executando " + programa); }
    public void desligar() { System.out.println("Computador desligado."); }
}
