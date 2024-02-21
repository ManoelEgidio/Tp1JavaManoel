package com.beginsecure.domain;

public class Produto {
    private String nome;
    private int anoLancamento;
    private double preco;
    private boolean disponibilidade;

    // Construtor
    public Produto(String nome, int anoLancamento, double preco, boolean disponibilidade) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    // Método para verificar disponibilidade
    public String verificarDisponibilidade() {
        if (disponibilidade) {
            return "Produto disponível para compra.";
        } else {
            return "Produto indisponível no momento.";
        }
    }
}
