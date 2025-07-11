public class Loja {
  private String nome;
  private int dano;
  private int custo;

  public Loja(String nome, int dano, int custo) {
    this.nome = nome;
    this.dano = dano;
    this.custo = custo;
  }

  public String getNome() {
    return nome;
  }

  public int getDano() {
    return dano;
  }

  public int getCusto() {
    return custo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDano(int dano) {
    this.dano = dano;
  }

  public void setCusto(int custo) {
    this.custo = custo;
  }
}
