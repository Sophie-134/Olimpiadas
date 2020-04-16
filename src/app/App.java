package app;

public class App {
    public static void main(String[] args) throws Exception {
        Olimpiada olimpiadaCoronaEdition;
        olimpiadaCoronaEdition = new Olimpiada();

        Maratonista maratonista1;
        maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "Alemania";
        maratonista1.pasaporte = "AL33445648";
        maratonista1.edad = 35;
        maratonista1.energia = 97;

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);

        while (maratonista1.energia > 0) {

            corrio = maratonista1.correr();
            /*if (corrio == true) {
                System.out.println("El maratonista " + maratonista1.nombre + " corrió");
            } else
                System.out.println("El maratonista no corrió");
        }
        if (maratonista1.energia <= 0) {
            System.out.println(maratonista1.nombre + " se quedo sin energia" + maratonista1.energia);
        }*/
    }
    int cantidadParticipantes;
    cantidadParticipantes= olimpiadaCoronaEdition.participantes.size();// tamaño de la lista

    System.out.print("La cantidad de Participantes es "+ cantidadParticipantes);

}}
