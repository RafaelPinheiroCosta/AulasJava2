package aula03.exemplo;

public class Exemplo3_T1 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        boolean resposta;

        resposta = num1 > num2;
        System.out.println(num1 + ">" + num2 + "=" + resposta);
        resposta = num1 < num2;
        System.out.println(num1 + "<" + num2 + "=" + resposta);
        resposta = num1 >= num2;
        System.out.println(num1 + ">=" + num2 + "=" + resposta);
        resposta = num1 <= num2;
        System.out.println(num1 + "<=" + num2 + "=" + resposta);
        resposta = num1 == num2;
        System.out.println(num1 + "==" + num2 + "=" + resposta);
        resposta = num1 != num2;
        System.out.println(num1 + "!=" + num2 + "=" + resposta);

    }
}
