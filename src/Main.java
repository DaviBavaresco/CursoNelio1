import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Banco banco;
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a account number: ");
        int numero = sc.nextInt();
        System.out.print("Enter a account holder: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n): ");
        char response = sc.next().charAt(0);

        if(response =='y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            banco = new Banco(numero, nome, initialDeposit);
        }else{
            banco = new Banco(numero,nome);
        }
        System.out.println();
        System.out.println("Accout data: ");
        System.out.println(banco);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        banco.depositar(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(banco);
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        banco.retirar(withdrawValue);
        System.out.println();
        System.out.println(banco);





    sc.close();
    }
}