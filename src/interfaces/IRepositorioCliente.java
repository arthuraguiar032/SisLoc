package interfaces;

import modelo.Cliente;

public interface IRepositorioCliente {
    public void cadastrar(Cliente cliente);
    public Cliente buscar(long cpf);
    public void atualizar(Cliente cliente);
    public void deletar(long cpf);
    public Cliente[] listar();
}