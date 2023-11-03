public class Computadora implements Dispositivo {

    private String modelo;
    private boolean modo;

    public Computadora(String modelo) {
        this.modelo = modelo;
        this.modo = false; // (inicialmente apagado: false=apagado y true=encendido)
    }

    public String getModelo(String modelo) {
        return this.modelo;
    }

    public void verificar() {
        if (modo == true) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }
    }

    public void encender() {
        this.modo = true;
    }

    public void apagar() {
        this.modo = false;
    }

    public String toString() {
        return this.modelo + " computadora";
    }

}