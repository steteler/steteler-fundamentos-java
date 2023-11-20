package com.trybe.java;

/**
 * Representa uma pessoa.
 **/
public class Residente {
  public String nome;
  public int idade;
  public float peso, altura;

  public Residente(String nome, int idade, float peso, float altura) {
    this.nome = nome;
    this.idade = (short) idade;
    this.peso = (float) peso;
    this.altura = altura;
  }
}
