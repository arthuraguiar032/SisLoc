package interfaces;

import modelo.Locacao;
import modelo.Operacao;
import modelo.Reserva;

public interface IRepositorioOperacao {
    public void cadastrar(Operacao operacao);
    public Reserva[] buscarReservas(long cpf);
    public Locacao[] buscarLocacoes(long cpf);
    public void deletarReserva(long cpf, int codigo);
    public void deletarLocacao(long cpf, int codigo);
    public Locacao[] listarLocacoes(long cpf);
    public int numeroLocacoes(long cpf);
    public int numeroLocacoes(int codigo);
    public int numeroLocacoesAtivas(long cpf);
    public int numeroLocacoesAtivas(int codigo);
    public int numeroReservas(int codigo);
}
