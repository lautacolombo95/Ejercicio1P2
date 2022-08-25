public class Episodio {

    //Constants
    public static final int         MIN_CALIF = 1;
    public static final int         MAX_CALIF = 5;
    public static final int         VALOR_CALIF_DEF = -1;
    public static final boolean     VALOR_VISTO_DEF = false;


    private String   titulo;
    private String   descripcion;
    private boolean  visto;
    private int      calificacion;

    //Constructor
    Episodio(String titulo,String descripcion, boolean visto, int calificacion){

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;
    }

    Episodio(String titulo, String descripcion){

        this(titulo,descripcion,VALOR_VISTO_DEF,VALOR_CALIF_DEF);
    }


    //Getters & Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVisto() {
        return this.visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {

        if (this.isValidCalif()){
            this.calificacion = calificacion;
        } else System.out.println("El valor ingresado es incorrecto, por favor intente nuevamente ingresando un valor de 1 a 5");

    }

    //Methods
    public boolean isValidCalif(){

        return calificacion >= MIN_CALIF && calificacion <= MAX_CALIF;
    }
}

