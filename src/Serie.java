import java.util.ArrayList;

public class Serie {

    private ArrayList<Temporada> temporadas;

    Serie(){

        this.temporadas = new ArrayList<Temporada>();
    }

    //Getters && Setters

    public Temporada getTemporada(int indice) {

        return this.temporadas.get(indice);
    }

    public void setTemporada(Temporada temporada,int indice) {

        this.temporadas.set(indice,temporada);
    }

    public String toString() {

        //return ArrayList.toString(this.temporadas);
        return "hola";
    }
//Methods

    public void agregarTemporada (Temporada temporada){

        this.temporadas.add(this.temporadas.size(),temporada);
    }

    public static void main (String [] args) {

        Episodio ejEpi = new Episodio("Piloto","Episodio Piloto", true, 2);
        Temporada ejTemp = new Temporada();
        Serie ejSerie = new Serie();

        ejTemp.agregarEpisodio(ejEpi);
        ejSerie.agregarTemporada(ejTemp);
        System.out.println(ejSerie.toString());

    }

}
