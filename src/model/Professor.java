package model;

public class Professor extends Pessoa{
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}
	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}
	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}
	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}
	@Override
	public String getBairro() {
		// TODO Auto-generated method stub
		return super.getBairro();
	}
	@Override
	public void setBairro(String bairro) {
		// TODO Auto-generated method stub
		super.setBairro(bairro);
	}
	@Override
	public int getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}
	@Override
	public String getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}
	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		super.setSexo(sexo);
	}
	@Override
	public void setCpf(int cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	private Integer id;
	private String materia;
	private String instituicao;
	private String formacao;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	
}
