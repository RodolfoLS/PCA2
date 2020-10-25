package persistencia;

import java.sql.Statement;

import dominio.Aluno;

public class AlunoDao extends Dao {

	public boolean cadastrar(Aluno f) throws Exception{
		boolean success = false;
		try {
			open();
			stmt = conn.prepareStatement("Insert into aluno values (?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, f.getCpf());
			stmt.setString(2, f.getNome());
			stmt.setString(3, f.getGrauescola());
			stmt.setString(4, f.getEmail());
			stmt.setString(5, f.getSenha());
			stmt.setString(6, f.getSexo());
			
			stmt.execute();
			stmt.close();
			
			success = true;
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			close();
		}
		return success;
	}
	
}
