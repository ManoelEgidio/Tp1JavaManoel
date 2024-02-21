import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void verificarDisponibilidade_ProdutoDisponivel() {
        Produto produto = new Produto("Placa de vídeo", 2023, 1500.0, true);
        assertEquals("Produto disponível para compra.", produto.verificarDisponibilidade());
    }

    @Test
    void verificarDisponibilidade_ProdutoIndisponivel() {
        Produto produto = new Produto("Teclado", 2022, 100.0, false);
        assertEquals("Produto indisponível no momento.", produto.verificarDisponibilidade());
    }

    @Test
    void validarAnoLancamento_ProdutoAntigo() {
        Produto produto = new Produto("Mouse", 2015, 50.0, true);
        assertFalse(produto.validarAnoLancamento());
    }

    @Test
    void validarAnoLancamento_ProdutoAtual() {
        Produto produto = new Produto("Monitor", 2020, 800.0, true);
        assertTrue(produto.validarAnoLancamento());
    }

    @Test
    void validarPreco_PrecoAlto() {
        Produto produto = new Produto("Smartphone", 2023, 3500.0, true);
        assertFalse(produto.validarPreco());
    }

    @Test
    void validarPreco_PrecoBaixo() {
        Produto produto = new Produto("Fone de ouvido", 2022, 20.0, true);
        assertTrue(produto.validarPreco());
    }

    @Test
    void validarProduto_ProdutoValido() {
        Produto produto = new Produto("Câmera", 2019, 2500.0, true);
        assertEquals("O produto está pronto para ser comprado!", produto.validarProduto());
    }

    @Test
    void validarProduto_ProdutoInvalido() {
        Produto produto = new Produto("Impressora", 2014, 4000.0, false);
        assertEquals("O produto é muito antigo para ser comercializado.\n" +
                "O preço do produto ultrapassa o limite permitido.\n" +
                "O produto está indisponível no momento.\n", produto.validarProduto());
    }
}
