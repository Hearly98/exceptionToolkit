package com.moneda.utils;

import lombok.Getter;

@Getter
public enum HttpStatusResponse {

    OK("Proceso exitoso.", 200),
    CREATED("Creación exitosa.", 201),
    UPDATED("Actualización exitosa.", 200),
    DELETED("Eliminación exitosa.", 200),
    BAD_REQUEST("Hubo un error en su petición.", 400),
    NOT_FOUND("No existen datos.", 404),
    INTERNAL_ERROR("Error en el servidor.", 500),
    CONFLICT("Hubo un conflicto con su petición.", 409);

    private String key;
    private Integer code;
    private HttpStatusResponse(String key, Integer code){
        this.key = key;
        this.code = code;
    }
}
