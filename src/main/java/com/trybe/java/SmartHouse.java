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
   * @return true Se a lâmpada estiver ligada.
   * @return false Se a lâmpada estiver desligada.
   */
  public boolean isLampadaLigada() {
    return isLightOn;
  }

  /**
   * Verifica se possui internet.
   *
   * @param connectionRate É a taxa de conexão da internet.
   * @return true Se connectionRate for maior do que 0.5.
   * @return false Se connectionRate for menor ou igual a 0.5.
   */
  public boolean conectarInternet(double connectionRate) {
    if (connectionRate > 0.5) {
      return true;
    } else {
      return false;
    }
  }
}
