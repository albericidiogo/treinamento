package br.com.faee.testes;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import br.com.faee.model.Grupo;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import br.com.faee.model.Linha;
import br.com.faee.model.SubGrupo;

@SuppressWarnings("deprecation")
public class Testes {

	@Test
	public void deveAdicionarLinhaSubGrupo() {
		SubGrupo subGrupo = new SubGrupo();
		Linha linha = new Linha("l1", new BigDecimal(20));

		assertNull(subGrupo.getLinhas());

		subGrupo.addLinha(linha);

		assertNotNull(subGrupo.getLinhas());

	}

	@Test
	public void naoDeveAdicionarLinhasIguais() {
		SubGrupo subGrupo = new SubGrupo();

		Linha linha = new Linha("l1", new BigDecimal(20));
		Linha linha1 = new Linha("l1", new BigDecimal(20));
		subGrupo.addLinha(linha);
		subGrupo.addLinha(linha1);

		assertEquals(1, subGrupo.getLinhas().size());

	}

	@Test
	public void testaTotalSubGrupo() {
		SubGrupo subGrupo = new SubGrupo();
		Linha linha = new Linha("l1", new BigDecimal(20));
		Linha linha2 = new Linha("l2", new BigDecimal(20));
		Linha linha3 = new Linha("l3", new BigDecimal(20));

		subGrupo.addLinha(linha);
		subGrupo.addLinha(linha2);
		subGrupo.addLinha(linha3);

		subGrupo.calculaTotal();

		assertEquals(new BigDecimal(60), subGrupo.getTotal());
		

	}

	@Test
	public void deveRemoverLinha() {
		SubGrupo subGrupo = new SubGrupo();

		Linha linha = new Linha("l1", new BigDecimal(20));
		Linha linha2 = new Linha("l2", new BigDecimal(20));
		Linha linha3 = new Linha("l3", new BigDecimal(20));
		assertNull(subGrupo.getLinhas());

		subGrupo.addLinha(linha);
		subGrupo.addLinha(linha2);
		subGrupo.addLinha(linha3);

		Integer t = subGrupo.getLinhas().size();

		subGrupo.removeLinha(linha2);

		assertEquals(t - 1, subGrupo.getLinhas().size());

	}

	@Test
	public void deveAdicionarSubGrupo(){
		
		Grupo grupo = new Grupo();
		
		Linha linha = new Linha("l1", new BigDecimal(20));
		Set linhas =new HashSet<Linha>();
		linhas.add(linha);
		SubGrupo subGrupo =  new SubGrupo("g1", new BigDecimal(20),linhas);
		
		assertNull(grupo.getSubGrupos());
		
		grupo.addSubGrupo(subGrupo);
		
		assertNotNull(grupo.getSubGrupos());

				
	}
	
	@Test
	public void deveRemoverSubgrupo(){
		Grupo grupo = new Grupo();
		
		Linha linha = new Linha("l1", new BigDecimal(20));
		Set linhas =new HashSet<Linha>();
		linhas.add(linha);
		SubGrupo subGrupo =  new SubGrupo("g1", new BigDecimal(20),linhas);
		
		assertNull(grupo.getSubGrupos());
		
		grupo.addSubGrupo(subGrupo);
		
		assertNotNull(grupo.getSubGrupos());
		
	
	}
	
	
	
}



