Algoritmo "semnome"
//        Nome: Thayna Santana
//        Agencia de Viagens: Verde
//
Var
// Seção de Declarações das variáveis 
               opcao: inteiro
               clientes: vetor[1..50] de caracter
               destinos: vetor[1..50] de caracter
               nome, destino: caracter
               i,j,x,y: inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
            opcao <- 1
            i<-1  // Variavel para CADASTRAR clientes
            j<-1  // Variavel para CADASTRAR destinos
            x<-1  // Variavel para CONSULTAR clientes
            y<-1  // Variavel para CONSULTAR destinos
            enquanto (opcao <> 0) faca
               escreval("  - Menu da Agencia de Viagens VERDE - ")
               escreval(" [1] - Cadastrar Cliente")
               escreval(" [2] - Cadastrar Destino")
               escreval(" [3] - Consultar Clientes")
               escreval(" [4] - Consultar Destinos")
               escreval(" [0] - Sair")
               escreva(" > ")
               leia(opcao)
               // condicionais para cada opcao
               se(opcao=1) entao
                  escreval(" - Cadastro de Cliente -")
                  escreva("Digite o Nome Completo: ")
                  leia(nome)
                  clientes[i] <- nome
                  escreval("Novo cliente cadastrado com sucesso!")
                  i<- i+1
               senao
                    se(opcao=2) entao
                       escreval(" - Cadastro de Destino -")
                       escreva("Digite o nome do novo Destino: ")
                       leia(destino)
                       destinos[j] <- destino
                       escreval("Novo destino cadastrado com sucesso!")
                       j<- j+1
                    senao
                         se(opcao=3) entao
                            escreval(" - Consulta de clientes cadastrados -")
                            para x de 1 ate 50 passo 1 faca
                                 se (clientes[x]<>"") entao
                                    escreval("Nome: ", clientes[x])

                                 fimse
                            fimpara
                            escreval("")
                         senao
                              se(opcao=4) entao
                                 escreval(" - Consulta de destinos cadastrados -")
                                 para y de 1 ate 50 passo 1 faca
                                    se (destinos[y]<>"") entao
                                       escreval("Local: ", destinos[y])
                                    fimse
                                  fimpara
                                  escreval("")
                              fimse
                         fimse
                    fimse
               fimse
            fimenquanto
            escreva("FiM")

Fimalgoritmo