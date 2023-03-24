import java.util.List;

public interface ICampus {

	// adiciona a pessoa na lista pessoas do campus
	public void cadastrar(Pessoa usuario);
	// retorna a lista dos alunos do campus
	public List<Aluno> getAlunos();
	// retorna a lista dos professores do campus
	public List<Professor> getProfessores();
	
}
