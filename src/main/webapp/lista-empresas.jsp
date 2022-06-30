<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciador com Servlet e JSP</title>
</head>
<body>
	<h2>Lista de empresas: <br></h2>
	
		<c:if test="${ not empty empresa }">
			<h1>${ empresa }</h1>
			<p>Nova empresa ${ empresa } foi cadastrada no sistema com sucesso!</p>
		</c:if>
		
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			
			<li>
				${empresa.nome}:
				<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			</li>	
		</c:forEach>
	</ul>
</body>
</html>