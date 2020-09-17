package br.com.gpa.siac.application.model;

public class NotaCredito {

	
	
	
	public NotaCredito() {

	}
	public NotaCredito(Integer versaoLayout, Integer codEmpresa, 
			Integer codLoja, Integer numTerminal, String dataMovto, Integer numeroCupom,
			String numDocumento,String numPrepedido,Double valorDocumento,Integer tipoOperacao,
			String codOperador) {
		
		super();
		this.versaoLayout = versaoLayout;
		this.codEmpresa = codEmpresa;
		this.codLoja = codLoja;
		this.numTerminal = numTerminal;
		this.dataMovto = dataMovto;
		this.numeroCupom = numeroCupom;
		this.numDocumento = numDocumento;
		this.numPrepedido = numPrepedido;
		this.valorDocumento = valorDocumento;
		this.tipoOperacao = tipoOperacao;
		this.codOperador = codOperador ;
	}

	private int versaoLayout;
	private int codEmpresa;
	private int codLoja;
	private int numTerminal;
	private String dataMovto;
	private int numeroCupom;
	private String numDocumento;
	private String numPrepedido;
	private Double valorDocumento;
	private int tipoOperacao;
	private String codOperador;

	public int getVersaoLayout() {
		return versaoLayout;
	}

	public void setVersaoLayout(int versaoLayout) {
		this.versaoLayout = versaoLayout;
	}

	public int getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public int getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(int codLoja) {
		this.codLoja = codLoja;
	}

	public int getNumTerminal() {
		return numTerminal;
	}
	public void setNumTerminal(int numTerminal) {
		this.numTerminal = numTerminal;
	}
	
	public String getDataMovto() {
		return dataMovto;
	}
	
	public void setDataMovto(String DataMovto) {
		this.dataMovto = dataMovto;
	}

	public int getNumeroCupom() {
		return numeroCupom;
	}

	public void setNumeroCupom(int numenoCupom) {
		this.numeroCupom = numeroCupom;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNumPrepedido() {
		return numPrepedido;
	}

	public void setNumPrepedido(String numPrepedido) {
		this.numPrepedido = numPrepedido;
	}

	public Double getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(Double valorDocumento) {
		this.valorDocumento = valorDocumento;
	}
	
	public int getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(int tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	public String getCodOperador() {
		return codOperador;
	}

	public void setCodOperador(String codOperador) {
		this.codOperador = codOperador;
	}
}




