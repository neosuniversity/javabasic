package org.neosuniversity.unidad3.musicPart2;

/**
 * Created by camus on 02/06/2018.
 */
public class BibliotecaMusica {

    private Disco[] lstDiscos;

    public BibliotecaMusica() {
    }

    public BibliotecaMusica(Disco[] lstDiscos) {
        this.lstDiscos = lstDiscos;
    }

    public Disco[] getLstDiscos() {
        return lstDiscos;
    }

    public void setLstDiscos(Disco[] lstDiscos) {
        this.lstDiscos = lstDiscos;
    }
}
