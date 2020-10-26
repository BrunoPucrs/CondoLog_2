package CondoLog_2;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.*;

public class geraRelatorio {
    private CadastroDeMoradores cdm;
    private OperacaoDeEntregas ope;

    geraRelatorio (CadastroDeMoradores cdm, OperacaoDeEntregas ope){
        this.cdm = cdm;
        this.ope = ope;
    }

    public void relatorio() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = myDateObj.format(myFormatObj);
        Scanner in = new Scanner(System.in);
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
            if(entrega.getRetirado() == false) {
                rtr = "Não Retirado";
            } else {
                rtr = dataFormatada;
            }
            int cont = 0;
            for (Morador morador : cdm.getMoradores()) {
                if(entrega.getApDestino() == morador.getNumeroApartamento()) {
                    mrdr = morador.getNome();
                    cont++;
                }
            }
            if(cont == 0) {
                mrdr = "NULL";
            }
            System.out.format("%5s %15s %30s %5s %8s %15s %15s", ent, dthr, dscr, apto, oprdr, rtr, mrdr);    
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }
}