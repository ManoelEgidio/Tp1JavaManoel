import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void verificarDisponibilidade_ProdutoDisponivel() {
        Produto produto = new Produto("Placa de vídeo", 2023, 1500.0, true);
        assertTrue(produto.isDisponibilidade(), "Produto disponível para compra.");
        System.out.println(produto.verificarDisponibilidade());
    }

    @Test
    void verificarDisponibilidade_ProdutoIndisponivel() {
        Produto produto = new Produto("Teclado", 2022, 100.0, false);
        assertFalse(produto.isDisponibilidade(), "Produto indisponível no momento.");
        System.out.println(produto.verificarDisponibilidade());
    }

    @Test
    void validarAnoLancamento_ProdutoAntigo() {
        Produto produto = new Produto("Mouse", 2015, 50.0, true);
        assertFalse(produto.validarAnoLancamento(), "O produto é muito antigo para ser comercializado.");
        if (!produto.validarAnoLancamento()) {
            System.out.println("O produto é muito antigo para ser comercializado.");
        }
    }

    @Test
    void validarAnoLancamento_ProdutoAtual() {
        Produto produto = new Produto("Monitor", 2020, 800.0, true);
        assertTrue(produto.validarAnoLancamento(), "O produto está dentro do ano de lançamento válido.");
        if (produto.validarAnoLancamento()) {
            System.out.println("O produto está dentro do ano de lançamento válido.");
        }
    }

    @Test
    void validarPreco_PrecoAlto() {
        Produto produto = new Produto("Smartphone", 2023, 3500.0, true);
        assertFalse(produto.validarPreco(), "O preço do produto ultrapassa o limite permitido.");
        if (!produto.validarPreco()) {
            System.out.println("O preço do produto ultrapassa o limite permitido.");
        }
    }

    @Test
    void validarPreco_PrecoBaixo() {
        Produto produto = new Produto("Fone de ouvido", 2022, 20.0, true);
        assertTrue(produto.validarPreco(), "O preço do produto está dentro do limite permitido.");
        if (produto.validarPreco()) {
            System.out.println("O preço do produto está dentro do limite permitido.");
        }
    }

    @Test
    void validarProduto_ProdutoValido() {
        Produto produto = new Produto("Câmera", 2019, 2500.0, true);
        assertEquals("O produto está pronto para ser comprado!", produto.validarProduto(), "O produto está pronto para ser comprado.");
        System.out.println(produto.validarProduto());
    }

    @Test
    void validarProduto_ProdutoInvalido() {
        Produto produto = new Produto("Impressora", 2014, 4000.0, false);
        assertEquals("O produto é muito antigo para ser comercializado.\n" +
                "O preço do produto ultrapassa o limite permitido.\n" +
                "O produto está indisponível no momento.\n", produto.validarProduto(), "O produto não atende aos critérios para ser comprado.");
        System.out.println(produto.validarProduto());
    }
}
