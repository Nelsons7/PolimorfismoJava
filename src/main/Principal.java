package main;

import assets.Jogador;
import assets.Personagem;

public class Principal {
    public static void main(String[] args) {

        Personagem personagem = new Personagem("Yosen", 150, 7);
        personagem.atacar(); // ao passar o parametro no metodo atacar, ele ira atacar duas vezes
        System.out.println("\n");

        Jogador jogador = new Jogador("Player", 130, 9);
        jogador.atacar();
    }
}