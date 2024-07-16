package gof.classic.singleton;

/**
 * Singleton "preguiçoso":
 * Não disponibiliza em primeiro momento a instância para o usuário
 */
public class SingletonLazy {

    // OBS: Instância estática
    private static SingletonLazy instancia;

    // OBS: construtor privado
    private SingletonLazy() {
        super();
    }

    // OBS: método acessor public
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
