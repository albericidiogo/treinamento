package br.com.faee.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class SubGrupo {

	private String descricao;
	private BigDecimal total;
	private Set<Linha> linhas;

	public SubGrupo() {
		super();
	}

	public SubGrupo(String descricao, BigDecimal total, Set<Linha> linhas) {
		super();
		this.descricao = descricao;
		this.total = total;
		this.linhas = linhas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Set<Linha> getLinhas() {
		return linhas;
	}

	public void setLinhas(Set<Linha> linhas) {
		this.linhas = linhas;
	}
	
	public void addLinha(Linha l) {
		if (linhas == null) {
			linhas = new HashSet<Linha>();
		}
		if (l != null) {
			linhas.add(l);
		}
	}

	public void removeLinha(Linha l) {
		if (linhas != null && l != null) {
			linhas.remove(l);
		}
	}

	public void calculaTotal() {
		total = BigDecimal.ZERO;
		if (linhas != null) {
			for (Linha l : linhas) {
				total = total.add(l.getValor());
			}
		}

	}
	@Override
	public int hashCode() {
		return descricao.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SubGrupo)) {
			return false;
		}
		SubGrupo bean = (SubGrupo) obj;
		return bean.getDescricao().equals(this.getDescricao());
	}

}
