package com.laroproducoes.junit.contato;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.laroproducoes.junit.model.ContatoModel;
import com.laroproducoes.junit.repository.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest //melhor testador de JPA
public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	String message= "Employee ID is null";
	
	@Before
	public void start() {
		contato = new ContatoModel("Gabriel", "011y", "9xxxxxxx9");
	}
	
	@Test (expected = RuntimeException.class)
	public void salvarComTelNulo() throws Exception {
		
		
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
	
	@Test (expected = RuntimeException.class)
	public void salvarComDddNulo() throws Exception {
		
		
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
	
	@Test (expected = RuntimeException.class)
	public void salvarComNomeNulo() throws Exception {
		
		contato.setNome(null);
		contatoRepository.save(contato);
	}
	
}//fim
