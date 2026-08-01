package ExerciciosProprios.src.src.domain;

import ExerciciosProprios.src.src.exceptions.SaldoInsuficienteException;

import java.io.IOException;

public class ContaBancaria implements InterfaceContaBancaria {
    private String titular;
    private double saldo;
    //Scanner sc = new Scanner(System.in);

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    private void setTitular(String titular) {
        this.titular = titular;
    }

    private String getTitular() {
        return this.titular;
    }

    private void setSaldo(double valor) {
        this.saldo = valor;
    }

    private double getSaldo() {
        return this.saldo;
    }


    @Override
    public void sacar(double valor) throws IOException, SaldoInsuficienteException {
        if(valor < 0){
            throw new IOException("Não é possivel sacar um valor negativo");
        } else{
            if(valor > this.saldo){
//                throw new IOException("Saldo insuficiente.");
                throw new SaldoInsuficienteException();
            }else if(valor <= this.saldo) {
                this.setSaldo(this.getSaldo() - valor);
            }
        }

    }

    @Override
    public void depositar(double valor) {
        if(valor <= 0){
            System.out.println("Não é possivel depositar este valor.");
        }else if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }
    }
    @Override
    public void exibirSaldo(){
        System.out.println("Saldo atual: " + this.getSaldo());
    }



    //private void depositar(double valor) {

}

//private void sacar(double valor) {
//this.saldo -= valor;
// }

// private void exibirSaldo() {
//    System.out.println(this.saldo);
//}
//Metodos abstratos




