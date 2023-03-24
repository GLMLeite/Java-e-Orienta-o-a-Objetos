import java.util.ArrayList;
import java.util.List;

public class Campus implements ICampus {
	private List<Pessoa> pessoas = new ArrayList<>();

	@Override
	public void cadastrar(Pessoa usuario) {
		this.pessoas.add(usuario);

	}

	@Override
	public List<Aluno> getAlunos() {
		ArrayList<Aluno> alunos = new ArrayList<>();
		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i) instanceof Aluno) {
				alunos.add((Aluno) this.pessoas.get(i));

			}
		}
		return alunos;
	}

	@Override
	public List<Professor> getProfessores() {
		ArrayList<Professor> professores = new ArrayList<>();
		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i) instanceof Professor) {
				professores.add((Professor) this.pessoas.get(i));
			}
		}
		return professores;
	}
	
	  public static void main( String args[] ) {
		  Campus charq = new Campus();
		  System.out.println(charq instanceof ICampus);
		  
	  }
	

}