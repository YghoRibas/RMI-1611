public class Calculadora {
    
    public Calculadora();
    // Método para realizar a adição
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    // Método para realizar a subtração
    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Método para realizar a multiplicação
    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Método para realizar a divisão
    public double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: divisão por zero");
            return Double.NaN; // Retornar NaN (Not a Number) em caso de divisão por zero
        }
    }
}
