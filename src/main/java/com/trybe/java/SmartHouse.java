package com.trybe.java;

/**
 * Representa uma casa inteligente com controle da iluminação.
 **/
public class SmartHouse {

  private boolean isLightOn = false;

  /**
   * Liga a lâmpada, se ela estiver desligada.
   *
   * @throws IllegalStateException Se a lâmpada já estiver ligada.
   */
  public void ligarLampada() {
    if (!isLightOn) {
      isLightOn = true;
    } else {
      throw new IllegalStateException("A lampada já está ligada");
    }
  }

  /**
   * Desliga a lâmpada, se ela estiver ligada.
   *
   * @throws IllegalStateException Se a lâmpada já estiver desligada.
   */
  public void desligarLampada() {
    if (isLightOn) {
      isLightOn = false;
    } else {
      throw new IllegalStateException("A lampada já está desligada");
    }
  }

  /**
   * Verifica se a lâmpada está ligada.
   *
   * @return Retorna true se a lâmpada estiver ligada, senão ela retorna false.
   */
  public boolean isLampadaLigada() {
    return isLightOn;
  }

  public boolean conectarInternet(double connectionRate) {
    if (connectionRate > 0.5) {
      return true;
    } else {
      return false;
    }
  }
}
