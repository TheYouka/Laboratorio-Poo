public class EstudianteAV {
    private String nombre;
    private String matricula;
    private int edad;
    private String carrera;
    private int semestreActual;

    // Constructor vacío
    public EstudianteAV() {
        this.nombre = "Desconocido";
        this.matricula = "00000000";
        this.edad = 0;
        this.carrera = "Sin definir";
        this.semestreActual = 0;
    }

    // Constructor con parámetros
    public EstudianteAV(String nombre, String matricula, int edad, String carrera, int semestreActual) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    // Constructor copia
    public EstudianteAV(EstudianteAV otro) {
        this.nombre = otro.nombre;
        this.matricula = otro.matricula;
        this.edad = otro.edad;
        this.carrera = otro.carrera;
        this.semestreActual = otro.semestreActual;
    }

    // Métodos
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Matrícula: " + matricula + ", Edad: " + edad + ", Carrera: " + carrera + ", Semestre: " + semestreActual;
    }

    public void estudiarHoras(int horas) {
        System.out.println(nombre + " ha estudiado " + horas + " horas.");
    }

    public void avanzarSemestre() {
        semestreActual++;
        System.out.println(nombre + " ha avanzado al semestre " + semestreActual + ".");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void cambiarCarrera(String nuevaCarrera) {
        carrera = nuevaCarrera;
        System.out.println(nombre + " ha cambiado su carrera a " + carrera + ".");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }
}
