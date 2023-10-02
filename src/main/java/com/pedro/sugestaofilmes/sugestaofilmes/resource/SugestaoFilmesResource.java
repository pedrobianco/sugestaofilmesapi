package com.pedro.sugestaofilmes.sugestaofilmes.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class SugestaoFilmesResource{
	
	@PostMapping("/v1/consultaFilmes")

	public ResponseEntity<String> consultaFilmes(@RequestParam("generoFilme") String generoFilme){
		
		return null;
		
	}

}
