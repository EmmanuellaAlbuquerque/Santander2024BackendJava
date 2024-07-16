package gof.classic.singleton;

/**
 * Singleton "apressado":
 * Já cria a instância de imediato.
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
