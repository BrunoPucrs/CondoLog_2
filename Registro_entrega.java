package CondoLog_2;

public class Registro_entrega {
    private String data;
    private String hora;
    private String descricao_produto;
    private int apartamento;
    private String operador;
    private int id;
    
    public Registro_entrega(String data, String hora, String descricao_produto, int apartamento, String operador, int id) {
        this.data = data;
        this.hora = hora;
        this.descricao_produto = descricao_produto;
        this.apartamento = apartamento;
        this.operador = operador;
        this.id = id;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getApartamento() {
        return apartamento;
    }

    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}