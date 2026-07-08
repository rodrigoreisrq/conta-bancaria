package ExerciciosProprios.src.src.domain;

public interface InterfaceContaBancaria {
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void exibirSaldo();
}
