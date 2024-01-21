import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int previous = 0;
        int actual = 0;
        int newNumber = 0;
        System.out.print("Tamanho da sequencia: ");
        int size = sc.nextInt();

        for(int c = 0; c < size; c++){
            if(c == 1){
                previous = 1;
            }
            newNumber = actual+previous;
            System.out.print(newNumber+" ");
            previous = actual;
            actual = newNumber;
        }
        System.out.println("");
    }
}
