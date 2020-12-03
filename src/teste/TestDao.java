package teste;

import java.util.List;

import dominio.Aluno;
import persistencia.AlunoDao;

public class TestDao {

	public static void main (String[] args) throws Exception {
		testCadastrar();
		//testAlterar();
		//testExcluir();
		//testbuscarTodos();
	}
	
	
	public static void testCadastrar(){
		Aluno alu = new Aluno();
		alu.setNome("Maria");
		alu.setGrauescola("Médio");
		alu.setEmail("Mariada@gmail.com");
		alu.setSenha("6969");
		alu.setSexo("F");
		
		AlunoDao aluDao = new AlunoDao();
		aluDao.cadastrar(alu);
	}

	/*public static void testAlterar() {
		Aluno alu = new Aluno();
		alu.setNome("Rodolfo");
		alu.setGrauescola("Faculdade");
		alu.setEmail("Rodolfoo@gmail.com");
		alu.setSenha("6869");
		alu.setSexo("M");
		alu.setId(3);
		
		AlunoDao aluDao = new AlunoDao();
		aluDao.alterar(alu);
		}
		*/
	
	/*public static void testExcluir() {
		Aluno alu = new Aluno();
		alu.setId(1);
		
		AlunoDao aluDao = new AlunoDao();
		aluDao.deletar(alu);
	
	}*/
	
	public static void testbuscarTodos() {
		Aluno alu = new Aluno();
		AlunoDao aluDao = new AlunoDao();
		List<Aluno> listaResultado = aluDao.buscarTodos(alu);
		
		for(Aluno a:listaResultado){
			System.out.println("Id: "+a.getId()+" Nome: "+a.getNome()+" GrauEscolar: "+a.getGrauescola()+" Email: "+a.getEmail()+" Senha: "+a.getSenha()+" Sexo: "+a.getSexo());
		}
	}
}