package br.com.fiap;

// Arthur Bispo de lima / 557568

public class Apdex {
    public float calcularApdex(int satisfeitos, int tolerantes, int totalAmostras) {
        if (totalAmostras == 0) {
            return 0;
        }
        // A divisão por 2.0f garante que o resultado seja um float
        return (satisfeitos + (tolerantes / 2.0f)) / totalAmostras;
    }
}