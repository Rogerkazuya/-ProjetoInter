import javax.swing.JOptionPane;

public class Bebidas{
  

    //Atributos da classe
    private String produto;
    private String marca;
    private double preco;
    private int qtdEstoque = 0;
    private String peso;
    private int id, qtd =  0;


    private String[] produtoBebida = new String[100];
    private String[] marcaBebida = new String[100];
    private double[] precoBebida = new double[100];
    private int[] qtdEstoqueBebida = new int[100];
    private String[] pesoBebida = new String[100];
   


    //Métodos construtores
    public Bebidas(){}

    public Bebidas(int id, String marca, String peso, double preco, String produto, int qtdEstoque){
        this.id = id;
        this.marca = getMarca();
        this.peso = getPeso();
        this.preco = getPreco();
        this.produto = getProduto();
        this.qtdEstoque = getQtdEstoque();
      
    }


    //Métodos de acesso
    public String getProduto() {return produto;}
    public void setProduto(String produto) { this.produto = produto;}
    public String getMarca() { return marca; }
    public void setMarca(String marca) {     this.marca = marca;}
    public double getPreco() {  return preco;}
    public void setPreco(double preco) {    this.preco = preco; }
    public int getQtdEstoque() {   return qtdEstoque; }
    public void setQtdEstoque(int qtdEstoque) { this.qtdEstoque = qtdEstoque; }
    public String getPeso() {  return peso;}
    public void setPeso(String peso) {  this.peso = peso; }
    public int getId() {  return id; }
    public void setId(int id) { this.id = id; }
    


    //Método para cadastro das bebidas
    public int cadastrarBebida(){
        int i = this.id;
        produtoBebida[i] = produto;
        marcaBebida[i] = marca;
        precoBebida[i] = preco;
        qtdEstoqueBebida[i] = qtdEstoque;
        pesoBebida[i] = peso;
        qtd++;
        JOptionPane.showMessageDialog(null, "Bebida cadastrada com sucesso!");
        return qtd;
    }

    public void relatorio( int i){      

      System.out.println(produtoBebida[i]+"\t\t"+marcaBebida[i]+"\t"+ pesoBebida[i] + "\t" + precoBebida[i] + "\t\t" + qtdEstoqueBebida[i]);
      
        }



      //Método para consulta de estoque
      public void consultarEstoque(){
        System.out.println("\n\n \t\tBebidas disponíveis\n\n");
        System.out.println("Produto\t\tMarca\t\tPeso\tPreço\t\tQuantidade em estoque");
        for(int i=0; i<qtd; i++){
            relatorio(i);
        }
        
      }  


}
