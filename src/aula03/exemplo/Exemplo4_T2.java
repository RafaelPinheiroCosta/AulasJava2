package aula03.exemplo;

public class Exemplo4_T2 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, num3 = 2, num4 = 6;
        boolean resposta;

        resposta = num1 < num2 && num3 != num4;

        System.out.println(num1 + " < " + num2 + " && " +
                num3 + " != " + num4 + " = " + resposta);

        resposta = num1 < num2 || num3 != num4;

        System.out.println(num1 + " < " + num2 + " || " +
                num3 + " != " + num4 + " = " + resposta);

        resposta = !(num1 == num2);

        System.out.println(num1 + " == " + num2 + " = " + resposta);

    }
}
