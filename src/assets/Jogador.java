package assets;

public class Jogador extends Personagem {

    public Jogador(String nome, int vida, int dano) {
        super(nome, vida, dano);

    }
    // utilizando a sobrescrita/sobreposicao de metodos
    // basta comentar o atacar da classe filha que os atributos da classe pai irá
    // aparecer

    public void atacar() {
        System.out.println("Furia da espada Trovejante!");
    }

}