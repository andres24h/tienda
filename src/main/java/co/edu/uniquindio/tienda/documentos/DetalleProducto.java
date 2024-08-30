package co.edu.uniquindio.tienda.documentos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DetalleProducto {

    private String codigoProducto;
    private float precio;
    private int cantidad;
}
