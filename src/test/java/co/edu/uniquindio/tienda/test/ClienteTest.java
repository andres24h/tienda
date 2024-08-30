package co.edu.uniquindio.tienda.test;

import co.edu.uniquindio.tienda.documentos.Cliente;
import co.edu.uniquindio.tienda.repositorios.ClienteRepo;
import org.bson.assertions.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@SpringBootTest
public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void crearCliente() {

        Cliente cliente = Cliente.builder()
                .cedula("9736736")
                .nombre("andres")
                .email("andres@email.com")
                .telefonos( List.of("3117188224", "7408238") ).build();

        Cliente registro = clienteRepo.save(cliente);

        Assertions.assertNotNull(registro);
    }
}
