package Desafio3;

public class SegurancaUtils {


    public static boolean validarSenhaForte(String senha) {
        return senha.length() > 8 && senha.matches(".*\\d.*");
    }

}