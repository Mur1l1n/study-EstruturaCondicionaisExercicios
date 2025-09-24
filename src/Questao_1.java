import java.util.Locale;
import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("NAO NEGATIVO");
        }
        else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
