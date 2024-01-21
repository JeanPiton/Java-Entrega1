import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de camadas: ");
        int layer = sc.nextInt();

        for(int i=1; i<=layer; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
