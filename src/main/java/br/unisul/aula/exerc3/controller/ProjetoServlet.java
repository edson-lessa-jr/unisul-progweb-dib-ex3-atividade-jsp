package br.unisul.aula.exerc3.controller;

import br.unisul.aula.exerc3.model.Projeto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

@WebServlet(name = "ProjetoServlet", urlPatterns = "/exerc3/regProjeto")
public class ProjetoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("txtNome");
        String dtInicio = request.getParameter("dtInicio");
        String dtFim = request.getParameter("dtFim");

            try {
                Projeto projeto = new Projeto(nome, dtInicio, dtFim);
                BD banco = BD.getInstance();
                banco.addProjeto(projeto);
                request.setAttribute("resposta", "Projeto cadastrado com sucesso");
            } catch (ParseException e) {
                request.setAttribute("resposta", "Erro na conversão de datas");
            } catch (IllegalArgumentException e){
                request.setAttribute("resposta", e.getMessage());
            }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/exerc3/resposta.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            BD banco = BD.getInstance();
            request.setAttribute("projeto", banco.getProjetoAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/exerc3/consultar.jsp");
        dispatcher.forward(request, response);
    }
}
