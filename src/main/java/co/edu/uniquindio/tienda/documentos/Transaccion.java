package co.edu.uniquindio.tienda.documentos;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Document("transacciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Transaccion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String Cliente;
    private Pago pago;
    private LocalDateTime fecha;
    private List<DetalleProducto> productos;
}
