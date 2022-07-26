package br.com.apiracas.apiracas.repository;

import br.com.apiracas.apiracas.model.Raca;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RacaRepository extends MongoRepository<Raca, String> {
}
