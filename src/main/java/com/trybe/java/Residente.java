package com.trybe.java;

/**
 * Representa uma pessoa.
 **/
public class Residente {
  public String nome;
  public int idade;
  public float peso;
  public float altura;

  /**
   * Constructor da classe Residente, para inicializar os atributos de cada residente.
   *
   * @param nome O nome do residente.
   * @param idade A idade do residente.
   * @param peso O peso do residente.
   * @param altura A altura do residente.
   */
  public Residente(String nome, int idade, float peso, float altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }
}
