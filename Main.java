import Bootcamp;
import Curso;
import Dev;
import Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsa = new Dev();
        devIsa.setNome("Isa");
        devIsa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isa:" + devIsa.getConteudosInscritos());
        devIsa.progredir();
        devIsa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Isa:" + devIsa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Isa:" + devIsa.getConteudosConcluidos());
        System.out.println("XP:" + devIsa.calcularTotalXp());

        System.out.println("-------");

        Dev Andre = new Dev();
        Andre.setNome("Andre");
        Andre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andre:" + Andre.getConteudosInscritos());
        Andre.progredir();
        Andre.progredir();
        Andre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andre:" + Andre.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Andre:" + Andre.getConteudosConcluidos());
        System.out.println("XP:" + Andre.calcularTotalXp());

    }

}