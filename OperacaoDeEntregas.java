package CondoLog_2;
import java.util.ArrayList;

public class OperacaoDeEntregas {
    private ArrayList<Entrega> entregas;

    public void registrarEntregas() {
        //formato: descrição, dia, mes, ano, hora, minuto, apartamento, operador
        entregas.add(new Entrega(1,"Caixa grande branca", 12, 10, 2020, 18, 33, 701, "BG"));
        entregas.add(new Entrega(2,"Caixa pequena azul", 13, 10, 2020, 19, 41, 406, "GP"));
        entregas.add(new Entrega(3,"Envelope pardo", 13, 10, 2020, 19, 56, 302, "BR"));
        entregas.add(new Entrega(4,"Carta internacional", 19, 11, 2020, 13, 44, 306, "BG"));
        entregas.add(new Entrega(5,"Envelope pardo", 21, 11, 2020, 16, 39, 606, "BG"));
    }

    public OperacaoDeEntregas() {
        entregas = new ArrayList<>();
        registrarEntregas();
    }

    //registra nova entrega
    public boolean registrarNovaEntrega(Entrega novaEntrega) {
        entregas.add(novaEntrega);
        return true;
    }

    //lista todas as entregas
    public void listarEntregas() {
        System.out.println("Entregas: ");
        for(Entrega entrega : entregas) {
            entrega.mostrarEntrega();
        }
    }

    //recebe uma descrição e procura no Array List de entregas uma entrega com a mesma descrição fornecida
    public void buscarEntregaDescricao(String descricao) {
        System.out.println("Buscando por entrega(s) com a descrição: " + descricao);
        int entregasEncontradas = 0;
        for(Entrega entrega : entregas) {
            if(entrega.getDescricao().equals(descricao)) {
                entrega.mostrarEntrega();
                entregasEncontradas++;
            }
        }
        if(entregasEncontradas == 0) System.out.println("Não foram encontradas entregas com essa descrição!");
    }

    //recebe data inicial e final e busca no Array List de entregas todas aquelas que estão compreendidas entre estas datas
    public void buscarEntregaData(int diaInicial, int mesInicial, int anoInicial, int diaFinal, int mesFinal, int anoFinal) {
        System.out.println("Buscando por entrega(s) entre as datas: " + diaInicial + "/" + mesInicial + "/" + anoInicial + " e " + diaFinal + "/" + mesFinal + "/" + anoFinal);
        int entregasEncontradas = 0;
        for(Entrega entrega : entregas) {
            if(entrega.getDia() >= diaInicial && entrega.getMes() >= mesInicial && entrega.getAno() >= anoInicial && entrega.getDia() <= diaFinal && entrega.getMes() <= mesFinal && entrega.getAno() <= anoFinal) {
                entrega.mostrarEntrega();
                entregasEncontradas++;
            }
            if(entregasEncontradas == 0) System.out.println("Não foram encontradas entregas entre as datas especificadas!");
        }
    }

    public void retirarEntregaNro(int num) {
        boolean flag = false;
        for(Entrega entrega : entregas) {
            if(entrega.getNro() == num) {
                flag = true;
                entrega.setRetirado(true);
            }
        }
        if(flag == false) {
            System.out.println("Não foram encontradas entregas com essa descrição!");
        }
    }

    public ArrayList<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Entrega> entregas) {
        this.entregas = entregas;
    }
}