package br.com.empresa.leilao.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(MockitoJUnitRunner.class)
public class FinalizarLeilaoServiceTest {
    @Autowired
    @Mockwired
    private FinalizarLeilaoService service;

    @Test
    public void deveriaFinalizarLeiloes(){
        FinalizarLeilaoService service = new FinalizarLeilaoService();
        service.finalizarLeiloesExpirados();

    }
}
