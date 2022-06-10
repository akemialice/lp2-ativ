import java.util.*;
/*
Akemi Alice - SP304484X
Hysabelly Nunes - SP3044742 
*/

// variáveis
public class Aluno {
	private String nome;
	private String numeroMatricula;
	private String instrutor;
	private String turno;
  private String curso;
  private String semestre;
  private String instituicao;
	private List<String> materias; 
	private Set<Aluno> alunos = new HashSet<>();

  // exceção em java 
  Aluno(String nome, String numeroMatricula, String instrutor, String curso, String semestre, String turno, String instituicao) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
	    this.nome = nome;
	    this.turno = turno;
    	this.curso = curso;
      this.semestre = semestre;
      this.instituicao = instituicao;
	    this.numeroMatricula = numeroMatricula;
	    this.instrutor = instrutor;
	    this.materias = new ArrayList<String>();
	    }

    // nome  
  	public String getNome() {
		return nome;
	}
    // adicionado matérias 
	  public void addMaterias(List<String> materiasNovas) {
			  materias.addAll(materiasNovas); 
		  }
	
	  public void addMaterias(String materia) {
		    materias.add(materia);
		  }
  
    // remover matérias 
	  public void removerMaterias() {
			  materias.clear();
		  }

	  public List<String> getMaterias() {
		    return materias;
		  }

    // quantidade de matérias
	  public int getTamMat() {
		    return materias.size();
		  }

    // nome do aluno
	  public String toString() {
		   return this.nome;
		  }
   
    // número da matrícula
	  public String getNumeroMatricula() {
		    return this.numeroMatricula;
		  }

    // instrutor da matéria
	  public String getInstrutor() {
		    return this.instrutor;
		  }

    // turno do aluno
	  public String getTurno() {
		    return this.turno;
		  }

    // instituição do aluno
	  public String getInstituicao() {
		    return this.instituicao;
		  }

    // curso do aluno
	  public String getCurso() {
		    return this.curso;
		  }
  
    // semestre do aluno
	  public String getSemestre() {
		    return this.semestre;
		  }

    // saber se o aluno está matriculado 
		public boolean estaMatriculado(Aluno aluno) {
			return this.alunos.contains(aluno);
		  }

    // buscando matéria posiçao 0
  		public String buscar(int index) {
			return materias.get(index);
      }
		}
      
