<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="func" class="br.unisul.aula.exerc2.Funcionario" scope="session" />
<html>
<head>
    <title>Cadastro funcionário</title>
</head>
<body>
<header>
    <h1>Cadastro funcionário</h1>
</header>
<main>
    <section>
        <form action="resSalario.jsp" method="post">
            <label>Nome: <input type="text" name="nome" id=""></label><br>
            <label>Salário Bruto: <input type="number" name="salarioBruto" min="0" step="0.01"></label><br><br>
            <input type="submit" value="Enviar">
        </form>
    </section>
</main>
<%@include file="../rodape.jsp"%>
</body>
</html>
