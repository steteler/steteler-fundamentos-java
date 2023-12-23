package com.trybe.java;

/**
 * Representa uma pessoa.
 **/
public class Residente {

  private String nome;
  private int idade;
  private double peso;
  private double altura;

  /**
   * Constructor da classe Residente, para inicializar os atributos de cada residente.
   *
   * @param nome   O nome do residente.
   * @param idade  A idade do residente.
   * @param peso   O peso do residente.
   * @param altura A altura do residente.
   */
  public Residente(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  /**
   * Calcula o IMC do residente baseado no peso e na altura.
   *
   * @return O IMC calculado do residente.
   */
  public double calculaImc() {
    return peso / (altura * altura);
  }

  public String getNome() {
    return nome;
  }
}
