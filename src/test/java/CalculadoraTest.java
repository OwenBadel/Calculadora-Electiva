import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
Calculadora Calc = new Calculadora();

@Test
void sumar(){
    assertEquals(4, Calc.sumar(2,2));
}
    @Test
    void sumar1o2() {
      Exception ex = assertThrows(IllegalArgumentException.class, () -> Calc.sumar(1,2));
       assertEquals("No puedes hacer esto", ex.getMessage());
    }

    @Test
    void multiplicar() {
    assertEquals(10, Calc.multiplicar(2,5));
    }

    @Test
    void multiplicarConNegativos() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Calc.multiplicar(-2, 2));
        assertEquals("No pueden haber números negativos", ex.getMessage());
    }

    @Test
    void division(){
        assertEquals(8, Calc.dividir(24, 3));
    }

    @Test
    void dividirEntreCero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Calc.dividir(3,0));
        assertEquals("No se puede dividir entre cero.", ex.getMessage());
    }

    @Test
    void raizcuadrada() {
        assertEquals(2, Calc.raizcuadrada(4));
    }

    @Test
    void raizcuadradaNegativos() {
    Exception ex = assertThrows(IllegalArgumentException.class, () -> Calc.raizcuadrada(-1));
    assertEquals("No se puede calcular la raíz cuadrada de un número negativo.", ex.getMessage());


    }

    @Test
    void logaritmoNatural() {
    assertEquals(2.302585092994046,Calc.calcularLogaritmoNatural(10));
    }

    @Test
    void logaritmoNaturalNegativos() {
    Exception ex = assertThrows(IllegalArgumentException.class, () -> Calc.calcularLogaritmoNatural(-10));
    assertEquals("El logaritmo natural solo se puede calcular para números positivos.", ex.getMessage());

    }

    @Test
    void restar() {
    assertEquals(10, Calc.restar(20,10));

    }

    @Test
    void restarPorElMismoNumero() {
    Exception ex = assertThrows(IllegalArgumentException.class, () -> Calc.restar(10,10));
    assertEquals("El resultado es 0.", ex.getMessage());
    }
}