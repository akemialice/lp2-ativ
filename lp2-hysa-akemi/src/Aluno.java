import java.util.*;
/*
Akemi Alice - SP304484X
Hysabelly Nunes - SP3044742 
*/
public class Aluno {
	private String nome;
	private String numeroMatricula;
	private String instrutor;
	private String turno;
	private List<String> materias; 
	private Set<Aluno> alunos = new HashSet<>();
	
	  Aluno(String nome, String numeroMatricula, String instrutor, String turno) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		
	    this.nome = nome;
	    this.turno = turno;
	    this.numeroMatricula = numeroMatricula;
	    this.instrutor = instrutor;
	    this.materias = new ArrayList<String>();
	  }
	  
	  public void addMaterias(String materia) {
		    materias.add(materia);
		  }

	  public void addMaterias(List<String> materiasNovas) {
			  materias.addAll(materiasNovas); 
		  }

	  public void removerElem() {
			  materias.clear();
		  }

	  public List<String> getMaterias() {
		    return materias;
		  }
	  public String toString() {
		   return this.nome;
		  }
		  
	  public String getNumeroMatricula() {
		    return this.numeroMatricula;
		  }

	  public int getTamanho() {
		    return materias.size();
		  }
	  
	  public String getInstrutor() {
		    return this.instrutor;
		  }

	  public String getTurno() {
		    return this.turno;
		  }
	  
		public boolean estaMatriculado(Aluno aluno) {
			return this.alunos.contains(aluno);
		}
	}

