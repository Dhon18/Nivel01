package nivel_1;
import java.util.Scanner;
public class Nivel_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome, sobrenome;
        
        System.out.println("Digite o seu primeiro nome: ");
        nome = leia.nextLine();
        
        System.out.println("Digite o seu sobrenome: ");
        sobrenome = leia.nextLine();
        
        System.out.println("Primeiro Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
    }
}