package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.documentos.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends MongoRepository<Cliente, String> {
}
