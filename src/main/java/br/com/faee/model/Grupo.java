package br.com.faee.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Grupo {
	private String descricao;
	private BigDecimal total;
	private Set<SubGrupo> subGrupos;

	public Grupo() {
		super();
	}

	public Grupo(String descricao, BigDecimal total, Set<SubGrupo> subGrupos) {
		super();
		this.descricao = descricao;
		this.total = total;
		this.subGrupos = subGrupos;
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

	public Set<SubGrupo> getSubGrupos() {
		return subGrupos;
	}

	public void setSubGrupos(Set<SubGrupo> subGrupos) {
		this.subGrupos = subGrupos;
	}

	public void addSubGrupo(SubGrupo s) {
		if (subGrupos == null) {
			subGrupos = new HashSet<SubGrupo>();
		}
		if (s != null) {
			subGrupos.add(s);
		}
	}

	public void removeSubGrupo(SubGrupo s) {
		if (subGrupos != null && s != null) {
			subGrupos.remove(s);

		}
	}

	public void calculaTotal() {
		total = BigDecimal.ZERO;
		calculaTotal();
		if (subGrupos != null) {
			for (SubGrupo s : subGrupos) {
				total = total.add(s.getTotal());
			}
		}

	}
}
