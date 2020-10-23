package CondoLog_2;;

public class Entrega {
    private String operador;
    private int nro;
    private String descricao;
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    private int apDestino;

    Entrega(int nro, String descricao, int dia, int mes, int ano, int hora, int minuto, int apDestino, String operador) {
        this.nro = nro;
        this.descricao = descricao;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.apDestino = apDestino;
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getApDestino() {
        return apDestino;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void mostrarEntrega() {
        System.out.println("\nDADOS DA ENTREGA");
        System.out.println("Descrição: " + descricao + ", Data: " + dia + "/" + mes + "/" + ano + ", Hora: " + hora + ":" + minuto 
        + ", Apartamento: " + apDestino + "\nOperador: " + operador + "\n");
    }
}
