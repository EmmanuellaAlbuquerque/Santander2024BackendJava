public class PlanoOperadora {
    public static void main(String[] args) {
        char plano = 'T'; 
        
        // sem o uso de break e sem o default, podemos usar a ordem decrescente
        // de grandeza para garatir que um usuário do Plano T, tenha
        // por exemplo .:  5GB Youtube + Whats e Instagram grátis + 100 minutos de ligação
        
        // Estrutura Complemantar sem break e default
        switch (plano) {
            case 'T': {
                System.out.println("5GB Youtube");
            }
            case 'M': {
                System.out.println("Whats e Instagram grátis");
            }
            case 'B': {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
