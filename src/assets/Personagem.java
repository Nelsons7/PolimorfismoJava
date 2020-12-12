package assets;

public class Personagem {

    private String nome;
    private int vida;
    private int dano;

    public Personagem(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar() {
        System.out.format("ataque basico causou %d de dano", dano);
    }

    // sobrecarga de metodos
    public void atacar(int dano2) {
        int resultadoDano = dano + dano2;
        System.out.format("ataque duplo causou %d de dano", resultadoDano);
    }

}