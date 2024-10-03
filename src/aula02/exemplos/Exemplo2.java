package aula02.exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        int total, numero1 = 2, numero2 = 4;

        total = numero1 + numero2;
        System.out.println("a soma dos números é = " + total);
        total = numero1 - numero2;
        System.out.println("a subtração dos números é = " + total);
        total = numero1 * numero2;
        System.out.println("a multiplicação dos números é = " + total);

        float totalFloat, numero1Float = 2;
        totalFloat = numero1Float / numero2;
        System.out.println("a divisão dos números é = " + totalFloat);

        float modulo = numero1Float % numero2;

        System.out.println("O resto da divisão de " + numero1Float + " por " + numero2 + " é igual a " + modulo);
    }
}
