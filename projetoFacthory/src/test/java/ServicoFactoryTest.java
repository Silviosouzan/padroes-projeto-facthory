import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            IServico servico = ServicoFactory.obterServico("Estorno");
        });
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            IServico servico = ServicoFactory.obterServico("Estorno");
        });
    }
}

