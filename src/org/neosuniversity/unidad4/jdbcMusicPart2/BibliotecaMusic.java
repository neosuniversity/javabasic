package org.neosuniversity.unidad4.jdbcMusicPart2;



/**
 * Created by camus on 02/06/2018.
 */
public class BibliotecaMusic {

    private Disco[] lstDiscos;

    public BibliotecaMusic() {
    }

    public BibliotecaMusic(Disco[] lstDiscos) {
        this.lstDiscos = lstDiscos;
    }

    public Disco[] getLstDiscos() {
        return lstDiscos;
    }

    public void setLstDiscos(Disco[] lstDiscos) {
        this.lstDiscos = lstDiscos;
    }
}
