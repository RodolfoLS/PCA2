<%@page import="java.util.List"%>
<%@page import="dominio.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

//List<Aluno> lista = aluDao.buscarTodos(alu);
List<Aluno> listaResultado = (List<Aluno>)request.getAttribute("lista");


for(Aluno a:listaResultado){
	System.out.println("Id: "+a.getId()+" Nome: "+a.getNome()+" GrauEscolar: "+a.getGrauescola()+" Email: "+a.getEmail()+" Senha: "+a.getSenha()+" Sexo: "+a.getSexo());
}

%>
</body>
</html>