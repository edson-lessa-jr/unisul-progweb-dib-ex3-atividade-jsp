<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Projeto</title>
</head>
<body>
<header>
    <h1>
        Cadasdtro de projeto
    </h1>
</header>
<main>
    <section>
        <form action="regProjeto" method="post">
            <label>Nome: <input type="text" name="txtNome"></label><br>
            <label>Data prevista início: <input type="date" name="dtInicio"></label><br>
            <label>Data prevista de fim: <input type="date" name="dtFim"></label><br><Br>
            <input type="submit" value="Enviar">
        </form>
    </section>
</main>
<%@include file="rodape.jsp"%>
</body>
</html>
