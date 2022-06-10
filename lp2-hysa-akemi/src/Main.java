import java.util.*;

public class Main {
  public static void main(String args[]) {

    //declarando aluno
    Aluno aluno1 = new Aluno("Akemi Alice", "12345", "Márcio Gomes","Medicina Veterinária", "Manhã", "Universidade Federal de São Paulo");
    aluno1.addMaterias("Anatomia dos seres vivos"); 
    aluno1.addMaterias("Estudo dos seres vivos");
    
    Aluno aluno2 = new Aluno("Hysabelly Nunes", "67890","Júlia Fernandez","Nutrição", "Noite", "Universidade Federal de São Paulo");
    aluno2.addMaterias("Planejamento Alimentar"); 
    aluno2.addMaterias("Técnica Dietética");
    aluno2.addMaterias("Educação Nutricional");
    
    //exibindo os alunos cadastrados
    Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
    mapa.put("Akemi Alice", aluno1);
    mapa.put("Hysabelly Nunes", aluno2);
    System.out.println(mapa);

    System.out.println("\n");
    System.out.println("========== Ficha Cadastral ==========");
        System.out.println("> Universidade Federal de São Paulo <");
  
    //dados dos alunos: nome, matéria, matrícula, instrutor, curso, turno e instituição
    System.out.println("\n");
    
    Collection<Aluno> alunos = mapa.values(); 
    for (Aluno aluno : alunos) {
      System.out.println("Nome do aluno(a): " + aluno);
      System.out.println("Número da matricula: " + aluno.getNumeroMatricula());
      System.out.println("Instrutor da matéria: " + aluno.getInstrutor());
      System.out.println("Cursando: " + aluno.getCurso());
      System.out.println("Turno: " + aluno.getTurno());
      System.out.println("Matérias inscritas:" + aluno.getMaterias());
      System.out.println("Instituição de ensino: " + aluno.getInstituicao());
      System.out.println("Quantidade de matérias inscrito(a): " + aluno.getTamMat());
      //buscando por index - matéria posição 0
       System.out.println("1º matéria inscrita: " + aluno.buscar(0));
      System.out.println("\n");
    }
    
    //removendo aluno: Akemi Alice
    while(alunos.iterator().hasNext()) {
      if(alunos.contains(aluno1))
        alunos.remove(aluno1);
      break;
    }

    System.out.println("===== Alunos(a) removidos: =====");
    System.out.println("\n");
    System.out.printf(aluno1.toString());

    //exibindo lista atualizada de alunos
    System.out.println("\n");
    System.out.println("===== Lista atualizada de alunos(a) =====");
    System.out.println("\n");
    System.out.println(mapa);
    System.out.println("\n");

    System.out.println("===== Busca por alunos(a): =====");
    System.out.println("\n");
      
    System.out.println("O aluno " + aluno1.getNome() + " está matriculado?");
 	System.out.println(aluno1.estaMatriculado(aluno1));
	
  }
}
