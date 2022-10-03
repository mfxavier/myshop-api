package br.com.mmb.myshop.backend.resource;

import br.com.mmb.myshop.backend.model.LineEntity;
import br.com.mmb.myshop.backend.repository.LineRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lines")
public class LineResource {
	
	@Autowired
	private LineRepository repository;
	
	@GetMapping("/listall")
	public List<LineEntity> listAll(){
		return repository.findAll();
	}
}
