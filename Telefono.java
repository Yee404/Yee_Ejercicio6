public class Telefono implements Dispositivo {

    private String marca;
    private boolean modo;

    public Telefono(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
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
        return this.marca + " telefono";
    }
}
