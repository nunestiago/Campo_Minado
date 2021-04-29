package com.sunkenship.cm;

import com.sunkenship.cm.modelo.Tabuleiro;
import com.sunkenship.cm.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);
    }
}
