import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    // Método para realizar a adição
    double adicao(double num1, double num2);

    // Método para realizar a subtração
    double subtracao(double num1, double num2);

    // Método para realizar a multiplicação
    double multiplicacao(double num1, double num2);

    // Método para realizar a divisão
    double divisao(double num1, double num2);
}
