import bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Santander 2024 - Backend com Java");
        curso1.setDescricao("Curso do Bootcamp da DIO");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Desenvolvimento Java com IA");
        curso2.setDescricao("Curso do Bootcamp da DIO");
        curso2.setCargaHoraria(60);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria java POO");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcampJava =  new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devManu = new Dev();
        devManu.setNome("Manu");
        devManu.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Manu: " + devManu.getConteudosInscritos());
        devManu.progredir();
        devManu.progredir();
        devManu.progredir();
        devManu.progredir();
        System.out.println("Conteúdos Inscritos Manu: " + devManu.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Manu: " + devManu.getConteudosConcluidos());
        System.out.println("XP: " + devManu.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        bootcampJava.getDevsInscritos().add(devManu);
        bootcampJava.getDevsInscritos().add(devCamila);

        System.out.println(bootcampJava.getDevsInscritos());
    }
}
