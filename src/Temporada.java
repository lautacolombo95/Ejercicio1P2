import java.util.ArrayList;

public class Temporada {

    private ArrayList<Episodio> episodios;

    Temporada(){

        this.episodios = new ArrayList<Episodio>();
    }

    //Getters && Setters

    public Episodio getEpisodio(int indice) {

        return this.episodios.get(indice);
    }

    public void setEpisodio(Episodio episodio,int indice) {

        this.episodios.set(indice,episodio);
    }

    //Methods

    public void agregarEpisodio(Episodio episodio){

        this.episodios.add(this.episodios.size(),episodio);
    }

    public int getEpisodiosVistos(){

        int total = 0;
        for (Episodio e : this.episodios) {
            if (e.isVisto()){
                total++;
            }
        }
        return total;
    }

    public double getPromCalif(){

        int totalEpi = 0;
        int totalCalif = 0;

        for (Episodio e : this.episodios) {

            if (e.isValidCalif() && e.isVisto()){
                totalCalif=+ e.getCalificacion();
                totalEpi++;
            }
        }
        return totalCalif / totalEpi;

    }
}
