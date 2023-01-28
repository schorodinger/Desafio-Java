import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");

        //System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp. getConteudos().add(curso1);
        bootcamp. getConteudos().add(mentoria);

        Dev devJota = new Dev();
        devJota.setNome("Jota");
        devJota.inscreverBootcmp(bootcamp);

        System.out.println("Coteudos Inscritos Jota" + devJota.getConteudosInscritos());

        devJota.progredir();

        System.out.println("Coteudos Inscritos Jota" + devJota.getConteudosInscritos());
        System.out.println("Coteudos Cocluidos Jota" + devJota.getConteudosConcluidos());
        System.out.println("Xp:" + devJota.calcularXp());


    }
}
