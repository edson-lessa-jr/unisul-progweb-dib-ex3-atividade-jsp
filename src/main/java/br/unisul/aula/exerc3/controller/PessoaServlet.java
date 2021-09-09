package br.unisul.aula.exerc3.controller;

import br.unisul.aula.exerc3.model.Pessoa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PessoaServlet", urlPatterns = "/exerc3/regPessoa")
public class PessoaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("txtNome");
        String cargo = request.getParameter("txtCargo");
        try {
            Pessoa pessoa = new Pessoa(nome, cargo);
            BD banco = BD.getInstance();
            banco.addPessoa(pessoa);
            request.setAttribute("resposta", "Pessoa cadastrada com sucesso");
        } catch (IllegalArgumentException e){
            request.setAttribute("resposta", e.getMessage());
        } catch (Exception e){
            request.setAttribute("resposta", "Erro não identificado");
            e.getStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/exerc3/resposta.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");
        RequestDispatcher dispatcher;
        switch (Integer.parseInt(acao)) {
            case 1:
            try {
                BD banco = BD.getInstance();
                request.setAttribute("pessoa", banco.getPessoaALL());
            } catch (IllegalArgumentException e) {
                e.getStackTrace();
            }

                dispatcher = request.getRequestDispatcher("/exerc3/consultar.jsp");
            dispatcher.forward(request, response);
            break;
            case 2:
                response.sendRedirect("consultaPessoaNome.jsp");
                break;
            case 3:
                try {

                    BD banco = BD.getInstance();
                    String nome = request.getParameter("txtNome");
                    request.setAttribute("consultaNome", banco.findPessoaByNome(nome));
                } catch (IllegalArgumentException e) {
                    request.setAttribute("erro", e.getMessage());
                }
                dispatcher = request.getRequestDispatcher("/exerc3/consultaPessoaNome.jsp");
                dispatcher.forward(request, response);
                break;
        }
    }

}
