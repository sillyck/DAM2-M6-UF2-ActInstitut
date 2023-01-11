
public class usaInstituto {

    public static void main(String[] args) {
        
        // Crear Instituto
        
        Instituto huguet = new Instituto("Jaume Huguet");

        huguet.crearProfesor("Francis Real","10101010B");
        huguet.crearProfesor("Ferran Urgell","12345678W");
        
        huguet.crearAlumno("Son Goku", "10000001A");
        huguet.crearAlumno("Vegeta", "10000002B");
        huguet.crearAlumno("Krillin", "10000003C");
        huguet.crearAlumno("Picolo", "10000004D");
        huguet.crearAlumno("Yamsha", "10000005E");
        
        huguet.crearCurso("DAM 1", "Dominio de Artes Marciales 1");
        huguet.crearCurso("ASIX 2", "Ataques Satanicos Infernales XQuerynos 2");
        
        huguet.crearAsignatura("M01", "Lanzamiento de Kame-Hame", 4, "Patio");
        huguet.crearAsignatura("M02", "Energia Universal", 2, "Gimnasio");
        huguet.crearAsignatura("M03", "Resurrección Básica", 5, "Enfermeria");
        huguet.crearAsignatura("M04", "Transformación en Super Sayan", 6, "Gimnasio");
        huguet.crearAsignatura("M05", "Puño del Dragon", 3, "Biblioteca");
        
        
        // Asignar alumnos, profesores, cursos y asignaturas
        
        huguet.asignarAsignatura("DAM 1", "M01");
        huguet.asignarAsignatura("DAM 1", "M03");
        huguet.asignarAsignatura("DAM 1", "M05");
        huguet.asignarAsignatura("ASIX 2", "M01");
        huguet.asignarAsignatura("ASIX 2", "M02");
        huguet.asignarAsignatura("ASIX 2", "M04");
        
        
//        huguet.asignarProfesor("M01", "10101010B");
//        huguet.asignarProfesor("M04", "10101010B");
//        huguet.asignarProfesor("M02", "12345678W");
//        huguet.asignarProfesor("M03", "12345678W");
//        huguet.asignarProfesor("M05", "12345678W");
//        
//        
//        huguet.asignarAlumno("ASIX 2", "10000001A");
//        huguet.asignarAlumno("ASIX 2", "10000002B");
//        huguet.asignarAlumno("DAM 1", "10000003C");
//        huguet.asignarAlumno("DAM 1", "10000004D");
//        huguet.asignarAlumno("DAM 1", "10000005E");
//        
//        
//        // Evaluar Alumnos
//        
//        
//        Profesor p;
//        p = huguet.getProfesor("10101010B"); //Francis
//        
//        p.ponerNota("M01", "10000001A", 10.0);
//        p.ponerNota("M01", "10000002B", 9.5);
//        p.ponerNota("M01", "10000003C", 6.5);
//        p.ponerNota("M01", "10000004D", 7.0);
//        p.ponerNota("M01", "10000005E", 1.5);
//        
//        p.ponerNota("M04", "10000001A", 9.0);
//        p.ponerNota("M04", "10000002B", 8.0);
//        
//        p = huguet.getProfesor("12345678W"); //Ferran
//        
//        p.ponerNota("M02", "10000001A", 8.5);
//        p.ponerNota("M02", "10000002B", 3.0);
//
//        p.ponerNota("M03", "10000003C", 10.0);
//        p.ponerNota("M03", "10000005E", 4.5);
//        
//        p.ponerNota("M05", "10000003C", 7.5);
//        p.ponerNota("M05", "10000004D", 8.0);
//        p.ponerNota("M05", "10000005E", 2.0);
//        
//
//        //System.out.println(huguet.toString());
//        
//        
//        // Consultar profesores
//        
//        System.out.println("          PROFESORES");
//        System.out.println("          ==========");
//        
//        
//        p = huguet.getProfesor("10101010B"); //Francis
//        
//        System.out.println("INFORMACION DE:   " + p.getNombre());
//        System.out.print("HORAS: ");
//        System.out.println(p.verHoras());
//        System.out.println("ASIGNATURAS: ");
//        System.out.print(p.verAsignaturas());
//        
//        
//        p = huguet.getProfesor("12345678W"); //Ferran
//        
//        System.out.println();
//        System.out.println("INFORMACION DE:   "+ p.getNombre());
//        System.out.print("HORAS: ");
//        System.out.println(p.verHoras());
//        System.out.println("ASIGNATURAS: ");
//        System.out.println(p.verAsignaturas());
//        
//        
//        // Consultar alumnos
//        
//        System.out.println("          ALUMNOS");
//        System.out.println("          =======");
//        
//        Alumno a;
//        
//        a= huguet.getAlumno("10000001A");
//        
//        System.out.println("INFORMACION DE:   "+a.getNombre());
//        System.out.print("ASIGNATURAS: ");
//        System.out.print(a.verAsignaturas());
//        
//        System.out.println("NOTAS: ");
//        System.out.println("     M01 - "+a.verNotaAsignatura("M01"));
//        System.out.println("     M02 - "+a.verNotaAsignatura("M02"));
//        System.out.println("     M04 - "+a.verNotaAsignatura("M04"));
//        
//        System.out.println("INFORME: ");
//        System.out.print(a.verInforme());
//        
//        
//        
//        a= huguet.getAlumno("10000003C");
//        
//        System.out.println();
//        System.out.println("INFORMACION DE:   "+a.getNombre());
//        System.out.print("ASIGNATURAS: ");
//        System.out.print(a.verAsignaturas());
//        
//        System.out.println("NOTAS: ");
//        System.out.println("     M01 - "+a.verNotaAsignatura("M01"));
//        System.out.println("     M03 - "+a.verNotaAsignatura("M03"));
//        System.out.println("     M05 - "+a.verNotaAsignatura("M05"));
//        
//        System.out.println("INFORME: ");
//        System.out.print(a.verInforme());
//        
//        
//        a= huguet.getAlumno("10000004D");
//        
//        System.out.println();
//        System.out.println("INFORMACION DE:   "+a.getNombre());
//        System.out.print("ASIGNATURAS: ");
//        System.out.print(a.verAsignaturas());
//        
//        System.out.println("NOTAS: ");
//        System.out.println("     M01 - "+a.verNotaAsignatura("M01"));
//        System.out.println("     M03 - "+a.verNotaAsignatura("M03"));
//        System.out.println("     M05 - "+a.verNotaAsignatura("M05"));
//        
//        System.out.println("INFORME: ");
//        System.out.print(a.verInforme());
//        
//        
//        
//        // Consultar asignaturas
//        
//        System.out.println();
//        System.out.println("          ASIGNATURAS");
//        System.out.println("          ===========");
//        
//        System.out.println(huguet.informeAsignatura("M01"));
//        System.out.println(huguet.informeAsignatura("M02"));
//        System.out.println(huguet.informeAsignatura("M03"));
//        
//        
//        // Consultar aulas
//        
//        System.out.println();
//        System.out.println("          AULAS");
//        System.out.println("          =====");
//        
//        System.out.println("El aula de M01 es ... " + huguet.verAula("M01"));
//        System.out.println("El aula de M02 es ... " + huguet.verAula("M02"));
//        System.out.println("El aula de M03 es ... " + huguet.verAula("M03"));
//        
//        System.out.println();
//        System.out.println("En el aula GIMNASIO se dan las asignaturas: ");
//        System.out.println(huguet.verAulaAsignatura("Gimnasio"));
//        System.out.println("En el aula PATIO se dan las asignaturas: ");
//        System.out.println(huguet.verAulaAsignatura("Patio"));
//        
//        
//        System.out.println();
//        System.out.println("          CURSO");
//        System.out.println("          =====");
//        
//        System.out.println("Los alumnos de DAM 1 son:");
//        System.out.print(huguet.verAlumnosCurso("DAM 1"));
//        System.out.println("Los alumnos de ASIX 2 son:");
//        System.out.print(huguet.verAlumnosCurso("ASIX 2"));
//        
        
        
        
    }

}
