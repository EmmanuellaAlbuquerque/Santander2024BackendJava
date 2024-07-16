package gof.classic.singleton;

/**
 * Result:
 * gof.classic.singleton.SingletonLazy@1b28cdfa
 * gof.classic.singleton.SingletonLazy@1b28cdfa
 * <p>
 * gof.classic.singleton.SingletonEager@7229724f
 * gof.classic.singleton.SingletonEager@7229724f
 * <p>
 * gof.classic.singleton.SingletonLazyHolder@776ec8df
 * gof.classic.singleton.SingletonLazyHolder@776ec8df
 */
public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
