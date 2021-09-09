package br.unisul.aula.exerc2;

public class Funcionario {
    private String nome;
    private Double salarioBruto;
    private final Double imposto = 0.11;

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido(){
        return salarioBruto-(salarioBruto*imposto);
    }
}
