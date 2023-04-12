import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEstornoTest {

    @Test
    void deveExecutarEstorno() {
        IServico servico = ServicoFactory.obterServico("Estorno");
        assertEquals("Estorno efetivado", servico.executar());
    }

    @Test
    void deveCancelarEstorno() {
        IServico servico = ServicoFactory.obterServico("Estorno");
        assertEquals("Estorno cancelado", servico.cancelar());
    }

}
