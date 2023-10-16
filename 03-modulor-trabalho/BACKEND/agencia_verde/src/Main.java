import DAO.ClienteDAO;
import DAO.PassagemDAO;
import DAO.UsuarioDAO;
import entity.Cliente;
import entity.Passagem;
import entity.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        String nome, cargo, password, tel;

        do {
            System.out.println("Bem-vindo a Agencia de Viagens VERDE!");
            System.out.println(" --Menu de Opções--");
            System.out.println("[1] - Tela de Usuarios");
            System.out.println("[2] - Tela de Clientes");
            System.out.println("[3] - Tela de Passagens");
            System.out.println("[4] - Tela de Voos");
            System.out.println("[0] - Sair do programa");
            System.out.print("> ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    int option_user;
                    do {
                        System.out.println("--Home de Usuarios--");
                        System.out.println("[1] - Add novo usuario");
                        System.out.println("[2] - Excluir um usuario");
                        System.out.println("[3] - Alterar um usuario");
                        System.out.println("[4] - Buscar um usuario");
                        System.out.println("[0] - Voltar");
                        System.out.print("> ");
                        option_user = scan.nextInt();
                        scan.nextLine(); // Consume the newline character

                        switch (option_user) {
                            case 1:
                                System.out.println(" # Cadastro Usuario #");
                                System.out.println("Insira o nome do novo usuario: ");
                                nome = scan.nextLine();
                                System.out.println("Insira a senha do novo usuario: ");
                                password = scan.nextLine();
                                System.out.println("Insira o cargo do novo usuario: ");
                                cargo = scan.nextLine();
                                try {
                                    Usuario usuario = new Usuario(nome, password, cargo);
                                    new UsuarioDAO().cadastrar(usuario);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                System.out.println(" # Excluir Usuario # ");
                                System.out.println("Digite o nome do usuario para ser excluido: ");
                                nome = scan.nextLine();
                                System.out.println("Tem certeza que deseja EXCLUIR este usuario?: [0 - Não | 1 - Sim]");
                                int confirm = scan.nextInt();
                                if(confirm == 0){
                                    System.out.println("Nenhum usuario foi excluido.");
                                } else if (confirm == 1) {
                                    new UsuarioDAO().remover(nome);

                                } else {
                                    System.out.println("Opcao invalida.");
                                }
                                break;
                            case 3:
                                System.out.println(" # Edição de Usuario #");
                                System.out.println("Insira o nome do usuario para edição dos seus dados: ");
                                String nome_antigo = scan.nextLine();
                                System.out.println("Insira o novo nome do usuario: ");
                                nome = scan.nextLine();
                                System.out.println("Insira a nova senha do usuario: ");
                                password = scan.nextLine();
                                System.out.println("Insira o novo cargo do usuario: ");
                                cargo = scan.nextLine();
                                try {
                                    Usuario usuario = new Usuario(nome,password,cargo);
                                    new UsuarioDAO().editar(usuario, nome_antigo);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                System.out.println(" # Buscar Usuario #");
                                System.out.println("Insira o nome do usuario para buscar os dados do mesmo: ");
                                nome = scan.nextLine();
                                try {
                                    new UsuarioDAO().buscar(nome);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 0:
                                System.out.println("Voltando a tela inicial.");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (option_user != 0);
                    break;
                case 2:
                    System.out.println("--Home de Clientes--");
                    int option_cli;
                    do {
                        System.out.println("[1] - Add novo cliente");
                        System.out.println("[2] - Excluir um cliente");
                        System.out.println("[3] - Alterar um cliente");
                        System.out.println("[4] - Buscar um cliente");
                        System.out.println("[0] - Voltar");
                        System.out.print("> ");
                        option_cli = scan.nextInt();
                        scan.nextLine();

                        switch (option_cli) {
                            case 1:
                                System.out.println(" # Cadastro cliente #");
                                System.out.println("Insira o nome do novo cliente: ");
                                nome = scan.nextLine();
                                System.out.println("Insira a senha do novo cliente: ");
                                password = scan.nextLine();
                                System.out.println("Insira o telefone do novo cliente: ");
                                tel = scan.nextLine();
                                try {
                                    Cliente cliente = new Cliente(nome, password, tel);
                                    new ClienteDAO().cadastrar(cliente);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                System.out.println(" # Excluir cliente # ");
                                System.out.println("Digite o nome do cliente para ser excluido: ");
                                nome = scan.nextLine();
                                System.out.println("Tem certeza que deseja EXCLUIR este cliente?: [0 - Não | 1 - Sim]");
                                int confirm = scan.nextInt();
                                if(confirm == 0){
                                    System.out.println("Nenhum cliente foi excluido.");
                                } else if (confirm == 1) {
                                    new ClienteDAO().remover(nome);
                                } else {
                                    System.out.println("Opcao invalida.");
                                }
                                break;
                            case 3:
                                System.out.println(" # Edição de cliente #");
                                System.out.println("Insira o nome do cliente para edição dos seus dados: ");
                                String nome_antigo = scan.nextLine();
                                System.out.println("Insira o novo nome do cliente: ");
                                nome = scan.nextLine();
                                System.out.println("Insira a nova senha do cliente: ");
                                password = scan.nextLine();
                                System.out.println("Insira o novo telefone do cliente: ");
                                tel = scan.nextLine();
                                try {
                                    Cliente cliente = new Cliente(nome,password,tel);
                                    new ClienteDAO().editar(cliente, nome_antigo);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                System.out.println(" # Buscar cliente #");
                                System.out.println("Insira o nome do cliente para buscar os dados do mesmo: ");
                                nome = scan.nextLine();
                                try {
                                    new ClienteDAO().buscar(nome);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 0:
                                System.out.println("Voltando a tela inicial.");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (option_cli != 0);
                    break;
                case 3:
                    System.out.println("--Home de Passagens--");
                    int option_passagem;
                    do{
                        System.out.println("1 - Cadastro de nova passagem");
                        System.out.println("2 - Excluir uma passagem");
                        System.out.println("3 - Alterar uma passagem");
                        System.out.println("4 - Buscar uma passagem");
                        System.out.println("0 - Voltar");
                        System.out.print("> ");
                        option_passagem = scan.nextInt();

                        switch (option_passagem){
                            case 1:
                                System.out.println(" # Cadastro Passagem #");
                                System.out.println("Insira o número do cliente que se refere a nova passagem: ");
                                int cliente = scan.nextInt();
                                System.out.println("Insira o número do voo que se refere a nova passagem: ");
                                int voo = scan.nextInt();
                                System.out.println("Insira a data da venda da passagem: [Exemplo: 31/12/2030 , esse é o padrão aceito]");
                                String dataVenda = scan.nextLine();
                                System.out.println("Insira o horario da venda da passagem: [Exemplo: 19:28 , esse é o padrão aceito]");
                                String horaVenda = scan.nextLine();
                                System.out.println("Insira o codigo da passagem: [Atenção gere este código pelo gerador verde]");
                                String codigo = scan.nextLine();
                                System.out.println("Insira o exato preço da passagem vendido: [Exemplo: 505,90]");
                                long preco = scan.nextLong();

                                try{
                                    Passagem passagem = new Passagem(cliente,voo,dataVenda,horaVenda,codigo,preco);
                                    PassagemDAO.cadastrar(passagem);
                                } catch (Exception e){
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                // Remove
                                System.out.println(" # Excluir passagem # ");
                                System.out.println("Digite o codigo da passagem para exclusão: ");
                                codigo = scan.nextLine();
                                System.out.println("Tem certeza que deseja excluir a passagem V-"+ codigo+" ?");
                                System.out.println("[0 - Não | 1 - Sim]");
                                int confirm = scan.nextInt();
                                if(confirm == 1){
                                    try {
                                        PassagemDAO.remover(codigo);
                                    } catch (Exception e){
                                        e.printStackTrace();
                                    }
                                } else if(confirm == 0){
                                    System.out.println("Nenhuma passagem foi excluida.");
                                } else {
                                    System.out.println("Opção invalida");
                                }
                            case 3:
                                // edit
                                System.out.println(" # Edição passagem #");
                                System.out.println("Insira o codigo da passagem a ser editada: ");
                                String antigo_codigo = scan.nextLine();
                                System.out.println("Insira o novo numero do cliente: ");
                                cliente = scan.nextInt();
                                System.out.println("Insira o novo numero do voo: ");
                                voo = scan.nextInt();
                                System.out.println("Insira a nova data da venda da passagem: ");
                                dataVenda = scan.nextLine();
                                System.out.println("Insira o novo horario da venda da passagem: ");
                                horaVenda = scan.nextLine();
                                System.out.println("Insira o novo codigo da passagem: ");
                                codigo = scan.nextLine();
                                System.out.println("Insira o novo preço que foi vendida a passagem: ");
                                preco =  scan.nextLong();

                                Passagem passagem = new Passagem(cliente, voo, dataVenda,horaVenda, codigo, preco);
                                try {
                                    PassagemDAO.editar(passagem, antigo_codigo);
                                } catch (Exception e){
                                    e.printStackTrace();
                                }
                            case 4:
                                // buscar
                                System.out.println(" # Busca passagem #");
                                System.out.println("Insira o codigo da passagem para busca-la: ");
                                codigo = scan.nextLine();
                                try{
                                    PassagemDAO.buscar(codigo);
                                } catch (Exception e){
                                    e.printStackTrace();
                                }
                            case 0:
                                System.out.println("Voltando a tela inicial.");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    } while (option_passagem != 0);
                    break;
                case 4:
                    System.out.println("--Home de Voos--");
                    // Implement flight-related logic here
                    break;
                case 0:
                    System.out.println("Sistema Finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 0);
        scan.close();
    }
}
