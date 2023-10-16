package DAO;

import conexao.ModuloConexao;
import entity.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    Connection connection = null;
    PreparedStatement ps = null;

    public void cadastrar(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, senha, tel) VALUES (?, ?, ?)";

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return;
            }

            ps = connection.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSenha());
            ps.setString(3, cliente.getTel());

            ps.executeUpdate();
            System.out.println("Novo cliente cadastrado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Cliente buscar(String nome) {
        String sql = "SELECT * FROM cliente WHERE nome = ?";
        Cliente cliente = null;

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return null;
            }

            ps = connection.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                cliente = new Cliente(
                        resultSet.getString("nome"),
                        resultSet.getString("senha"),
                        resultSet.getString("tel")
                );
                System.out.println("| nome | senha | telefone |");
                System.out.println("| " + cliente.getNome() + " | " + cliente.getSenha() + " | " + cliente.getTel() + " | ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return cliente;
    }

    public void editar(Cliente cliente, String nomeAntigo) {
        String sql = "UPDATE cliente SET nome=?, senha=?, tel=? WHERE nome=?";

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return;
            }

            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSenha());
            ps.setString(3, cliente.getTel());
            ps.setString(4, nomeAntigo);

            ps.executeUpdate();
            System.out.println("Cliente editado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void remover(String nome) {
        String sql = "DELETE FROM cliente WHERE nome=?";

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return;
            }

            ps = connection.prepareStatement(sql);
            ps.setString(1, nome);

            ps.executeUpdate();
            System.out.println("Cliente excluído com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
