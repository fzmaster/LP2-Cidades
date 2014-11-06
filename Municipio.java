
public class Municipio {
	private String estado;
	private String cod_estado;
	private String cod_municipio;
	private String nome_municipio;
	private String populacao;
	public String getEstado() {
		return estado;
	}
	@Override
	public String toString() {
		return "Municipio [estado=" + estado + ", cod_estado=" + cod_estado
				+ ", cod_municipio=" + cod_municipio + ", nome_municipio="
				+ nome_municipio + ", populacao=" + populacao + "]\n";
	}
	public Municipio(String estado, String cod_estado, String cod_municipio,
			String nome_municipio, String populacao) {
		super();
		this.estado = estado;
		this.cod_estado = cod_estado;
		this.cod_municipio = cod_municipio;
		this.nome_municipio = nome_municipio;
		this.populacao = populacao;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCod_estado() {
		return cod_estado;
	}
	public void setCod_estado(String cod_estado) {
		this.cod_estado = cod_estado;
	}
	public String getCod_municipio() {
		return cod_municipio;
	}
	public void setCod_municipio(String cod_municipio) {
		this.cod_municipio = cod_municipio;
	}
	public String getNome_municipio() {
		return nome_municipio;
	}
	public void setNome_municipio(String nome_municipio) {
		this.nome_municipio = nome_municipio;
	}
	public String getPopulacao() {
		return populacao;
	}
	public void setPopulacao(String populacao) {
		this.populacao = populacao;
	}
	
	

}
