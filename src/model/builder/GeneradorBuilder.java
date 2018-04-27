package model.builder;

import buildermaster.BuilderMaster;
import model.Alumno;

public class GeneradorBuilder
{
    public static void main(String[] args)
    {
        new BuilderMaster().gerarCodigoClasse(Alumno.class);
    }
}
