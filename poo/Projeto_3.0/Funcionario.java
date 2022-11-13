import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{

    //Atributos da classe
    private String cargo;
    private String cracha;


    //Métodos construtores
    public Funcionario() {}

    
    public Funcionario(String cpf, int idade, String nome, String cargo, String cracha) {
        super(cpf, idade, nome);
        this.cargo = cargo;
        this.cracha = cracha;
    }


    public Funcionario(String cargo, String cracha) {
        this.cargo = cargo;
        this.cracha = cracha;
    }




    //Métodos de acesso
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public String getCracha() { return cracha;}
    public void setCracha(String cracha) { this.cracha = cracha;}


    //Método para mostrar funcionários
    public void consultarPessoa(){
        JOptionPane.showMessageDialog(null, "Dados dos funcionário" +
        "\nNome: " + getNome()
        +"\nIdade: " + getIdade()
        +"\nNº do CPF: " + getCpf()
        + "\nCargo: " + cargo
        + "\nNº do crachá: " + cracha);
    }


    
}
