import java.util.Random;

public class DiscandoTelefone {
    public static void main(String[] args) {
        System.out.println("Discando...");

         do {
            System.out.println("Telefone tocando");
         } while(tocando());

         System.out.println("Alô");
    }

    public static boolean tocando() {
        System.out.println(" trrrim-trrrim...");
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
