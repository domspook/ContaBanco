import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero_conta;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);



        System.out.println("====================== MENU ======================\n");
        System.out.println("=============== CADASTRO DE CONTAS ===============\n");
        System.out.print("\n");

        System.out.print("Digite seu nome: \n ");
        nomeCliente = sc.nextLine();
        System.out.print("\n");

        System.out.print("Por favor digite o número da sua agência!\n ");
        System.out.print("Agência: ");
        agencia = sc.nextLine();
        System.out.println("\n");

        System.out.print("Por favor digite o número da sua conta\n");
        System.out.print("Conta: ");
        numero_conta = sc.nextInt();
        System.out.print("\n");

        System.out.print("Informe o valor do seu saldo\n");
        System.out.print("Saldo: ");
        saldo = sc.nextDouble();
        System.out.print("\n");

        System.out.print("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero_conta + " e seu saldo R$ " + saldo + " já está disponível para saque!" );



    }
}
