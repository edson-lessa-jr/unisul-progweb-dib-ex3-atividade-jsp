<%@ page import="br.unisul.aula.exerc3.model.Pessoa" %>
<%@ page import="java.util.Set" %>
<%@ page import="br.unisul.aula.exerc3.model.Projeto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Consultar</title>
</head>
<body>
<header>
    <h1>Consultas</h1>
    <nav>
        <ul>
            <li>Consultar lista Pessoas: <a href="regPessoa?acao=1">Lista</a> &nbsp; <a href="regPessoa?acao=2">Por Nome</a> </li>
            <li><a href="regProjeto">Consultar lista Projetos</a> </li>
        </ul>
    </nav>
</header>
<main>
    <%
        if (request.getAttribute("pessoa")!=null){
    %>
    <section>
        <table border="1" width="50%">
            <caption><h1>Lista de Pessoas</h1></caption>
            <thead>
            <tr>
                <th>Nome</th>
                <th>Cargo</th>
            </tr>
            </thead>
            <tbody>
            <%
                for (Pessoa pessoa: (Set<Pessoa>) request.getAttribute("pessoa")){
            %>
            <tr>
                <td><%=pessoa.getNome()%></td>
                <td><%=pessoa.getCargo()%></td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </section>
    <%
        }
        if (request.getAttribute("projeto")!=null){
    %>
    <section>
        <table border="1" width="50%">
            <caption><h1>Lista de Projetos</h1></caption>
            <thead>
            <tr>
                <th>Nome</th>
                <th>Data Prev Início</th>
                <th>Data Prev Fim</th>
            </tr>
            </thead>
            <tbody>
            <%
              for (Projeto projeto: (Set<Projeto>) request.getAttribute("projeto")){

            %>
            <tr>
                <td><%=projeto.getNome()%></td>
                <td><%=projeto.getFormat(projeto.getDataPrevistaInicio())%></td>
                <td><%=projeto.getFormat(projeto.getDataPrevistaFim())%></td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </section>
    <%
        }
    %>
</main>
<%@include file="rodape.jsp"%>
</body>
</html>
