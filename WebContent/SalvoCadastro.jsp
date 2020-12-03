<%@page import="dominio.Aluno"%>
<%@page import="persistencia.AlunoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página - Salvar Cadastro</title>
</head>
<body>
<%
String snome = request.getParameter("nome");
String sgrauescola = request.getParameter("grauescola");
String semail = request.getParameter("email");
String ssenha = request.getParameter("senha");
String ssexo = request.getParameter("sexo");

Aluno alu = new Aluno();
alu.setNome(snome);
alu.setGrauescola(sgrauescola);
alu.setEmail(semail);
alu.setSenha(ssenha);
alu.setSexo(ssexo);

AlunoDao aluDao = new AlunoDao();
aluDao.cadastrar(alu);

%>
<h1>Salvo com Sucesso!</h1>
</body>
</html>