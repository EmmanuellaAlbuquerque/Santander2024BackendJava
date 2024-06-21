public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("XXXXXYYY");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep é inválido!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "XXXXX-YYY";
    }
}
