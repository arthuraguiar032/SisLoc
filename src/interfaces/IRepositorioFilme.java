package interfaces;

import modelo.Filme;

public interface IRepositorioFilme {
    public void cadastrar(Filme filme);
    public Filme buscar(int codigo);
    public void atualizar(Filme filme);
    public void deletar(int codigo);
    public Filme[] listar();
}
