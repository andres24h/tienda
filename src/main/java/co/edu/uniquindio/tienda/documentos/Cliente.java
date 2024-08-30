package co.edu.uniquindio.tienda.documentos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document("clientes")
@NoArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente extends Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String cedula;
    private String nombre;
    private String email;
    private List<String> telefonos;

    @Builder
    public Cliente(String cedula, String nombre, String email, List<String> telefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.telefonos = telefonos;
    }
}
