import java.util.ArrayList;

public class Universidad1945 {
    private ArrayList<EstudianteAV> estudiantes;

    // Constructor
    public Universidad1945() {
        estudiantes = new ArrayList<>();
    }

    // Método para agregar estudiante
    public void agregarEstudiante(EstudianteAV estudiante) {
        if (estudiante == null) {
            System.out.println("No se puede agregar un estudiante null.");
            return;
        }
        for (EstudianteAV e : estudiantes) {
            if (e.getMatricula().equals(estudiante.getMatricula())) {
                System.out.println("Ya existe un estudiante con la matrícula " + estudiante.getMatricula() + ".");
                return;
            }
        }
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.mostrarInfo());
    }

    // Método para buscar estudiante por matrícula
    public EstudianteAV buscarPorMatricula(String matricula) {
        for (EstudianteAV estudiante : estudiantes) {
            if (estudiante.getMatricula().equals(matricula)) {
                return estudiante;
            }
        }
        return null;
    }

    // Método para buscar estudiantes por nombre
    public ArrayList<EstudianteAV> buscarPorNombre(String nombre) {
        ArrayList<EstudianteAV> resultados = new ArrayList<>();
        for (EstudianteAV estudiante : estudiantes) {
            if (estudiante.getNombre().contains(nombre)) {
                resultados.add(estudiante);
            }
        }
        return resultados;
    }

    // Método para mostrar todos los estudiantes
    public void mostrarTodos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (EstudianteAV estudiante : estudiantes) {
                System.out.println(estudiante.mostrarInfo());
            }
        }
    }
}
