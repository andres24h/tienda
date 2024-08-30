package co.edu.uniquindio.tienda.documentos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Pago {

    private String codigo;
    private String estado;
    private String metodoPago;
    private float totalPagado;
    private LocalDateTime fecha;
}
