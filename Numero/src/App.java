import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String signal = "negativo";
        String parity = "ímpar";
        System.out.print("Insira um número inteiro: ");
        int number = sc.nextInt();

        if(number%2 == 0){
            parity = "par";
        }
        if(number >= 0){
            signal = "positivo";
        }

        System.out.println(number+" é "+signal+" e "+parity);
    }
}
