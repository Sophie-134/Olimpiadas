package app;

public class Deportista extends Persona {
    public String deporte;
    public double altura;
    public double peso;
    public int nroDeportivo;

    public void participar(Olimpiada olimpiada) {
        /**
         * participantes es la lista
         */
        // olimpiada.participantes.add(this);
        olimpiada.inscribir(this);

    }

}