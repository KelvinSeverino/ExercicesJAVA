package RevisaoClasses;

public class Professor extends Pessoa{
	public int numeroMatricula;
	public String[] turmas;
	
	public Professor(String nome, int numeroMatricula) {
		super(nome);
			this.numeroMatricula = numeroMatricula;
			turmas = new String[5];
	}
	
	public void setDisciplinas(String[] turmas) {
		this.turmas = turmas;
	}
}
