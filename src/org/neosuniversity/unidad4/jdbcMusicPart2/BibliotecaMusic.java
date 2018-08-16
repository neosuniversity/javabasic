package org.neosuniversity.unidad4.jdbcMusicPart2;


import java.util.List;

/**
 * Created by camus on 02/06/2018.
 */
public class BibliotecaMusic {

    private List<Disco> lstDiscos;

    public BibliotecaMusic() {
    }

    public BibliotecaMusic(List<Disco> lstDiscos) {
        this.lstDiscos = lstDiscos;
    }

    public List<Disco> getLstDiscos() {
        return lstDiscos;
    }

    public void setLstDiscos(List<Disco> lstDiscos) {
        this.lstDiscos = lstDiscos;
    }
}
