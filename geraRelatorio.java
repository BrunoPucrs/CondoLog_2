package CondoLog;

public class geraRelatorio {
    private CadastroDeMoradores cdm;
    private OperacaoDeEntregas ope;

    geraRelatorio (CadastroDeMoradores cdm, OperacaoDeEntregas ope){
        this.cdm = cdm;
        this.ope = ope;
    }

    public void relatorio() {
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s %15s %30s %5s %10s %10s %15s", "ENTREGA", "DATA/HORA", "DESCRICAO", "APTO", "OPERADOR","RETIRADA","MORADOR");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        String ent = "";
        String dthr = "";
        String dscr = "";
        String apto = "";
        String oprdr = "";
        String rtr = "";
        String mrdr = "";
        for(Entrega entrega: ope.getEntregas()){
            ent = entrega.getNro()+"";
            dthr = entrega.getDia()+"/"+entrega.getMes()+"/"+entrega.getAno()+" "+entrega.getHora()+":"+entrega.getMinuto();
            dscr = entrega.getDescricao();
            apto = entrega.getApDestino()+"";
            oprdr = entrega.getOperador();
            rtr = "Não retirado";
            for (Morador morador : cdm.getMoradores()) {
                if(entrega.getApDestino() == morador.getNumeroApartamento()) {
                    mrdr = morador.getNome();
                }
            }
            System.out.format("%5s %15s %30s %5s %8s %15s %15s", ent, dthr, dscr, apto, oprdr, rtr, mrdr);    
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }
}
