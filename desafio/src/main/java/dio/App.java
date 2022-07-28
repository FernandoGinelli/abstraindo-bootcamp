package dio;

import java.time.LocalDate;

import dio.model.Curso;
import dio.model.Mentoria;


public class App 
{
    public static void main( String[] args )
    {
        Curso curso = new Curso();
        curso.setTitulo("Spring boot");
        curso.setDescricao("descricao");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
    }
}
