<%@ page import="br.unisul.aula.exerc3.model.Pessoa" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Consultar</title>
</head>
<body>
    <header><h1>Consulta por nome de pssoa</h1></header>
<main>
    <section>
        <form action="regPessoa" method="get">
            <input type="hidden" name="acao" value="3">
            <label>Nome: <input type="text" name="txtNome"></label><br>
            <input type="submit" value="Enviar">
        </form>
    </section>
    <%
        if(request.getAttribute("erro")!=null){
    %>
    <section>
        <h1><%=request.getAttribute("erro")%></h1>
    </section>
    <%
        }
    %>
    <%
        if(request.getAttribute("consultaNome")!=null){
            Pessoa pessoa = (Pessoa) request.getAttribute("consultaNome");

    %>
    <section>
        <article>
            Nome: <%=pessoa.getNome()%> <br>
            Cargo: <%=pessoa.getCargo()%><br>
        </article>
    </section>
    <%
        }
    %>

</main>
<%@include file="rodape.jsp"%>
</body>
</html>
