public abstract class  Pessoa {

    //Atributos da classe
    private String nome;
    private int idade;
    private String cpf;


    //Métodos construtores
    public Pessoa(String cpf, int idade, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa() {
    }



    //Métodos de acessos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

    //Método de polimorfia
    public abstract void consultarPessoa();
    
}
