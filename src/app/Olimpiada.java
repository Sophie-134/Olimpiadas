package app;

import java.util.ArrayList;
import java.util.List;

public class Olimpiada {
    public String deportes;
    public String paisesParticipantes;

    public List<Deportista> participantes= new ArrayList<>();
    /**deportista con mayuscula hace referencia a la clase */
    public void inscribir(Deportista deportista){
        this.participantes.add(deportista);
        /**this hace referencia al deportista */
    }


}