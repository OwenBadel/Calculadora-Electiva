public class Calculadora {

    public int sumar(int a, int b) {
        if (a == 1 || b == 1) throw new IllegalArgumentException("No puedes hacer esto");
        return a + b;

    }

    public int multiplicar(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException("No pueden haber números negativos");
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre cero.");
        return a / b;
    }

    public int restar(int a, int b) {
        if (a == b && b == a) throw new IllegalArgumentException("El resultado es 0.");
        return a - b;
    }

    public static double raizcuadrada(double numero) {

        if (numero < 0)
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");

        double raiz = Math.sqrt(numero);
        return raiz;


    }
}


