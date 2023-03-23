import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import javax.swing.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Inicialização dos cursos do Bootcamp Java
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso do básico ao avançado em Java.");
        cursoJava.setCargaHoraria(30);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Curso Spring");
        cursoSpring.setDescricao("Curso do básico ao intermediário com Spring");
        cursoSpring.setCargaHoraria(12);

        Mentoria mentoriaMaven = new Mentoria();
        mentoriaMaven.setTitulo("Mentoria de Java com Maven");
        mentoriaMaven.setDescricao("Uma mentoria de 2 horas de como iniciar o seu projeto Maven.");
        mentoriaMaven.setData(LocalDate.now());

        // Inicialização dos cursos do Bootcamp JavaScript
        Curso cursoHTML = new Curso();
        cursoHTML.setTitulo("Curso de HTML5");
        cursoHTML.setDescricao("Curso do básico ao intermediário em HTML");
        cursoHTML.setCargaHoraria(15);

        Curso cursoCSS = new Curso();
        cursoCSS.setTitulo("Curso de CSS3");
        cursoCSS.setDescricao("Curso de CSS com Grid e Flexbox");
        cursoCSS.setCargaHoraria(12);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso de JavaScript");
        cursoJavaScript.setDescricao("Básico de JavaScript");
        cursoJavaScript.setCargaHoraria(20);

        Mentoria mentoriajQuery = new Mentoria();
        mentoriajQuery.setTitulo("Mentoria de jQuery");
        mentoriajQuery.setDescricao("Como utilizar o jQuery para simplificar códigos");
        mentoriajQuery.setData(LocalDate.now());

        // Inicialização dos Bootcamps
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoSpring);
        bootcampJava.getConteudos().add(mentoriaMaven);

        Bootcamp bootcampJavaScript = new Bootcamp();
        bootcampJavaScript.setNome("Bootcamp Front-End Developer");
        bootcampJavaScript.setDescricao("Um Bootcamp para te ensinar do básico ao intermediário do Front-End.");
        bootcampJavaScript.getConteudos().add(cursoHTML);
        bootcampJavaScript.getConteudos().add(cursoCSS);
        bootcampJavaScript.getConteudos().add(cursoJavaScript);
        bootcampJavaScript.getConteudos().add(mentoriajQuery);

        // Inicialização dos Devs
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        //System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampJavaScript);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----");
        //System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
