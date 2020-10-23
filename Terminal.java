package CondoLog_2;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner in3 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        CadastroDeMoradores cadastro_morador=new CadastroDeMoradores();
        OperacaoDeEntregas entrega= new OperacaoDeEntregas();

        int nro = 0;

        boolean continuar=true;
        while(continuar){
            System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO");
            System.out.println("[1] LISTAR MORADORES\n[2] CADASTRAR MORADOR\n[3] REGISTAR NOVA ENTREGA\n[4] PROCURAR ENTREGA\n[5] MOSTRAR TODAS ENTREGAS\n[0] SAIR");
            int opcao=in.nextInt();
            
            switch(opcao){
                case 1:
                //LISTAR MORADORES
                System.out.println("Lista de moradores: ");
                cadastro_morador.listarMoradores();
                
                break;

                case 2:
                //CADASTRO NOVO MORADOR
                System.out.println("Cadatro de novo Morador");
                System.out.println("Informe o nome do novo morador: ");
                String nome=in.next();
                System.out.println("Informe o CPF do morador: ");
                String cpf=in.next();
                System.out.println("Informe o apartamento do morador: ");
                int numero_apartamento=in.nextInt();

                Morador novo_morador= new Morador(nome, cpf, numero_apartamento);
                
                cadastro_morador.cadastrarNovoMorador(novo_morador);
                
                break;

                case 3:
                //REGISTRAR NOVA ENTREGA
                nro++;

                System.out.println("Novo registro de entrega: ");
                System.out.println("Descreva o produto que foi entregue: ");
                String descricao=in2.nextLine();
                
                System.out.println("");
                System.out.println("Informe o apartamento de destino: ");
                int apDestino=in.nextInt();
                
                System.out.println("Informe a data, e horário de entrega: ");       
                System.out.println("Ano: ");
                int ano=in.nextInt();
                
                System.out.println("Mês: ");
                int mes=in.nextInt();
                
                System.out.println("Dia: ");
                int dia=in.nextInt();
                
                System.out.println("Hora: ");
                int hora=in.nextInt();
                
                System.out.println("Minuto: ");
                int minuto=in.nextInt();

                System.out.println("Operador digite o seu nome:");
                String nOp = in.next();

                System.out.println("Operador digite o seu sobrenome:");
                String sOp = in.next();
                
                String operador = String.valueOf(nOp.toUpperCase().charAt(0)) + String.valueOf(sOp.toUpperCase().charAt(0));

                Entrega nova_entrega = new Entrega(nro, descricao, dia, mes, ano, hora, minuto, apDestino, operador);
                
                entrega.registrarNovaEntrega(nova_entrega);
                break;


                case 4:
                System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO");
                System.out.println("[1] PROCURAR PELA DESCRIÇÃO\n[2] PROCURAR POR INTERVALO DE DATA");
                int opcao_2=in.nextInt();
                
                switch(opcao_2){
                    case 1:
                    //PROCURAR ENTREGA PELA DESCRIÇÃO
                    System.out.println("Por favor, informe a descrição da entrega: ");
                    String procurar_descricao= in3.nextLine();

                    entrega.buscarEntregaDescricao(procurar_descricao);

                    break;

                    case 2:
                    //PROCURAR ENTREGAS PELA DATA
                    System.out.println("Por favor, informe o intervalo de datas da entrega: ");
                    System.out.println("Data Inicial");
                    System.out.println("Ano: ");
                    int anoInicial=in.nextInt();

                    System.out.println("Mês: ");
                    int mesInicial=in.nextInt();

                    System.out.println("Dia: ");
                    int diaInicial=in.nextInt();

                    System.out.println("Data Final");
                    System.out.println("Ano: ");
                    int anoFinal=in.nextInt();

                    System.out.println("Mês: ");
                    int mesFinal=in.nextInt();

                    System.out.println("Dia: ");
                    int diaFinal=in.nextInt();

                    entrega.buscarEntregaData(diaInicial, mesInicial, anoInicial, diaFinal, mesFinal, anoFinal);

                    break;

                    default:
                    System.out.println("Valor invalido");
                }

                break;
                
                case 5:
                geraRelatorio rel = new geraRelatorio(cadastro_morador, entrega);
                System.out.println(rel);
                break;

                case 0:
                System.out.println("Finalizando programa...");
                continuar=false;
                
                break;


                default:
                System.out.println("Valor invalido!");
            }
        }
    }
}