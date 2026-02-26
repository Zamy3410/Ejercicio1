public class Mascota {
    // Atributos privados
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    // Constructor
    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    // Métodos propios
    public void cumplirAnios() {
        edad = edad + 1;
    }

    public void engordar() {
        peso = peso + 1.0;
    }

    public void adelgazar() {
        peso = peso - 1.0;
    }

    public void enfermar() {
        saludable = false;
    }

    public void recuperarSalud() {
        saludable = true;
    }

    // toString
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    public void mostrarFicha() {
        System.out.println("======= FICHA =======");
        System.out.println("Nombre   : " + nombre);
        System.out.println("Especie  : " + especie);
        System.out.println("Edad     : " + edad + " años");
        System.out.println("Peso     : " + peso + " kg");
        System.out.println("Saludable: " + saludable);
        System.out.println("=====================");
    }

}
