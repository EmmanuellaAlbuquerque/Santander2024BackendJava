package gof.classic.singleton;

/**
 * Singleton "lazy holder".
 * @see <a href="https://stackoverflow.com/a/24018148">Ref Thread safe</a>
 */
public class SingletonLazyHolder {

    // encapsula a instância
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
