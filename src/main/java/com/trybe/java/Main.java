package com.trybe.java;

/**
 * Classe principal que inicializa o programa.
 */
public class Main {

  /**
   * Método principal, ela fica responsável por inicializar o programa. Instancia um residente e
   * calcula o IMC do residente. Instancia uma house e usa os métodos dela para controlar as luzes.
   *
   * @param args Argumentos da linha de comando (não são utilizados neste projeto).
   */
  public static void main(String[] args) {
    Residente residente = new Residente("emma", 19, 40, 1.57);

    SmartHouse house = new SmartHouse();

    System.out.println("O IMC de " + residente.nome + " é: " + residente.calculaImc());

    System.out.println("A luz está: " + (house.isLampadaLigada() ? "ligada" : "desligada"));
    house.ligarLampada();
    System.out.println("A luz está: " + (house.isLampadaLigada() ? "ligada" : "desligada"));
    house.desligarLampada();
    System.out.println("A luz está: " + (house.isLampadaLigada() ? "ligada" : "desligada"));

    System.out.println(
        house.conectarInternet(0.7) ? "Conectado à Internet" : "Falha na conexão à Internet"
    );
    System.out.println(
        house.conectarInternet(0.2) ? "Conectado à Internet" : "Falha na conexão à Internet"
    );
  }
}
