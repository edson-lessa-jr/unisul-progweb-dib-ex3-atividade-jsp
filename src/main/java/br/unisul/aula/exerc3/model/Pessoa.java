package br.unisul.aula.exerc3.model;

public class Pessoa {
    private String nome;
    private String cargo;

    public Pessoa(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        return getNome() != null ? getNome().equals(pessoa.getNome()) : pessoa.getNome() == null;
    }

    @Override
    public int hashCode() {
        return getNome() != null ? getNome().hashCode() : 0;
    }
}
