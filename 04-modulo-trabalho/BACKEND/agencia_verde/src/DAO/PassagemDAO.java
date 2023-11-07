package DAO;

import conexao.ModuloConexao;
import entity.Passagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PassagemDAO {
    static Connection connection = null;
    static PreparedStatement  ps = null;

    public static void cadastrar(Passagem passagem) {
        String sql = "INSERT INTO passagem (cliente, voo, dataVenda, horaVenda, codigo, preco) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return;
            }

            ps = connection.prepareStatement(sql);

            ps.setInt(1, passagem.getCliente());
            ps.setInt(2, passagem.getVoo());
            ps.setString(3, passagem.getDataVenda());
            ps.setString(4, passagem.getHoraVenda());
            ps.setString(5, passagem.getCodigo());
            ps.setLong(6, passagem.getPreco());

            ps.executeUpdate();
            System.out.println("Nova passagem cadastrada com sucesso.");
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

    public static Passagem buscar(String codigo) {
        String sql = "SELECT * FROM passagem WHERE codigo = ?";
        Passagem passagem = null;

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return null;
            }

            ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                passagem = new Passagem(
                        resultSet.getInt("cliente"),
                        resultSet.getInt("voo"),
                        resultSet.getString("dataVenda"),
                        resultSet.getString("horaVenda"),
                        resultSet.getString("codigo"),
                        resultSet.getLong("preco")
                );
                System.out.println("| cliente | voo | dataVenda | horaVenda | codigo | preco |");
                System.out.println("| " + passagem.getCliente() + " | " + passagem.getVoo() + " | " + passagem.getDataVenda() + " | " + passagem.getHoraVenda() + " | " + passagem.getCodigo() + " | " + passagem.getPreco() + " | ");
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

        return passagem;
    }

    public static void editar(Passagem passagem, String codigoAntigo) {
        String sql = "UPDATE passagem SET cliente=?, voo=?, dataVenda=?, horaVenda=?, codigo=?, preco=? WHERE codigo=?";

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return;
            }

            ps = connection.prepareStatement(sql);
            ps.setInt(1, passagem.getCliente());
            ps.setInt(2, passagem.getVoo());
            ps.setString(3, passagem.getDataVenda());
            ps.setString(4, passagem.getHoraVenda());
            ps.setString(5, passagem.getCodigo());
            ps.setLong(6, passagem.getPreco());
            ps.setString(7, codigoAntigo);

            ps.executeUpdate();
            System.out.println("Passagem editada com sucesso.");
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

    public static void remover(String codigo) {
        String sql = "DELETE FROM passagem WHERE codigo=?";

        try {
            connection = ModuloConexao.conector();
            if (connection == null) {
                System.err.println("Failed to establish a database connection.");
                return;
            }

            ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);

            ps.executeUpdate();
            System.out.println("Passagem excluída com sucesso.");
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
