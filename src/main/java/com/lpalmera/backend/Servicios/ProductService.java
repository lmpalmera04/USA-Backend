package com.lpalmera.backend.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpalmera.backend.Documentos.Producto;
import com.lpalmera.backend.Repositorios.RepositorioProducto;

@Service
public class ProductService {

	@Autowired
	private RepositorioProducto productRepository;

	@Autowired
	private SequenceService sequenceService;

	public Iterable<Producto> findAll() {
		return productRepository.findAll();
	}

	public Iterable<Producto> findAvailableByNameLike(String name) {
		return productRepository.findAvailableByNameLike(name);
	}

	public Iterable<Producto> findAvailableByCategory(String category) {
		return productRepository.findAvailableByCategory(category);
	}

	public Iterable<Producto> findAvailableByPriceLessThanOrEqualTo(Float price) {
		return productRepository.findAvailableByPriceLessThanOrEqualTo(price);
	}

	public Iterable<String> findAllCategories() {
		return productRepository.findAllCategories();
	}

	public Producto save(Producto product) {
		if (product.getId() == null) {
			product.setId(sequenceService.next(Producto.class.getSimpleName()));
		}
		return productRepository.save(product);
	}

	public void deleteById(Integer id) {
		productRepository.deleteById(id);
	}

}
