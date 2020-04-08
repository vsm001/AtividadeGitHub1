import javax.swing.*;
public class Calculadora {
    public static void main(String[] args) {
        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

        System.out.println("A soma dos numeros digitados é: " + (primeiroValor + segundoValor));
        System.out.println("A subtração dos numeros digitados é: " + (primeiroValor - segundoValor));
        System.out.println("A multiplacão dos numeros digitados é: " + (primeiroValor * segundoValor));
        System.out.println("A divisão dos numeros digitados é: " + (primeiroValor / segundoValor));
    }

}