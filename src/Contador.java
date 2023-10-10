import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número 1");
        int num1 = sc.nextInt();

        System.out.println("Digite o número 2");
        int num2 = sc.nextInt();

        try{
            contar(num1, num2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }

        int contagem = num2 - num1;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}