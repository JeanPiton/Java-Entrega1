import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        int number = sc.nextInt();
        System.out.println("Tabela de multiplicação por "+number);

        for(int i = 1; i <= 10; i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}
