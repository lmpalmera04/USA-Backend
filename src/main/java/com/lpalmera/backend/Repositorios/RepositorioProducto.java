package com.lpalmera.backend.Repositorios;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.lpalmera.backend.Documentos.Producto;

@Repository
public interface RepositorioProducto extends MongoRepository<Producto, Integer> {

	@Query(value = "{ available: true, name: { $regex: '?0', $options: 'i' } }")
	public Iterable<Producto> findAvailableByNameLike(String name);

	@Query(value = "{ available: true, category: '?0' }")
	public Iterable<Producto> findAvailableByCategory(String category);

	@Query(value = "{ available: true, price: { $lte: ?0 } }")
	public Iterable<Producto> findAvailableByPriceLessThanOrEqualTo(Float price);

	@Aggregation(pipeline = "{ $group : { _id : $category } }")
	public Iterable<String> findAllCategories();

}
