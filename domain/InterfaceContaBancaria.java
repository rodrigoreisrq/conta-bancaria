package ExerciciosProprios.src.src.domain;

import ExerciciosProprios.src.src.exceptions.SaldoInsuficienteException;

import java.io.IOException;

public interface InterfaceContaBancaria {
    public abstract void sacar(double valor) throws IOException, SaldoInsuficienteException;
    public abstract void depositar(double valor);
    public abstract void exibirSaldo();
}
