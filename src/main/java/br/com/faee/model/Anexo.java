package br.com.faee.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Anexo {

	private BigDecimal total;
	private Set<Grupo> grupos;

	public Anexo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anexo(BigDecimal total, Set<Grupo> grupos) {
		super();
		this.total = total;
		this.grupos = grupos;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Set<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	public void addGrupo(Grupo g) {
		if (grupos == null) {
			grupos = new HashSet<Grupo>();
		}
		if (g != null) {
			grupos.add(g);
		}
	}

	public void removeGrupo(Grupo g) {
		if (grupos != null && g != null) {
			grupos.remove(g);
		}
	}

	public void calculTotal() {
		total = BigDecimal.ZERO;
		if (grupos != null) {
			for (Grupo g : grupos) {
				total = total.add(g.getTotal());

			}
		}
	}
	

}
