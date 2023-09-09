import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o CEP desejado: ");
        String cep = scan.nextLine();

        ConsumoApi api = new ConsumoApi();
        String json = api.buscaEndereco(cep);

        System.out.println("Dados do endereço: ");
        System.out.println(json);

        scan.close();
    }
}
