package br.unisul.aula.exerc3.controller;

import br.unisul.aula.exerc3.model.Pessoa;
import br.unisul.aula.exerc3.model.Projeto;

import java.util.HashSet;
import java.util.Set;

public class BD {
    private static BD instance = new BD();
    private static Set<Pessoa> pessoaSet = new HashSet<>();
    private static Set<Projeto> projetoSet = new HashSet<>();

    private BD() {
    }

    public static BD getInstance() {
        return instance;
    }

    public void addPessoa(Pessoa pessoa){
        pessoaSet.add(pessoa);
    }
    public Set<Pessoa> getPessoaALL(){
        return pessoaSet;
    }
    public Pessoa findPessoaByNome(String nome) throws IllegalArgumentException{
        for (Pessoa pessoa: pessoaSet){
            if (pessoa.getNome().equalsIgnoreCase(nome)){
                return pessoa;
            }
        }
        throw new IllegalArgumentException("Pessoa não encontrada");
    }


    public void addProjeto(Projeto projeto){
        projetoSet.add(projeto);
    }
    public Set<Projeto> getProjetoAll(){
        return projetoSet;
    }
    public Projeto findProjetoByNome(String nome) throws IllegalArgumentException{
        for (Projeto projeto: projetoSet){

            if (projeto.getNome().equalsIgnoreCase(nome)){

                return projeto;
            }
        }
        throw new IllegalArgumentException("Projeto não encontrado");
    }
}
