package com.grupo10.registroassinaturas;

public class AplicativoModel {
    private Long id;
    private String nome;
    private double custoMensal;

    public AplicativoModel(Long id, String nome, double custoMensal) {
        this.id = id;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    @Override
    public String toString() {
        return "AplicativoModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", custoMensal=" + custoMensal +
                '}';
    }
}
