package app;

public class Maratonista extends Deportista {
    public double kmsRecorrido;
    public String procedencia;
    public String categoria;
    public double marca;
    public double velocidad;
    public int energia;

    public boolean correr() {
        if (this.energia > 0) {
            this.velocidad = 20;
            this.energia -= 5;
            this.playAnimacionCorrer();
            return true;
        }
        return false;
    }

    /** acelerar le incrementa la velocidad en 1 */
    public void acelerar() {
        velocidad++;
    }

    

    public void playAnimacionCorrer() {

        System.out.print("\r");
        String blancos = "";
        for (int i = 100; i > energia; i--) {

            blancos += " ";

        }
        String cuerpo = "\\o/";

        if (this.energia % 2 != 0)
            cuerpo = "/o\\";

        System.out.print(blancos + cuerpo);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}