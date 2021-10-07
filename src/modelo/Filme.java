package modelo;

import java.util.Date;
import java.util.Vector;

public class Filme {
    private int codigo;
    private String titulo;
    private Vector genero;
    private Date dataLancamento;
    private String diretor;
    private Vector atores;
    private String sinopse;
    private Vector produtores;
    private float precoLocacao;
    private int numeroCopias;

    public Filme(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Vector getGenero() {
        return genero;
    }

    public void setGenero(Vector genero) {
        this.genero = genero;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Vector getAtores() {
        return atores;
    }

    public void setAtores(Vector atores) {
        this.atores = atores;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Vector getProdutores() {
        return produtores;
    }

    public void setProdutores(Vector produtores) {
        this.produtores = produtores;
    }

    public float getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(float precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public void addGenero(String genero){
//        TODO
    }

    public void addAtor(String ator){
//        TODO
    }

    public void addProdutor(String produtor){
//        TODO
    }

    public void imprimir(){
//        TODO
    }
}