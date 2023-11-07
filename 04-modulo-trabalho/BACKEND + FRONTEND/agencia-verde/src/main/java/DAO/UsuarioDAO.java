    package DAO;

    import conexao.ModuloConexao;
    import com.example.verde.entity.Usuario;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;

    public class UsuarioDAO {
        Connection connection = null;
        PreparedStatement ps = null;

        public void cadastrar(Usuario usuario) {
            String sql = "INSERT INTO usuario(nome, senha, cargo) VALUES(?, ?, ?)";

            try {
                connection = ModuloConexao.conector();
                if (connection == null) {
                    System.err.println("Failed to establish a database connection.");
                    return;
                }

                ps = connection.prepareStatement(sql);

                ps.setString(1, usuario.getNome());
                ps.setString(2, usuario.getSenha());
                ps.setString(3, usuario.getCargo());

                ps.executeUpdate();
                System.out.println("Novo usuario cadastrado com sucesso.");
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

        public Usuario buscar(String nome) {
            String sql = "SELECT * FROM usuario WHERE nome = ?";
            Usuario usuario = null;

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
                    usuario = new Usuario(
                            resultSet.getString("nome"),
                            resultSet.getString("senha"),
                            resultSet.getString("cargo")
                    );
                    System.out.println("| nome | senha | cargo |");
                    System.out.println("| " + usuario.getNome() + " | " + usuario.getSenha() + " | " + usuario.getCargo() + " | ");
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

            return usuario;
        }

        public void editar(Usuario usuario, String nomeAntigo) {
            String sql = "UPDATE usuario SET nome=?, senha=?, cargo=? WHERE nome=?";

            try {
                connection = ModuloConexao.conector();
                if (connection == null) {
                    System.err.println("Failed to establish a database connection.");
                    return;
                }

                ps = connection.prepareStatement(sql);
                ps.setString(1, usuario.getNome());
                ps.setString(2, usuario.getSenha());
                ps.setString(3, usuario.getCargo());
                ps.setString(4, nomeAntigo);

                ps.executeUpdate();
                System.out.println("Usuario editado com sucesso.");
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
            String sql = "DELETE FROM usuario WHERE nome=?";

            try {
                connection = ModuloConexao.conector();
                if (connection == null) {
                    System.err.println("Failed to establish a database connection.");
                    return;
                }

                ps = connection.prepareStatement(sql);
                ps.setString(1, nome);

                ps.executeUpdate();
                System.out.println("Usuario excluido com sucesso.");
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
