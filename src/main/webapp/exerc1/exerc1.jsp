<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<main>
    <section>
        <form action="#" method="post">
            <label>Número: <input type="number" name="nrFatorial"></label><br>
            <input type="submit" value="Enviar">
        </form>
    </section>
    <br><br>
    <section>
        <article>
            <%
                if (request.getParameter("nrFatorial") != null) {
            %>
            <table>
                <caption><h1>Fatorial</h1></caption>
                <thead>
                <tr>
                    <th>Número</th>
                    <th>Fatorial</th>
                </tr>
                </thead>
                <tbody>
                <%
                    int valor = Integer.parseInt(request.getParameter("nrFatorial"));
                    Long fatorial = 1L;
                    for (int i = 1; i <= valor; i++) {
                        fatorial *= i;
                %>
                <tr>
                    <td><%=i%>
                    </td>
                    <td><%=fatorial%>
                    </td>
                </tr>
                <%
                    }
                %>

                </tbody>
            </table>
            <%
                }
            %>
        </article>
    </section>
</main>
<%@include file="../rodape.jsp"%>
</body>
</html>
