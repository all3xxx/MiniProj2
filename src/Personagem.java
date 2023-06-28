public class Personagem {
  private String nome;
  private int energia;

  public Personagem(String nome, int energia) {
    this.nome = nome;
    this.energia = energia;
  }

  public int mostrarEnergia() {
    return this.energia;
  }

  public void diminuirEnergia(int valorPerdido) {
    this.energia = this.energia - valorPerdido;
  }

  public void morrer(){
    this.energia = 0;
  }
  
}