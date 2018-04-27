package test;
import static builders.AlumnoBuilder.*;
import model.Alumno;

public class TesteBuilder
{  

    public static void main(String[] args)
    {
        Alumno alumno = umAlumno().agora();
       // System.out.println(alumno.toString());
///
        Alumno alumnoNombreApellido = 
                umAlumno()
                .comNombre("Juan")
                .comApellidoPaterno("Perez")
                .comApellidoMaterno("Gonzalez")
                .agora();

       System.out.println(alumnoNombreApellido.getNombre()+", "
               +alumnoNombreApellido.getApellidoPaterno()+", "
               +alumnoNombreApellido.getApellidoMaterno() +". ");
    }

}
