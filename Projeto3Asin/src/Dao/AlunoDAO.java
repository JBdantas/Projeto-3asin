package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import To.AlunoTO;
import Factory.ConnectionFactory;

public class AlunoDAO {

	public void incluir(AlunoTO to) {
		String sqlInsert = "INSERT INTO aluno(matricula, nome, endereco, telefone, email, rg, cpf, login , senha)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, to.getMatricula());
			stm.setString(2, to.getNome());
			stm.setString(3, to.getEndereco());
			stm.setString(4, to.getTelefone());
			stm.setString(5, to.getEmail());
			stm.setString(6, to.getRg());
			stm.setString(7, to.getCpf());
			stm.setString(8, to.getLogin());
			stm.setString(9, to.getSenha());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(AlunoTO to) {
		String sqlUpdate = "UPDATE aluno SET nome=?, endereco=?, telefone=?, email=?, rg=?, cpf=?, login=?, "
				+ "senha=? WHERE matricula=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, to.getMatricula());
			stm.setString(2, to.getNome());
			stm.setString(3, to.getEndereco());
			stm.setString(4, to.getTelefone());
			stm.setString(5, to.getEmail());
			stm.setString(6, to.getRg());
			stm.setString(7, to.getCpf());
			stm.setString(8, to.getLogin());
			stm.setString(9, to.getSenha());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(AlunoTO to) {
		String sqlDelete = "DELETE FROM aluno WHERE matricula = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, to.getMatricula());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public AlunoTO carregar(int id) {
		AlunoTO to = new AlunoTO();
		String sqlSelect = "SELECT nome, endereco, telefone, email, rg, cpf, login"
				+ " FROM aluno WHERE aluno.matricula = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, id);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					to.setNome(rs.getString("nome"));
					to.setEndereco(rs.getString("endereco"));
					to.setTelefone(rs.getString("telefone"));
					to.setEmail(rs.getString("email"));
					to.setRg(rs.getString("rg"));
					to.setCpf(rs.getString("cpf"));
					to.setLogin(rs.getString("login"));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return to;
	}
}
