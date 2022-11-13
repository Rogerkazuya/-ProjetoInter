import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao, id = 0, idt=0;

        Scanner sc = new Scanner(System.in);
        Bebidas b = new Bebidas();
        Cliente c = new Cliente();
        Funcionario f = new Funcionario("46978403265", 29, "Cleiton dos Santos", "Atendente", "7985");
        Funcionario f1 = new Funcionario("46978413602", 25, "João Medeiros", "Entregador", "9785");
        
        //Menu inicial
        while (true) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal"
                    + "\n1- Cadastrar Bebida"
                    + "\n2- Consultar Estoque"
                    + "\n3- Cadastrar Cliente"
                    + "\n4- Consultar cliente"
                    + "\n5- Funcionários"
                    + "\n6- Sair"
                    + "\nDigite uma opção: "));
            if (opcao == 6) {
                JOptionPane.showMessageDialog(null, "Até mais!");
                break;
            }
            switch (opcao) {
                //Menu para cadastrar uma nova bebida:
                case 1 -> {
                    System.out.println("Cadastrar Bebida");
                    b.setId(id);
                    System.out.println("Informe o tipo de bebida:");
                    b.setProduto(sc.next());
                    System.out.println("Informe a marca:");
                    b.setMarca(sc.next());
                    System.out.println("Informe o peso(em ML) da bebida:");
                    b.setPeso(sc.next());
                    System.out.println("Informe a quantidade recebida:");
                    b.setQtdEstoque(sc.nextInt());
                    System.out.println("Informe o preço:");
                    b.setPreco(sc.nextDouble());
                    id = b.cadastrarBebida();
                    break;
                }
                case 2 -> {
                    //Menu para consultar estoque de bebidas:
                    System.out.println("Consultar Bebidas:");
                    b.consultarEstoque();
                    break;
                    }

                case 3 -> {
                    //Menu para cadastrar um cliente:
                    System.out.println("Cadastrar Cliente");
                    c.setIdt(idt);
                    System.out.println("Digite o nome:");
                    c.setNome(sc.next());
                    System.out.println("Informe a idade:");
                    c.setIdade(sc.nextInt());
                    System.out.println("Informe o número do CPF");
                    c.setCpf(sc.next());
                    idt = c.cadastrarCliente();
                    break;
                }

                case 4 -> {
                    //Menu para consultar Clientes:
                    System.out.println("Consultar Clientes:");
                    c.consultarPessoa();
                    break;
                }

                case 5 -> {
                    //Menu para consultar Funcionários:
                    f.consultarPessoa();
                    f1.consultarPessoa();

                    break;
                
                }

                default ->
                    System.out.println("Opção invalida");

            }

        }

        sc.close();

    }
}
