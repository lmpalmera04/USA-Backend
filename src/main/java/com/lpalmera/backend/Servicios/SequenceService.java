package com.lpalmera.backend.Servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpalmera.backend.Documentos.Secuencia;
import com.lpalmera.backend.Repositorios.RepositorioSecuencia;

@Service
public class SequenceService {

	@Autowired
	private RepositorioSecuencia sequenceRepository;

	public Integer next(String document) {
		Secuencia sequence;
		Optional<Secuencia> optionalSequence = sequenceRepository.findById(document);
		if (optionalSequence.isPresent()) {
			sequence = optionalSequence.get();
			sequence.increment();
		} else {
			sequence = new Secuencia(document, 1);
		}
		sequenceRepository.save(sequence);
		return sequence.getValue();
	}

}
