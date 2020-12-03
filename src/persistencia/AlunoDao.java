package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Aluno;

public class AlunoDao extends Dao {

	private Connection conn = Dao.getConnection();
	
	public void cadastrar(Aluno a){
		
		String sql = "INSERT INTO ALUNO (nome,grauescola,email,senha,sexo) values (?,?,?,?,?)";
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getGrauescola());
			stmt.setString(3, a.getEmail());
			stmt.setString(4, a.getSenha());
			stmt.setString(5, a.getSexo());
	
			stmt.execute();
			stmt.close();
			
			System.out.println("Cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro - "+e.getMessage());
		}
	}

	
	public void alterar(Aluno a){
		
		String sql = "UPDATE ALUNO SET NOME = ?, GRAUESCOLA = ?, EMAIL = ?, SENHA = ?, SEXO = ? where id = ? ";
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getGrauescola());
			stmt.setString(3, a.getEmail());
			stmt.setString(4, a.getSenha());
			stmt.setString(5, a.getSexo());
			stmt.setInt(6, a.getId());
	
			stmt.execute();
			stmt.close();
			
			System.out.println("Alterado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro - "+e.getMessage());
		}
	}
	
	public void deletar(Aluno a){
		
		String sql = "DELETE FROM ALUNO WHERE id = ? ";
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, a.getId());
	
			stmt.execute();
			stmt.close();
			
			System.out.println("Excluido com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro - "+e.getMessage());
		}
	}
	
	public List<Aluno> buscarTodos(Aluno a){
		
		String sql = "SELECT * FROM ALUNO";
		List<Aluno> lista = new ArrayList<Aluno>();
		
		try {
		
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet resultados = stmt.executeQuery();
			while(resultados.next()) {
				Aluno alu = new Aluno();
				alu.setId(resultados.getInt("id"));
				alu.setNome(resultados.getString("nome"));
				alu.setGrauescola(resultados.getString("grauescola"));
				alu.setEmail(resultados.getString("email"));
				alu.setSenha(resultados.getString("senha"));
				alu.setSexo(resultados.getString("sexo"));
				
				lista.add(alu);
				
			}
			
		}catch (SQLException e) {
			System.out.println("Erro - "+e.getMessage());
		}
		return lista;
	}
}
