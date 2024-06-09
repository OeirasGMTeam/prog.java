package modelo.espacos;

import modelo.enums.NomeDeEspaco;

/**
 * Classe Cadeia representa um espaço específico no jogo onde o jogador vai quando é preso.
 */
public class Cadeia extends Espaco {

    // Valor da fiança para sair da cadeia
    private final int fianca = 50;

    /**
     * Construtor da classe Cadeia.
     * 
     * @param nome O nome do espaço, que é passado para o construtor da classe base Espaco.
     */
    public Cadeia(NomeDeEspaco nome) {
        super(nome);
    }

    /**
     * Método getter para obter o valor da fiança.
     * 
     * @return O valor da fiança (50).
     */
    public int getFianca() {
        return fianca;
    }

}

