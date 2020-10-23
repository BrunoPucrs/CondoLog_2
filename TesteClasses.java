package CondoLog_2;
public class TesteClasses {
    public static void main(String[] args) {
        CadastroDeMoradores cadastro = new CadastroDeMoradores();
        Morador m1 = new Morador("Amália Breyer", "000.000.000-09", 405);
        cadastro.cadastrarNovoMorador(m1);
        cadastro.listarMoradores();

        System.out.println();

        OperacaoDeEntregas op = new OperacaoDeEntregas();
        Entrega e1 = new Entrega(6,"Caixa de papelão pequena", 15, 10, 2020, 19, 15, 701, "HT");
        op.registrarNovaEntrega(e1);
        op.listarEntregas();

        System.out.println();
        
        op.buscarEntregaDescricao("Envelope pardo");
        System.out.println();
        op.buscarEntregaDescricao("Caixa de isopor");

        System.out.println();

        //formato: dia inicial, mes inicial, ano inicial, dia final, mes final, ano final
        op.buscarEntregaData(12, 10, 2020, 13, 10, 2020);

        //teste da classe geraRelatorio que gera o relatorio
        geraRelatorio gr = new geraRelatorio(cadastro, op);
        gr.relatorio();
    }
}