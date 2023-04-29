package orientacao;

import java.time.LocalDate;

import orientacao.caminho.Bootcamp;
import orientacao.caminho.Curso;
import orientacao.caminho.Dev;
import orientacao.caminho.Mentoria;

public class principal {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Iniciante");
        cursoJava.setDescricao("Neste curso, aprenda sobre o melhor da técnologia por trás da linguagem Java");
        cursoJava.setCargaHoraria(20);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uma das maiores ferramentas do Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoriaIntellij = new Mentoria();
        mentoriaIntellij.setTitulo("Mentoria IDE - Intellij");
        mentoriaIntellij.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no Intellij");
        mentoriaIntellij.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria - Mercado Java");
        mentoriaMercadoJava.setDescricao("Saiba como ser contratado usando Java");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaPlus = new Bootcamp();
        bootcampJavaPlus.setNome("Bootcamp Java Plus");
        bootcampJavaPlus.setDescricao("Neste Bootcamp aprenda sobre Java e ainda mais!");
        bootcampJavaPlus.getConteudos().add(cursoJava);
        bootcampJavaPlus.getConteudos().add(cursoSpringBoot);
        bootcampJavaPlus.getConteudos().add(mentoriaIntellij);
        bootcampJavaPlus.getConteudos().add(mentoriaMercadoJava);

        System.out.println("---------------------------------------------------------------------");

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudoInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Arthur: " + devArthur.getConteudoConcluidos());
        System.out.println("XP: " + devArthur.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devMelkih = new Dev();
        devMelkih.setNome("Melkih");
        devMelkih.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Melkih: " + devMelkih.getConteudoInscritos());
        devMelkih.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Melkih: " + devMelkih.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Melkih: " + devMelkih.getConteudoConcluidos());
        System.out.println("XP: " + devMelkih.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devJhonatan = new Dev();
        devJhonatan.setNome("Jhonatan");
        devJhonatan.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Jhonatan: " + devJhonatan.getConteudoInscritos());
        devJhonatan.progredir();
        devJhonatan.progredir();
        devJhonatan.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Jhonatan: " + devJhonatan.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Jhonatan: " + devJhonatan.getConteudoConcluidos());
        System.out.println("XP: " + devJhonatan.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }
}
