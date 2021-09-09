package br.unisul.aula.exerc3.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Projeto {
    private String nome;
    private Date dataPrevistaInicio;
    private Date dataPrevistaFim;

    public Projeto(String nome, String dataPrevistaInicio, String dataPrevistaFim) throws ParseException {
        this.nome = nome;
        this.dataPrevistaInicio = setFormat(dataPrevistaInicio);
        this.dataPrevistaFim = setFormat(dataPrevistaFim);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date setFormat(String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.parse(data);
    }
    public String getFormat(Date data){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(data);
    }

    public Date getDataPrevistaInicio() {
        return dataPrevistaInicio;
    }

    public void setDataPrevistaInicio(Date dataPrevistaInicio) {
        this.dataPrevistaInicio = dataPrevistaInicio;
    }

    public Date getDataPrevistaFim() {
        return dataPrevistaFim;
    }

    public void setDataPrevistaFim(Date dataPrevistaFim) {
        this.dataPrevistaFim = dataPrevistaFim;
    }
}
