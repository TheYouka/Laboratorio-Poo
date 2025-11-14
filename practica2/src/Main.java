public class Main {
    public static void main(String[] args) {
        Universidad1945 universidad = new Universidad1945();

        // Crear estudiantes
        EstudianteAV estudiante1 = new EstudianteAV("Angel Velazquez", "20211945", 21, "Ingeniería", 6);
        EstudianteAV estudiante2 = new EstudianteAV("Ana López", "20203456", 19, "Matemáticas", 2);
        EstudianteAV estudiante3 = new EstudianteAV("Carlos Ruiz", "20191234", 22, "Física", 8);
        EstudianteAV estudiante4 = new EstudianteAV("María Pérez", "20204567", 20, "Química", 4);
        EstudianteAV estudiante5 = new EstudianteAV(); // Constructor vacío

        // Agregar estudiantes a la universidad
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);
        universidad.agregarEstudiante(estudiante4);
        universidad.agregarEstudiante(estudiante5);

        // Mostrar todos los estudiantes
        System.out.println("\n--- Lista de estudiantes ---");
        universidad.mostrarTodos();

        // Buscar por matrícula
        System.out.println("\n--- Buscar por matrícula: 20211945 ---");
        EstudianteAV encontrado = universidad.buscarPorMatricula("20211945");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInfo());
            encontrado.estudiarHoras(5);
            encontrado.avanzarSemestre();
        } else {
            System.out.println("No se encontró la matrícula.");
        }

        // Buscar por nombre
        System.out.println("\n--- Buscar por nombre: Ana ---");
        for (EstudianteAV estudiante : universidad.buscarPorNombre("Ana")) {
            System.out.println("Coincidencia: " + estudiante.mostrarInfo());
        }

        // Intentar agregar duplicado
        System.out.println("\n--- Intentar agregar duplicado ---");
        EstudianteAV duplicado = new EstudianteAV("Duplicado", "20211945", 20, "Arte", 3);
        universidad.agregarEstudiante(duplicado);

        // Intentar agregar null
        System.out.println("\n--- Intentar agregar null ---");
        universidad.agregarEstudiante(null);
    }
}
