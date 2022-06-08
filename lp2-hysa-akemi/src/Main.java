import java.util.*;

public class Main {
  public static void main(String args[]) {

    Aluno aluno1 = new Aluno("Akemi Alice", "3333", "Márcio", "Manhã");
    aluno1.addMaterias("FIS"); 
    aluno1.addMaterias("MAT");
    
    Aluno aluno2 = new Aluno("Hysabelly Nunes", "1234","Júlia", "Noite");
    aluno2.addMaterias("LP2"); 
    aluno2.addMaterias("LP3");
    aluno2.addMaterias("TPO");

    
    System.out.println("====================");
    Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
    mapa.put("Akemi Alice", aluno1);
    mapa.put("Hysabelly Nunes", aluno2);
    System.out.println("Ordem alfabética, map:");
    System.out.println(mapa);

    
    System.out.println("====================");
    Collection<Aluno> alunos = mapa.values(); 
    for (Aluno aluno : alunos) {
      System.out.println("Nome do aluno(a): " + aluno);
      System.out.println("Número da matricula: " + aluno.getNumeroMatricula());
      System.out.println("Instrutor: " + aluno.getInstrutor());
      System.out.println("Turno: " + aluno.getTurno());
    }
    
    
    while(alunos.iterator().hasNext()) {
      if(alunos.contains(aluno1))
        alunos.remove(aluno1);
      break;
    }
    System.out.println("========== Removendo... ==========");
    System.out.printf("Aluno(a) removido: "+ aluno1.toString());
   
    
    System.out.println("\n==================== ");
    System.out.print("Matérias do(a) aluno(a) 1 -> " +aluno1.toString() +": "); 
    Iterator iterator01 = aluno1.getMaterias().iterator();
    mostrarMaterias(iterator01, aluno1);
    
    System.out.print("Matérias do(a) aluno(a) 2 -> " +aluno2.toString() +": "); 
    Iterator iterator02 = aluno2.getMaterias().iterator();
    mostrarMaterias(iterator02, aluno2);


  }
  
 public static void mostrarMaterias(Iterator itr, Aluno aluno){
	    for(var i = aluno.getTamanho(); i > 0; i--) {
	      var elemento = itr.next();
	      if(itr.hasNext()){
	        if(i == 2)
	          System.out.print(elemento + " e ");
	        else
	          System.out.print(elemento + ", ");
	      } else {
	     System.out.print(elemento + ".\n");
	      }
	    	}	
 				}
					}
