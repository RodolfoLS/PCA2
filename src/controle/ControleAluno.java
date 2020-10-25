package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Aluno;
import persistencia.AlunoDao;

/**
 * Servlet implementation class Servlet
 */
@WebServlet({"/controlealuno", "/cadastraralu.html"})
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ControleAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void execute(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
			try {
				String url = request.getServletPath();
				if(url.equalsIgnoreCase("/cadastroaluno.html")){
					cadastrar(request,response);
				}else {
					response.sendRedirect("/");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String cpf = request.getParameter("cpf");
			String nome = request.getParameter("nome");
			String grauescola = request.getParameter("grauescola");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			String sexo = request.getParameter("sexo");
			
			Aluno a = new Aluno();
			a.setCpf(cpf);
			a.setNome(nome);
			a.setGrauescola(grauescola);
			a.setEmail(email);
			a.setSenha(senha);
			a.setSexo(sexo);
			
			//Enviar para o banco de dados
			new AlunoDao().cadastrar(a);
			
			request.setAttribute("msg","<div class='alert alert-success'>Cliente Cadastrado!</div>");
					
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "<div class='alert alert-danger'>Cliente não Cadastrado!</div>");
		}finally {
			request.getRequestDispatcher("cadastraralu.jsp").forward(request, response);
		}
		
	}

}
