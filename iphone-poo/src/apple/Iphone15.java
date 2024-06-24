package apple;

public class Iphone15 extends Iphone {
    public Iphone15(String modelo, String processador) {
        super(modelo, processador);
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto com ajustes de IA...");
    }
}
