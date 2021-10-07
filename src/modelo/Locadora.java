package modelo;

import interfaces.IRepositorioCliente;
import interfaces.IRepositorioFilme;
import interfaces.IRepositorioOperacao;

public class Locadora{
    private IRepositorioFilme filmes;
    private IRepositorioCliente clientes;
    private IRepositorioOperacao operacoes;
}
