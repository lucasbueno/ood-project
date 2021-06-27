package br.com.lucasbueno.steam.entities;

public class Documento {
	private int porcentagemTintaPreta;
	private int porcentagemTintaColorida;

	public Documento(int porcentagemTintaPreta, int porcentagemTintaColorida) {
		super();
		this.porcentagemTintaPreta = porcentagemTintaPreta;
		this.porcentagemTintaColorida = porcentagemTintaColorida;
	}

	public int getPorcentagemTintaPreta() {
		return porcentagemTintaPreta;
	}

	public void setPorcentagemTintaPreta(int porcentagemTintaPreta) {
		this.porcentagemTintaPreta = porcentagemTintaPreta;
	}

	public int getPorcentagemTintaColorida() {
		return porcentagemTintaColorida;
	}

	public void setPorcentagemTintaColorida(int porcentagemTintaColorida) {
		this.porcentagemTintaColorida = porcentagemTintaColorida;
	}

}
