<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de pessoas</title>
</head>
<body>
<header>
    <h1>Cadastro de pessoas</h1>
</header>
<main>
    <section>
        <form action="regPessoa" method="post">
            <label>Nome: <input type="text" name="txtNome"></label><br>
            <label>Cargo: <input type="text" name="txtCargo"></label><br>
            <br>
            <input type="submit" value="Enviar">
        </form>
    </section>
</main>
<%@include file="rodape.jsp"%>
</body>
</html>
