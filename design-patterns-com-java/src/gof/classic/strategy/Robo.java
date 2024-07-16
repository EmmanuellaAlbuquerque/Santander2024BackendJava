package gof.classic.strategy;

public class Robo {

    private Comportamento comportamento; // Strategy

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
