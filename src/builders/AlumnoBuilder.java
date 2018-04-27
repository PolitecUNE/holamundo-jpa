package builders;

import model.Contacto;
import java.lang.Integer;
import java.util.Arrays;
import model.Usuario;
import java.lang.String;
import model.Domicilio;
import java.util.Date;
import model.Alumno;
import model.Asignacion;


public class AlumnoBuilder {
    private Alumno elemento;
    private AlumnoBuilder(){}

    public static AlumnoBuilder umAlumno() {
        AlumnoBuilder builder = new AlumnoBuilder();
        inicializarDadosPadroes(builder);
        return builder;
    }

    public static void inicializarDadosPadroes(AlumnoBuilder builder) {
        builder.elemento = new Alumno();
        Alumno elemento = builder.elemento;

        
        elemento.setIdAlumno(0);
        elemento.setNombre("Alumno ByBuilder");
        elemento.setApellidoPaterno(" apellidoByBuilder");
        elemento.setApellidoMaterno("");
        elemento.setGenero("");
        elemento.setFechaNacimiento(null);
        elemento.setVersion(0);
        elemento.setDeleted(0);
        elemento.setAsignacionList(null);
        elemento.setContacto(null);
        elemento.setDomicilio(null);
        elemento.setUsuario(null);
    }

    public AlumnoBuilder comIdAlumno(Integer param) {
        elemento.setIdAlumno(param);
        return this;
    }

    public AlumnoBuilder comNombre(String param) {
        elemento.setNombre(param);
        return this;
    }

    public AlumnoBuilder comApellidoPaterno(String param) {
        elemento.setApellidoPaterno(param);
        return this;
    }

    public AlumnoBuilder comApellidoMaterno(String param) {
        elemento.setApellidoMaterno(param);
        return this;
    }

    public AlumnoBuilder comGenero(String param) {
        elemento.setGenero(param);
        return this;
    }

    public AlumnoBuilder comFechaNacimiento(Date param) {
        elemento.setFechaNacimiento(param);
        return this;
    }

    public AlumnoBuilder comVersion(int param) {
        elemento.setVersion(param);
        return this;
    }

    public AlumnoBuilder comDeleted(int param) {
        elemento.setDeleted(param);
        return this;
    }

    public AlumnoBuilder comListaAsignacionList(Asignacion... params) {
        elemento.setAsignacionList(Arrays.asList(params));
        return this;
    }

    public AlumnoBuilder comContacto(Contacto param) {
        elemento.setContacto(param);
        return this;
    }

    public AlumnoBuilder comDomicilio(Domicilio param) {
        elemento.setDomicilio(param);
        return this;
    }

    public AlumnoBuilder comUsuario(Usuario param) {
        elemento.setUsuario(param);
        return this;
    }

    public Alumno agora() {
        return elemento;
    }
}
