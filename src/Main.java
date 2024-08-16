import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(20);

        Conteudo conteudo = new Curso(); //polimorfismo
        Conteudo conteudo1 = new Mentoria(); //polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Zelda");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Zelda: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluidos Zelda: " + dev1.getConteudosConcluidos());
        System.out.println("Total XP Zelda: " + dev1.calcularTotalXP());
        System.out.println("Conteúdos restantes Zelda: " + dev1.getConteudosInscritos());


        Dev dev2 = new Dev();
        dev2.setNome("Fiona");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Fiona: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Fiona: " + dev2.getConteudosConcluidos());
        System.out.println("Total XP Fiona: " + dev2.calcularTotalXP());
    }
}