package Desafio3;

public class Sistema {
    public static void main(String[] args) {
        Administrador admin = new Administrador("William", "william@email.com", "senha123");

        System.out.println(admin.nome);

        admin.exibirUsuario();

        boolean autenticado = admin.autenticar("senha123");
        System.out.println("Autenticado: " + autenticado);

        String novaSenha = "novaSenha123";
        if (SegurancaUtils.validarSenhaForte(novaSenha)) {
            admin.redefinirSenha(novaSenha);
            System.out.println("Senha redefinida com sucesso.");
        } else {
            System.out.println("Senha fraca, escolha outra.");
        }

        boolean autenticadoNova = admin.autenticar("novaSenha123");
        System.out.println("Autenticado com nova senha: " + autenticadoNova);
    }
}
