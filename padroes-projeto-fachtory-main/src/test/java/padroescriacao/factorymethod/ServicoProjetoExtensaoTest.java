package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProjetoExtensaoTest {

    @Test
    void deveExecutarAprovacao() {
        IServico servico = ServicoFactory.obterServico("ProjetoExtensao");
        assertEquals("Aluno aprovado no processo seletivo", servico.executar());
    }

    @Test
    void deveCancelarAprovacao() {
        IServico servico = ServicoFactory.obterServico("ProjetoExtensao");
        assertEquals("Aluno reprovado no processo seletivo", servico.cancelar());
    }

}