algoritmo ProjetoInter

	inicio
	
	inteiro id=0, idC=0; 
	inteiro op, qtdEstoque, qtdClientes, qtd;
	inteiro idade[50], qtdEstoqueBebida[100]; 
	real preco, precoBebida[100];
	literal marca, produto, peso;
	literal marcaBebida[100], produtoBebida[100],pesoBebida[100], nome[50], cpf[50];
	
    
        enquanto(verdadeiro){
		//Menu inicial
            escreva("\t\tMenu Principal"
                +"\n1- Cadastrar Bebida"
                +"\n2- Consultar Estoque"
                +"\n3- Cadastrar Cliente"
                +"\n4- Consultar Cliente"
				+"\n5- Funcionários"
                +"\n6- Sair"
                +"\nDigite uma opção: ");
				leia(op);
            se(op==6)// caso digite a opção 6 ira sair do menu Principal
                escreva("Até mais!");
                pare;

            escolha(op){
                caso 1:
				
					//solicita os dados das bebidas para cadastra
                    escreva("\nCadastrar Bebida");
                    escreva("Informe o tipo de bebida:");
					leia(produto);
					escreva("Informe a marca:");
                    leia(marca);
					escreva("Informe o peso(em ML) da bebida:");
					leia(peso);
					escreva("Informe a quantidade recebida:");
					leia(qtdEstoque);
					escreva("Informe o preço:");
					leia(preco);
					
					//chama o metodo cadastraBebida
					id = cadastrarBebida();
					
					escreva("Bebida cadastrada com sucesso!");
                pare;
		
				
                caso 2:
					//Chama o método para consultar o estoque de bebidas.
					estoqueBebidas();
					pare;
				
                caso 3:
					//solicita os dados do cliente para cadastro
					escreva("Cadastrar Cliente");
                    escreva("Digite o nome:");
                    leia(nome);
                    escreva("informe a idade ");
                    leia(idade);
                    escreva("Informe o número do CPF");
                    leia(cpf);
					
					// chama o metodo cadastrarCliente
                    idC = cadastrarCliente();
					
					escreva("Cliente cadastrado com sucesso!")
                pare;
				
                caso 4:
					//chama o método que exibe os clientes cadastrados
					consultarCliente();
					pare;
					
				caso 5:
					//chama o método que exibe os funcionários
					mostrarFuncionarios();
					pare;
				
                padrao:
                    escreva("Opção inválida!");
					pare;
            }
        }
    fim
	

	//Métodos criados
	
	
	//Método para cadastrar um novo cliente
	inteiro cadastrarCliente();
	inicio
		int i = idC
		nomeCliente[i] = nome;
		cpfCliente[i] = cpf;
		idadeCliente[i] = idade;
		qtdClientes++
		retorne qtdClientes;
    fim
	
	//Método para consultar os dados dos clientes
	void consultarCliente();
	inicio
		escreva("\n\n \t\tClientes Cadastrados\n\n");
		escreva("Nome\tIdade\tCPF");
		para(int i = 0 i<qtdClientes; i++){
		relatorioCliente();
		}
	fim
	
	
	//Método para exibir os dados dos clientes cadastrados
	void relatorioCliente();
	inicio
		escreva(nomeCliente[i]+"\t"
		+ idadeCliente[i]+"\t"
		+ cpfCliente[i]+"\t");	
	fim

	//Método para cadastrar uma nova bebida
	inteiro cadastrarBebida();
	inicio
		int i = id;
		produtoBebida[i] = produto;
		marcaBebida[i] = marca;
		pesoBebida[i] = peso;
		precoBebida[i] = preco;
		qtdEstoqueBebida[i] = qtdEstoque;
		qtd++;
		retorne qtd;
	fim


	//Método para consultar as bebidas cadastradas
	void estoqueBebidas(); 
	inicio
		escreva("\nControle de Estoque:");
		escreva("Marca\tPreço\tPeso\tProduto\tQuantidade");
		para(inteiro i=0; i<id; i++){
				relatorio(i);
		};

    fim

	//Método criado para exibir os dados das bebidas cadastradas
	void relatorio();
	inicio
		escreva(produtoBebida[i]+"\t" 
		+ marcaBebida[]+"\t" 
		+ pesoBebida[]+"\t"
		+ precoBebida[]+"\t"
		+ qtdEstoqueBebida[]+"\t")
	fim
	
	void mostrarFuncionarios();
	inicio
	escreva("Nome: Cleiton dos Santos\nCPF: 46978403265\nIdade: 18\nCargo: Atendente\nCrachá: 7985");
	escreva("Nome: João Medeiros\nCPF: 46978413602\nIdade: 25\nCargo: EntregadornCrachá: 9785");
	fim
	
		

	
	