public class Produto {
    private String nome;
    private int anoLancamento;
    private double preco;
    private boolean disponibilidade;

    public Produto(String nome, int anoLancamento, double preco, boolean disponibilidade) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

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

    public String verificarDisponibilidade() {
        if (disponibilidade) {
            return "Produto disponível para compra.";
        } else {
            return "Produto indisponível no momento.";
        }
    }

    public boolean validarAnoLancamento() {
        return anoLancamento >= 2017;
    }

    public boolean validarPreco() {
        return preco <= 3000.0;
    }

    public String validarProduto() {
        StringBuilder mensagem = new StringBuilder();
        if (!validarAnoLancamento()) {
            mensagem.append("O produto é muito antigo para ser comercializado.\n");
        }
        if (!validarPreco()) {
            mensagem.append("O preço do produto ultrapassa o limite permitido.\n");
        }
        if (!disponibilidade) {
            mensagem.append("O produto está indisponível no momento.\n");
        }
        if (mensagem.length() == 0) {
            return "O produto está pronto para ser comprado!";
        } else {
            return mensagem.toString();
        }
    }
}
