# Conta Bancária

Simulação de uma conta bancária simples em Java, desenvolvida como exercício prático de **Programação Orientada a Objetos**.

O foco não foi construir um sistema completo, mas aplicar de forma deliberada os conceitos de encapsulamento e interfaces — entendendo o porquê de cada decisão, não apenas fazendo funcionar.

---

## O que o projeto faz

- Abre uma conta com titular definido
- Deposita valores com validação de entrada
- Saca valores com validação de saldo
- Exibe o saldo atual

---

## Conceitos aplicados

**Encapsulamento** — os atributos `titular` e `saldo` são `private`. Nenhum código externo acessa ou modifica esses dados diretamente; tudo passa pelos métodos da classe.

**Interface** — `InterfaceContaBancaria` define o contrato de comportamento. A classe `ContaBancaria` é obrigada a implementar todos os métodos, o que separa o *o quê* o sistema faz do *como* ele faz.

**Validação de estado** — o saque verifica se há saldo suficiente antes de executar. O depósito rejeita valores negativos ou zerados.

---

## Estrutura

```
src/
└── ExerciciosProprios/
    ├── InterfaceContaBancaria.java
    ├── ContaBancaria.java
    └── ExercicioBanco.java
```

---

## Exemplo de uso

```java
ContaBancaria cb = new ContaBancaria("Rodrigo");

cb.depositar(500);   // saldo: 500.0
cb.sacar(200);       // saldo: 300.0
cb.exibirSaldo();    // Saldo atual: 300.0

cb.sacar(400);       // Saldo insuficiente.
cb.depositar(-50);   // Não é possível depositar este valor.
```

---

## Tecnologias

- Java 17+
- IntelliJ IDEA

---

## Status

Exercício concluído. Faz parte de uma série de projetos práticos desenvolvidos durante meu aprendizado de Java e POO.
