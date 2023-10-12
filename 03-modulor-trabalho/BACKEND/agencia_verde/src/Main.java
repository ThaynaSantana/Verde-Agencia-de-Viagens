import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo a Agencia de Viagens VERDE!");
        System.out.println(" --Menu de Opções--");
        System.out.println("[1] - Tela de Usuarios");
        System.out.println("[2] - Tela de Clientes");
        System.out.println("[3] - Tela de Passagens");
        System.out.println("[4] - Tela de Voos");
        System.out.println("[0] - Sair do programa");
        System.out.print("> ");
        int option = scan.nextInt();
        while(option != 0){
            switch (option){
                case 1:
                    do{
                        System.out.println("--Home de Usuarios--");
                        System.out.println("[1] - Add novo usuario");
                        System.out.println("[2] - Excluir um usuario");
                        System.out.println("[3] - Alterar um usuario");
                        System.out.println("[0] - Voltar");
                        int option_user = scan.nextInt();
                        switch (option_user){
                            case 1:
                                usuario.Add();
                                break;
                            case 2:
                                usuario.Remove();
                                break;
                            case 3:
                                usuario.Edit();
                                break;
                            case 4:
                                System.out.println("Voltando a tela inicial.");
                                break;
                        }
                    } while(option_user !=0);
                    break;
                case 2:
                    System.out.println("--Home de Clientes--");
                    break;
                case 3:
                    System.out.println("--Home de Passagens--");
                    break;
                case 4:
                    System.out.println("--Home de Voos--");
                    break;
                case 0:
                    System.out.println("Sistema Finalizado.");
                    break;
            }
            System.out.println("Bem-vindo a Agencia de Viagens VERDE!");
            System.out.println(" --Menu de Opções--");
            System.out.println("[1] - Tela de Usuarios");
            System.out.println("[2] - Tela de Clientes");
            System.out.println("[3] - Tela de Passagens");
            System.out.println("[4] - Tela de Voos");
            System.out.println("[0] - Sair do programa");
            System.out.print("> ");
        }
    }
}