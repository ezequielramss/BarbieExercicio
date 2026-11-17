package br.com.example.barbie.barbieExercicio;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class GuardaRoupaTest {

    private GuardaRoupa guardaRoupa;

    @Test
    @DisplayName("___")
    @BeforeEach
    void preparar() {
        // 1) complete: crie o guardaRoupa com orçamento de 500
        boolean resultado = guardaRoupa.ehDeGala(500);   // qual preço?
        assertTrue(resultado);
    }
        // 2) complete: um @Test para ehDeGala com preço 100
}