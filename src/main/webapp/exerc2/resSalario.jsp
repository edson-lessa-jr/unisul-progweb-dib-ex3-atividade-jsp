<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="func" class="br.unisul.aula.exerc2.Funcionario" scope="session" />
<html>
<head>
    <title>Resposta salário</title>
</head>
<body>
<jsp:setProperty name="func" property="*" />
<header>
    <h1>Resposta do salário</h1>
</header>
<main>
    <section>
        Nome: <jsp:getProperty name="func" property="nome"/><br>
        Salário Bruto: <jsp:getProperty name="func" property="salarioBruto"/><br>
        Salário Líquido: <jsp:getProperty name="func" property="salarioLiquido"/>
    </section>
</main>
<%@include file="../rodape.jsp"%>
</body>
</html>
